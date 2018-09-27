(ns finn.core
  (:require [org.httpkit.server :as server]
            [org.httpkit.client :as http]
            [hickory.core :as hick]
            [hickory.select :as s]
            [compojure.core :refer [routes POST GET ANY]]
            [clojure.data.json :as json]
            [clojure.java.jdbc :as sql]))

(defonce ^:public server (atom nil))

(def db "postgresql://localhost:5432/shouter")

(defn finn-ad-url [id jobtype]
  (str "https://www.finn.no/job/" jobtype "/ad.html?finnkode=" id)
  )

(defn save-ad [ad]
  (sql/insert! db :ad (assoc '{} :id (:id ad)
                                 :jobtype (:jobtype ad)
                                 :description (:description ad)
                                 :title (:title ad)
                                 :url (finn-ad-url (:id ad) (:jobtype ad))
                                 )
               )
  (map #(sql/insert! db :descc %)
       (vec (map #(assoc '{} :key (first %)
                             :value (clojure.string/join "," (rest %))
                             :adkey (:id ad)) (:k-decription ad))))
  )


(defn merge-arrays-to-map [ks vs]
  (loop [res '{} keys ks vals vs]
    (if (= 0 (count vals))
      res
      (recur (assoc res (first keys) (first vals)) (drop 1 keys) (drop 1 vals))
      )
    )
  )

(defn hickmaptostring [items]
  (clojure.string/join "\n"
                       (flatten
                         (remove nil?
                                 (loop [col (flatten items) cnt 30]
                                   (if (and (> cnt 0) (some #(= (type %) clojure.lang.PersistentArrayMap) (flatten col)))
                                     (recur (map #(if (= (type %) clojure.lang.PersistentArrayMap) (:content %) %) (flatten col)) (dec cnt))
                                     (if (<= cnt 1) "" col))))))
  )



(defn hitcount [body]
  (-> (s/select (s/descendant (s/and (s/attr "data-controller") (s/class "visuallyhidden")))
                body) first :content first (clojure.string/split #" ") first read-string))


(defn htmlbody [url]
  (let [{:keys [status headers body error] :as resp} @(http/get url)]
    (if error
      (println "Failed, exception: " error)
      (println "HTTP GET success: " status))
    (hick/as-hickory (hick/parse body))
    ))

(defn annonser [body]
  (map :href
       (map :attrs
            (-> (s/select
                  (s/descendant
                    (s/and (s/attr "href")
                           (s/class "clickable")))
                  body))))
  )

(defn pages [body]
  (int(Math/ceil (/ (hitcount body) (dec (count (annonser body)))))))


;; 0.23 for IT Utvikling
(defn annonselinks [occupation]
  (def url (str "https://www.finn.no/job/fulltime/search.html?occupation=" occupation "&page="))
  (let [body (htmlbody (str url "1"))]
    (let [tannonser (loop [res '() cnt (pages body)]
                      (if (<= cnt 1)
                        res
                        (let [tmpa (htmlbody (str url cnt))]
                          (recur (concat res (annonser tmpa)) (dec cnt)))))]
      tannonser))
  )

(defn annonselinks-formatted [a]
  (map #(assoc '{} :jobtype (re-find #"fulltime|management|parttime" %) :id (re-find #"\d+" %)) a)
  )

(defn description [body]
  (let [items (remove nil?
                      (map :content
                           (-> (s/select
                                 (s/descendant
                                   (s/class "object-description")) body)
                               first
                               :content)))]
    (hickmaptostring items)))

(defn title [body]
  (-> (s/select (s/descendant (s/class "h1")) body)
      first
      :content
      first))

(defn keyed-description [body]
  (let [grouped (map (fn [k] (partition-by #(get (get % :attrs) :data-automation-id) k))
                     (map #(filter :content %)
                          (map :content
                               (s/select (s/descendant (s/class "r-prl")) body))))]
    (let [g2 (map flatten
                  (apply concat
                         (map (fn [v]
                                (partition 2
                                           (map (fn [v2] (map :content v2)) v)))
                              grouped))) g3 (map (fn [v] (flatten (map #(if (= (type %) clojure.lang.PersistentArrayMap) (:content %) %) v)))

                                                 g2)] (map #(remove clojure.string/blank? %) g3))))

(defn annonse [id jobtype]
  (let [url (finn-ad-url id jobtype) body (htmlbody url)]
    {:id           id
     :url          url
     :jobtype      jobtype
     :title        (title body)
     :description  (description body)
     :k-decription (keyed-description body)
     }
    ))

(defn filter-saved [ads]
  (let [s-ads (sql/query db ["select id from ad"])]
    (remove (fn [v] (some #(= (:id %) (:id v)) s-ads)) ads)
    ))




(defn save-all [occupation]
  (let [links (filter-saved (annonselinks-formatted (annonselinks (read-string occupation))))]
    (map #(save-ad (annonse (:id %) (:jobtype %))) links)
    )
  )


(defn app []
  (routes
    (GET "/parttime/:id" [id :as req]
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (annonse id "parttime"))})
    (GET "/fulltime/:id" [id :as req]
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (annonse id "fulltime"))})
    (GET "/management/:id" [id :as req]
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (annonse id "management"))})
    (GET "/annonser/:occupation" [occupation :as req]
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (annonselinks (read-string occupation)))})
    (GET "/annonserformatted/:occupation" [occupation :as req]
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (annonselinks-formatted (annonselinks (read-string occupation))))})))

(defn create-server []
  (server/run-server (app) {:port 8080}))

(defn run-server []
  (reset! server (create-server)))

(defn stop-server [server]
  (server :timeout 100))







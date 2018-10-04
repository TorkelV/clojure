(ns finn.core
  (:require [org.httpkit.server :as server]
            [org.httpkit.client :as http]
            [hickory.core :as hick]
            [hickory.select :as s]
            [compojure.core :refer [routes POST GET ANY]]
            [clojure.data.json :as json]
            [clojure.java.jdbc :as sql]
            [clojure.string :as cstr]))


(def db "postgresql://localhost:5432/shouter")


(defn finn-ad-url [id jobtype]
  (str "https://www.finn.no/job/" jobtype "/ad.html?finnkode=" id))


(defn save-ad [ad]
  (sql/insert! db :ad (assoc '{} :id (:id ad)
                                 :jobtype (:jobtype ad)
                                 :description (:description ad)
                                 :title (:title ad)
                                 :url (finn-ad-url (:id ad) (:jobtype ad))
                                 ))
  (map #(sql/insert! db :descc %)
       (vec (map #(assoc '{} :key (first %)
                             :value (cstr/join "," (rest %))
                             :adkey (:id ad)) (:k-description ad)))))


(defn hickmaptostring [items]
  (cstr/join "\n"
             (flatten
               (remove nil?
                       (loop [col (flatten items) cnt 30]
                         (if (and (> cnt 0) (some #(= (type %) clojure.lang.PersistentArrayMap) (flatten col)))
                           (recur (map #(if (= (type %) clojure.lang.PersistentArrayMap) (:content %) %) (flatten col)) (dec cnt))
                           (if (<= cnt 1) "" col)))))))


(defn hitcount [body]
  (-> (s/select (s/descendant (s/and (s/attr "data-controller") (s/class "visuallyhidden"))) body)
      first
      :content
      first
      (cstr/split #" ")
      first
      read-string))


(defn html [url]
  (let [{:keys [status headers body error] :as resp} @(http/get url)]
    (if error
      (println "Failed, exception: " error)
      (println "HTTP GET success: " status))
    (hick/as-hickory (hick/parse body))))


(defn ads [body]
  (->> body
       (s/select
         (s/descendant
           (s/and
             (s/attr "href")
             (s/class "clickable"))))
       (map :attrs)
       (map :href)))


(defn pages [body]
  (int (Math/ceil (/ (hitcount body) (dec (count (ads body)))))))


;; 0.23 for IT Utvikling
(defn ad-links [occupation]
  (let [url (str "https://www.finn.no/job/fulltime/search.html?occupation=" occupation "&page=")
        cnt (pages (html (str url 1)))]
    (->> (map #(ads (html (str url %))) (range 1 (inc cnt)))
         (apply concat))))


(defn ad-links-formatted [a]
  (map #(assoc '{} :jobtype (re-find #"fulltime|management|parttime" %) :id (re-find #"\d+" %)) a))


(defn description [body]
  (->> (map :content
            (-> (s/select (s/descendant (s/class "object-description")) body)
                first
                :content))
       (remove nil?)
       (hickmaptostring)))


(defn title [body]
  (-> (s/select (s/descendant (s/class "h1")) body)
      first
      :content
      first))


(defn keyed-description [body]
  (->> (s/select (s/descendant (s/class "r-prl")) body)
       (map :content)
       (map #(filter :content %))
       (map (fn [k] (partition-by #(get (get % :attrs) :data-automation-id) k)))
       (map (fn [v] (partition 2 (map #(map :content %) v))))
       (apply concat)
       (map flatten)
       (map (fn [v] (flatten (map #(if (= (type %) clojure.lang.PersistentArrayMap) (:content %) %) v))))
       (map #(remove cstr/blank? %))))


(defn advert [id jobtype]
  (let [url (finn-ad-url id jobtype)
        body (html url)]
    {:id            id
     :url           url
     :jobtype       jobtype
     :title         (title body)
     :description   (description body)
     :k-description (keyed-description body)
     }))


(defn difference [a b]
  (remove (fn [v] (some #(= (:id %) (:id v)) b)) a))


(defn filter-saved [adverts]
  (difference adverts (sql/query db ["select id from ad"])))


(defn save-all [occupation]
  (->> occupation
       read-string
       ad-links
       distinct
       ad-links-formatted
       filter-saved
       (map #(advert (:id %) (:jobtype %)))
       (map save-ad)))


(defn app []
  (routes
    (GET "/parttime/:id" [id :as req]
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (advert id "parttime"))})
    (GET "/fulltime/:id" [id :as req]
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (advert id "fulltime"))})
    (GET "/management/:id" [id :as req]
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (advert id "management"))})
    (GET "/ads/:occupation" [occupation :as req]
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (ad-links (read-string occupation)))})
    (GET "/adsformatted/:occupation" [occupation :as req]
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (ad-links-formatted (ad-links (read-string occupation))))})))


(defn create-server []
  (server/run-server (app) {:port 8080}))


;;query stuff
(defn q-all-ads []
  (sql/query db ["select * from ad"]))


(defn q-add-descriptions [a]
  (map #(assoc % :k-description (sql/query db ["select key, value from descc where adkey=?" (:id %)])) a))


;;(finn.core/all-ads-search #"(?i)java[^s]")
(defn all-ads-search [regex]
  (->> (q-all-ads)
       (remove #(nil? (re-find regex (:description %))))
       (q-add-descriptions)))
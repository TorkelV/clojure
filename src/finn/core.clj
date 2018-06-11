(ns finn.core
  (:require [org.httpkit.server :as server]
            [org.httpkit.client :as http]
            [hickory.core :as hick]
            [hickory.select :as s]
            [compojure.core :refer [routes POST GET ANY]]))

(defonce ^:private server (atom nil))


(defn app []
  (routes
    (GET "/" [:as req]
      {:status  200
       :headers {"Content-Type" "text/html"}
       :body    "<h1>hello</h1>"})
    (GET "/:user-name" [user-name :as req]
      {:status  200
       :headers {"Content-Type" "text/html"}
       :body    (format "<h1> hi from %s" user-name)})))

(defn create-server []
  (server/run-server (app) {:port 8080}))

(defn run-server []
  (reset! server (create-server)))

(defn stop-server [server]
  (server :timeout 100))


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
  (Math/ceil (/ (hitcount body) (dec (count (annonser body))))))

(defn itannonser []
  (def url "https://www.finn.no/job/fulltime/search.html?location=0.20001&occupation=0.23&page=")
  (let [body (htmlbody (str url "1"))]
    (loop [res '() cnt (pages body)]
      (if (<= cnt 1.0)
        res
        (let [tmpa (htmlbody (str url cnt))]
          (recur (concat res (annonser tmpa)) (dec cnt))))))
  )


(defn beskrivelse [body]
  (let [items (remove nil?
                      (map :content
                           (-> (s/select
                                 (s/descendant
                                   (s/class "object-description")) body)
                               first
                               :content)))]
    (hickmaptostring items)))

(defn tittel [body]
  (-> (s/select (s/descendant (s/class "h1")) body)
      first
      :content
      first))

(defn semi-strukturert-beskrivelse [body]
  (let [grouped (map (fn [k] (partition-by #(get (get % :attrs) :data-automation-id) k))
                     (map #(remove string? %)
                          (map :content
                               (-> (s/select (s/descendant (s/class "r-prl")) body)))))]
    (let [g2 (map flatten
                  (apply concat
                         (map (fn [v]
                                (partition 2
                                           (map #(map :content %) v)))
                              grouped)))]  (map (fn [v] (map #(if (= (type %) clojure.lang.PersistentArrayMap) (:content %) %) v) ) g2)) )
  )




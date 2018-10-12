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

(extend-protocol sql/IResultSetReadColumn
  org.postgresql.jdbc4.Jdbc4Array
  (result-set-read-column [pgobj metadata i]
    (vec (.getArray pgobj))))

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




;;query stuff
(defn q-all-ads []
  (sql/query db ["select * from ad"]))


(defn q-add-descriptions [a]
  (map #(assoc % :k-description (sql/query db ["select key, value from descc where adkey=?" (:id %)])) a))

(defn q-add-keywords [a]
  (map #(assoc % :keywords (map :keyword (sql/query db ["select keyword from keywords where adkey=?" (:id %)]))) a))


(def re-keywords '[["Java" #"(?i)[^A-zæøå]java[^s]"]
                   ["JavaScript" #"(?i)javascript|([^A-zæøå]JS[^A-zæøå@])"]
                   ["Clojure" #"(?i)clojure[^s]"]
                   ["ClojureScript" #"(?i)clojurescript"]
                   ["Python" #"(?i)python"]
                   ["Kotlin" #"(?i)kotlin"]
                   ["R" #"(/|\(|,|\s|\.)R(/|\s|\.|,|\))"]
                   ["SQL" #"(?i)SQL"]
                   ["C#" #"(?i)(C.?#)|(C.?sharp)"]
                   ["F#" #"(?i)(F.?#)|(F.?sharp)"]
                   ["C++" #"(?i)c.?\+\+"]
                   ["C" #"(/|\(|,|\s|\.)C(/|\s|\.|,|\))\s*[^s#+]"]
                   ["PHP" #"(?i)([^A-zæøå]php7?[^A-zæøå])"]
                   ["Ruby" #"(?i)([^A-zæøå]ruby[^A-zæøå])"]
                   ["Scala" #"(?i)([^A-zæøå]scala[^A-zæøå])"]
                   ["TypeScript" #"(?i)typescript|([^A-zæøå]TS[^A-zæøå@])"]
                   ["LUA" #"(?i)([^A-zæøå]lua[^A-zæøå])"]
                   ["Go" #"([^A-zæøå](GO|Go)[^A-zæøå])"]
                   ["Haskell" #"(?i)haskell"]
                   ["Swift" #"(?i)([^A-zæøå]swift[^A-zæøå])"]
                   ["Objective C" #"(?i)([^A-zæøå](obj(ective)?.?c)[^A-zæøå])"]
                   ["CSS" #"(?i)([^A-zæøå]css3?[^A-zæøå])"]
                   ["HTML" #"(?i)([^A-zæøå]html5?[^A-zæøå])"]
                   ["XML" #"(?i)([^A-zæøå]XML[^A-zæøå])"]
                   ["Sparql" #"(?i)sparql"]
                   ["Xquery" #"(?i)xquery"]
                   ["Groovy" #"(?i)([^A-zæøå]groovy[^A-zæøå])"]
                   ["Angular" #"(?i)([^A-zæøå]angular.?(js)?[^A-zæøå])"]
                   ["React" #"(?i)([^A-zæøå]react.?(js)?[^A-zæøå])"]
                   ["Vue" #"(?i)([^A-zæøå]vue.?(js)?[^A-zæøå])"]
                   ["Spring" #"(?i)([^A-zæøå]spring(boot)?[^A-zæøå])"]
                   ["Datadog" #"(?i)([^A-zæøå]datadog[^A-zæøå])"]
                   ["jQuery" #"(?i)([^A-zæøå]jquery[^A-zæøå])"]
                   [".NET" #"(?i)([^A-zæøå]\.net[^A-zæøå])"]
                   ["PostgreSQL" #"(?i)([^A-zæøå]postgres(ql)?[^A-zæøå])"]
                   ["MySQL" #"(?i)([^A-zæøå]mysql[^A-zæøå])"]
                   ["Jenkins" #"(?i)([^A-zæøå]jenkins[^A-zæøå])"]
                   ["Maven" #"(?i)([^A-zæøå]maven[^A-zæøå])"]
                   ["Docker" #"(?i)([^A-zæøå]docker[^A-zæøå])"]
                   ["GIT" #"(?i)([^A-zæøå]git(lab)?(hub)?[^A-zæøå])"]
                   ["Trello" #"(?i)([^A-zæøå]trello[^A-zæøå])"]
                   ["Jira" #"(?i)([^A-zæøå]jira|confluence[^A-zæøå])"]
                   ["Confluence" #"(?i)([^A-zæøå]jira|confluence[^A-zæøå])"]
                   ["Node.js" #"(?i)([^A-zæøå](node(.?js)?|npm|yarn)[^A-zæøå])"]
                   ["TDD" #"(?i)([^A-zæøå](tdd|test.?driven.?development)[^A-zæøå])"]
                   ["Scrum" #"(?i)[^A-zæøå]scrum"]
                   ["Kanban" #"(?i)([^A-zæøå]kanban[^A-zæøå])"]
                   ["AWS" #"(?i)([^A-zæøå](aws|amazon))"]
                   ["Azure" #"(?i)([^A-zæøå](azure)[^A-zæøå])"]
                   ["Guava" #"(?i)([^A-zæøå](guava)[^A-zæøå])"]
                   ["Linux" #"(?i)linux|ubuntu|unix"]
                   ["GIS" #"(?i)([^A-zæøå](gis)[^A-zæøå])"]
                   ["REST" #"([^A-zæøå](REST|Rest)[^A-zæøå])"]
                   ["Machine Learning" #"(?i)([^A-zæøå](maskinlæring|ml|machine learning)[^A-zæøå])"]
                   ["NLP" #"(?i)[^A-zæøå](NLP|natural language (processing)?)[^A-zæøå]"]
                   ["Artificial Intelligence" #"(?i)([^A-zæøå](ai|artificial intelligence|maskinlæring|ml|((machine|deep) learning)|NLP|natural language (processing)?)[^A-zæøå])"]
                   ["IOT" #"(?i)([^A-zæøå](iot|internet of things)[^A-zæøå])"]
                   ["Big Data" #"(?i)([^A-zæøå](big data|stordata)[^A-zæøå])"]
                   ["Unity" #"(?i)[^A-zæøå]unity"]
                   ["GraphQL" #"(?i)graphql"]
                   ["ETL" #"(?i)([^A-zæøå](etl|extract.?transform.?load)[^A-zæøå])"]
                   ["SaaS" #"(?i)([^A-zæøå](saas|software.?as.?a.?service)[^A-zæøå])"]
                   ["Cloud" #"(?i)([^A-zæøå](cloud|sky(en|basert)?)[^A-zæøå])"]
                   ["Frontend" #"(?i)front.?end"]
                   ["Backend" #"(?i)back.?end"]
                   ["Fullstack" #"(?i)full.?stack"]
                   ["Devops" #"(?i)[^A-zæøå](dev.?ops)"]
                   ["TensorFlow" #"(?i)[^A-zæøå](tensor.?flow)"]
                   ["Business Intelligence" #"(?i)([^A-zæøå](BI|Business.?Intelligence)[^A-zæøå])"]
                   ["iOS" #"(?i)([^A-zæøå]iOS[^A-zæøå])"]
                   ["Android" #"(?i)[^A-zæøå]Android"]
                   ["Gradle" #"(?i)([^A-zæøå](gradle)[^A-zæøå])"]
                   ["Nim" #"(?i)([^A-zæøå](nim)[^A-zæøå])"]
                   ["Cobol" #"(?i)([^A-zæøå](cobol)[^A-zæøå])"]
                   ])



(defn filter-ads-regex [regex column a]
  (remove #(nil? (re-find regex (column %))) a))

;;(finn.core/all-ads-search #"(?i)java[^s]")
(defn q-all-ads-search [regex column]
  (->> (q-all-ads)
       (filter-ads-regex regex column)
       (q-add-descriptions)
       (q-add-keywords)))


(defn q-ads-without-keywords []
  (sql/query db ["select * from ad where id not in (select adkey as id from keywords)"]))


;;(finn.core/save-all-keywords (finn.core/q-ads-without-keywords) finn.core/re-keywords)
;;(finn.core/save-all-keywords (finn.core/q-all-ads) [[".NET" #"(?i)([^A-zæøå]\.net[^A-zæøå])"]])
(defn save-all-keywords [a keywords]
  (->> (map #(vec [(first %) (map :id (filter-ads-regex (last %) :description a))]) keywords)
       (map (fn [v] (map #(assoc '{} :keyword (first v) :adkey %) (last v))))
       (apply concat)
       (map #(sql/insert! db :keywords %))))


(defn update-finn []
  (save-all "0.23")
  (save-all-keywords (q-ads-without-keywords) re-keywords))


(defn q-all-categories []
  (->> (sql/query db ["select distinct keyword from keywords"])
       (map :keyword)))

(defn q-all-ads-joined []
  (->> (sql/query db ["select s.id,s.title,s.description,s.jobtype,s.keywords, array_agg(key) ks, array_agg(value) vs from (\nselect ad.id, title, description, jobtype, array_agg(keyword) as keywords from ad \ninner join keywords k on k.adkey = ad.id\nwhere ad.id in (\nselect distinct adkey from keywords)\ngroup by ad.id) s\ninner join descc d on d.adkey = s.id\n\tgroup by s.id,s.title,s.description,s.jobtype,s.keywords"])
       (map #(assoc '{} :id (:id %)
                        :title (:title %)
                        :description (:description %)
                        :jobtype (:jobtype %)
                        :keywords (:keywords %)
                        :desc (partition 2 (interleave (:ks %) (:vs %)))))))


(defn q-popularity []
  (sql/query db ["select keyword, count(keyword) as c from keywords group by keyword order by c desc"]))

(defn q-popularity-langs []
  (sql/query db ["select keyword, count(keyword) as c
  from keywords where keyword in ('C#', 'Java', 'JavaScript', 'C', 'C++', 'Clojure',
   'PHP', 'SQL', 'CSS', 'HTML', 'Python', 'R', 'Ruby', 'Kotlin', 'Scala', 'TypeScript',
    'Go', 'F#', 'Lua', 'Objective C', 'Haskell', 'Groovy', 'Nim', 'Swift', 'Cobol', 'ClojureScript')
   group by keyword order by c desc"]))

(defn app []
  (routes
    (GET "/ads/" []
      {:status  200
       :headers {"Content-Type" "application/json"}
       :body    (json/write-str (q-all-ads-joined))})))


(defn save-as-json []
  (spit "data.js" (str "const categories=" (json/write-str (q-all-categories)) "\n\r"
                       "const ads=" (json/write-str (q-all-ads-joined))) :encoding "UTF-8"))


(defn create-server []
  (server/run-server (app) {:port 8080}))
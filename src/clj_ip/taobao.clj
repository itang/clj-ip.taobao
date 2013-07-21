(ns clj-ip.taobao
  (:require [cheshire.core :as json]))

(def ^{:doc "taobao REST API url"}
  rest-api-url-prefix "http://ip.taobao.com/service/getIpInfo.php?ip=")

(defn ip-info
  "get ip info"
  [ip]
  (let [ret (-> (str rest-api-url-prefix ip)
                (slurp :encoding "UTF-8")
                json/decode)]
    (when (zero? (get ret "code"))
      (->> (get ret "data")
           (map #(let [[k v] %]
                   [(-> ^String k (.replace "_" "-") keyword) v]))
           (into {})))))

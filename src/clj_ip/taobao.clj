(ns clj-ip.taobao
  (:require [cheshire.core :as json]))

(def ^{:doc "taobao REST API url"}
  rest-api-url-prefix "http://ip.taobao.com/service/getIpInfo.php?ip=")

(defn ip-info
  "get ip info"
  [ip]
  (let [{:strs [code data] :as ret}
        (-> (str rest-api-url-prefix ip)
            (slurp :encoding "UTF-8")
            json/decode)]
    (if (zero? code)
      {:ok true
       :data (->> data
                  (map #(let [[k v] %]
                          [(-> ^String k (.replace "_" "-") keyword) v]))
                  (into {}))
       :code code}
      {:ok false :code code :data data})))

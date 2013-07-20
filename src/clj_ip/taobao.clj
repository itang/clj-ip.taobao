(ns clj-ip.taobao
  (:require [cheshire.core :refer [decode]]))

(def ^{:doc "taobao REST API url"}
  rest-api-url-prefix "http://ip.taobao.com/service/getIpInfo.php?ip=")

(defn ip-info
  "get ip info"
  [ip]
  (let [ret (decode (slurp (str rest-api-url-prefix ip)))]
    (when (zero? (get ret "code"))
      (->> (get ret "data")
           (map (fn[t]
                  (let [[^String k v] t
                        nk (-> k (.replace "_" "-") keyword)]
                    [nk v])))
           (into {})))))

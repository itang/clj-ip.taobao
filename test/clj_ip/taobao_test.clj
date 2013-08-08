(ns clj-ip.taobao-test
  (:require [clojure.test :refer :all]
            [clj-ip.taobao :refer :all]))

(deftest ip-info-test
  (testing "get ip info"
    (is (= "US"
           (get-in (ip-info "8.8.8.8") [:data :country-id])))
    (is (false? (:ok (ip-info "444.44"))))))

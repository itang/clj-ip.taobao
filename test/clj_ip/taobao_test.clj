(ns clj-ip.taobao-test
  (:require [clojure.test :refer :all]
            [clj-ip.taobao :refer :all]))

(deftest ip-info-test
  (testing "get ip info"
    (is (= "US"
           (:country-id (ip-info "8.8.8.8"))))
    (is (nil? (ip-info "444.44")))))

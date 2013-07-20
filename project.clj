(defproject clj-ip.taobao "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [cheshire "5.2.0"]]
  :global-vars {*warn-on-reflection* true}
  :injections [(require 'clojure.pprint)]
  :min-lein-version "2.0.0"
  :profiles {:dev {:plugins [[lein-checkall "0.1.1"]]}
             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}}
  :aliases {"run-tests" ["with-profile" "1.4:1.5" "test"]})

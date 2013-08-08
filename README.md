# clj-ip.taobao

A Clojure library designed to wrapper http://ip.taobao.com/ well, that part is up to you.

## Install

clone and locally install

    $ lein install

## Usage

    user=> (use 'clj-ip.taobao)
    nil
    user=> (def ret (ip-info "8.8.8.8"))
    #'user/ret
    user=> ret
    {:ok true, :data {:country "美国", :region-id "", :isp-id "", :area "", :area-id "", :city-id "", :country-id "US", :city "", :isp "", :county "", :region "", :ip "8.8.8.8", :county-id ""}, :code 0}
    user=> (:ok ret)
    true
    user=> (get-in ret [:data :country])
    "美国"
    user=> (-> "8.8.8.8" ip-info :data :country-id)
    "US"

    user> (ip-info "444.44")
    {:ok false, :code 1, :data "invaild ip."}

## License

Copyright © 2013 itang

Distributed under the Eclipse Public License, the same as Clojure.

# clj-ip.taobao

A Clojure library designed to wrapper http://ip.taobao.com/ well, that part is up to you.

## Install

clone and locally install

    $ lein install

## Usage

    user> (use 'clj-ip.taobao)
    nil
    user> (ip-info "8.8.8.8")
    {:country "美国", :region-id "", :isp-id "", :area "", :area-id "", :city-id "", :country-id "US", :city "", :isp "", :county "", :region "", :ip "8.8.8.8", :county-id ""}
    user> (ip-info "444.44")
    nil

## License

Copyright © 2013 itang

Distributed under the Eclipse Public License, the same as Clojure.

(defproject mc-site "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.2.0"]
                 [ring/ring-defaults "0.1.2"]
                 [hiccup "1.0.5"]
                 [clj-http "1.0.1"]
                 [pokereader "0.1.0-SNAPSHOT"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler mc-site.core.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})

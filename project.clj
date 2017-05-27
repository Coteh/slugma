(defproject slugma "0.1.0-SNAPSHOT"
  :description "Simple module to slugify strings"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot slugma.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

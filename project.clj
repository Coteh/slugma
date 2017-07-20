(defproject slugma "0.9.0"
  :description "Simple module to slugify strings"
  :url "https://github.com/Coteh/slugma"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main slugma.core
  :aot [slugma.core]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

(ns slugma.core
  (:require [clojure.string :as str])
  (:require [slugma.slugma :as slugma]))

(defn -main
  "Main entry point for this module if ran directly."
  [& args]
  (println (slugma/slugma "Hello World!")))

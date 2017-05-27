(ns slugma.core
  (:require [clojure.string :as str])
  (:require [slugma.slugma :as slugma]))

(defn -main
  "Main entry point for this module if ran directly."
  [& args]
  (cond
    (not= (first args) nil) (println (slugma/slugma (first args)))
    (= (first args) nil) (println "usage: slugma.core [STRING_TO_SLUG]")))

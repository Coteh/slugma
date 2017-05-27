(ns slugma.core
  (:require [clojure.string :as str])
  (:require [slugma.slugma :as slugma]))

(defn -main
  "Main entry point for this module if ran directly."
  [& args]
  (cond
    (= (first args) nil) (println "usage: slugma.core [STRINGS_TO_SLUG ...]")
    (not= (first args) nil)
      (doseq [arg args]
        (println (slugma/slugma arg)))))

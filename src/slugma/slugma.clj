(ns slugma.slugma
  (:require [clojure.string :as str]))

(defn slugma [line]
  (def result
    (-> line
      (str/replace #"[^A-Za-z0-9]+" "-")
      str/lower-case))

  (cond-> result
    (.endsWith result "-") (.substring 0 (- (count result) 1))
    (.startsWith result "-") (.substring 1)))

(ns slugma.slugma
  (:require [clojure.string :as str]))

(defn slugma [line]
  (def result
    (str/lower-case
      (str/replace line
        #"[^A-Za-z0-9]+" "-")))
  (if (.endsWith result "-")
    (def result (.substring result 0 (- (count result) 1))))
  (if (.startsWith result "-")
    (.substring result 1 (count result))
    result))

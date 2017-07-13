(ns slugma.slugma
  (:require [clojure.string :as str]))

;;;; remove-diacritics
;;; Breaks up accented characters into regular character + diacritic
;;; Filters out nonspacing (Mn) and enclosing (Me) diacritics
(defn remove-diacritics [str]
  (-> str
    (java.text.Normalizer/normalize java.text.Normalizer$Form/NFD)
    (str/replace #"[\p{Mn}\p{Me}]+" "")))

;;;; slugma
;;; The main slugma module function
;;; Performs some filtering to get the slugged
;;; text we want
(defn slugma [line]
  (def result
    (-> line
      remove-diacritics
      (str/replace #"[^A-Za-z0-9]+" "-")
      str/lower-case))

  (cond-> result
    (.endsWith result "-") (.substring 0 (- (count result) 1))
    (.startsWith result "-") (.substring 1)))

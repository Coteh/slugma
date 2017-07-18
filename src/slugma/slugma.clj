(ns slugma.slugma
  (:require [clojure.string :as str]))

;;;; remove-diacritics
;;; Breaks up accented characters into regular character + diacritic
;;; Filters out nonspacing (Mn) and enclosing (Me) diacritics
;;; The result is then returned
(defn remove-diacritics [str]
  (-> str
    (java.text.Normalizer/normalize java.text.Normalizer$Form/NFD)
    (str/replace #"[\p{Mn}\p{Me}]+" "")))

;;;; remove-common-words
;;; Removes common words such as conjunctions
;;; from the string and returns the result
(defn remove-common-words [str]
  (-> str
    (str/replace #"(?i)\b(the|or|and|for|nor|but|yet|so|an)\b+" "")))

;;;; remove-connective-punctuation
;;; Removes "connective" punctuation marks.
;;; In other words, punctuation marks that are part of a word.
;;; Example(s): won't, elephant's, a's
(defn remove-connective-punctuation [str]
  (-> str
    (str/replace #"(?i)\b(')\b+" "")))

;;;; slugma
;;; The main slugma module function
;;; Performs some filtering to get the slugged
;;; text we want
(defn slugma [line & {:keys [should-remove-common-words]
                      :or {should-remove-common-words true}}]
  (let [result (-> line
                remove-diacritics
                (cond->
                  (= should-remove-common-words true) remove-common-words)
                remove-connective-punctuation
                (str/replace #"[^A-Za-z0-9]+" "-")
                str/lower-case)]
        (cond-> result
          (.endsWith result "-") (.substring 0 (- (count result) 1))
          (.startsWith result "-") (.substring 1))))

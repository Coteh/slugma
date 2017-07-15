(ns slugma.slugma-test
  (:require [clojure.test :refer :all]
            [slugma.slugma :refer :all]))

(deftest basic-test
  (testing "Just a basic slug."
    (is (= (slugma.slugma/slugma "Hello World!") "hello-world"))))

(deftest ends-test
  (testing "This slug should not have dashes at beginning and end."
    (is (= (slugma.slugma/slugma "!This is a test string!")
    "this-is-a-test-string"))))

(deftest multi-test
  (testing "Collapses multiples of a non-alphanumeric character. (eg. spaces, dashes, etc.)"
    (is (= (slugma.slugma/slugma "We have  an extra space and -- extra dashes" :should-remove-common-words false)
    "we-have-an-extra-space-and-extra-dashes"))))

(deftest accent-test
  (testing "Accented letters become their unaccented counterparts."
    (is (= (slugma.slugma/slugma "Does this work éh?")
    "does-this-work-eh"))))

(deftest common-word-test
  (testing "Common words such as conjectures are removed."
    (is (= (slugma.slugma/slugma "This, That and the Other! An Outré Collection")
    "this-that-other-outre-collection"))))

(ns roman-numerals.core)

(defn to-roman [n]
  (if (< n 1) "" "I"))
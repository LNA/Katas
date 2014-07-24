(ns roman-numerals.core)

(def roman-numerals [[5 "V"] [4 "IV"] [1 "I"]])

(defn to-roman [number]
  (loop [number number result "" numerals roman-numerals]
    (if (< number 1) result
      (let [[natural roman] (first numerals)]
        (if (> natural number )
          (recur number result (rest numerals))
          (recur (- number natural) (str result roman) numerals))))))

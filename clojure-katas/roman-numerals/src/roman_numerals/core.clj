(ns roman-numerals.core)

(def roman-numerals [[10 "X"][9 "IX"][5 "V"] [4 "IV"] [1 "I"]])

(defn to-roman [number]
  (loop [number number
         result ""
         roman-numerals roman-numerals]
    (if (< number 1)
      result
      (let [[natural numeral] (first roman-numerals)]
        (if (< number natural)
          (recur number result(rest roman-numerals))
          (recur (- number natural) (str result numeral) roman-numerals))))))

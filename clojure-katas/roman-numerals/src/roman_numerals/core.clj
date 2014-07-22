(ns roman-numerals.core)

(defn to-roman [number]
  (loop [number number result ""]
    (if (< number 1) 
      result
      (recur (- number 1) (str result "I")))))
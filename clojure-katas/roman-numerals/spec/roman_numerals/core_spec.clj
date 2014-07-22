(ns roman-numerals.core-spec
  (:require [speclj.core :refer :all]
            [roman-numerals.core :refer :all]))
(describe "roman-numerals"
          (it "converts 1 to I"
            (should= "I" (to-roman 1)))
          (it "converts 2 to II"
            (should= "II" (to-roman 2)))
          (it "converts 3 to III"
            (should= "III" (to-roman 3)))
          (it "converts 4 to IV)"
            (should= "IV" (to-roman 4)))
)
(ns roman-numerals.core-spec
  (:require [speclj.core :refer :all]
            [roman-numerals.core :refer :all]))
(describe "roman-numerals"
          (it "converts natural numbers to roman numerals"
            (should= "I"   (to-roman 1))
            (should= "II"  (to-roman 2))
            (should= "III" (to-roman 3))
            (should= "IV"  (to-roman 4))
            (should= "V"   (to-roman 5))
          )
)

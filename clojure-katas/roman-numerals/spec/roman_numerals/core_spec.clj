(ns roman-numerals.core-spec
  (:require [speclj.core :refer :all]
            [roman-numerals.core :refer :all]))
(describe "roman-numerals"
          (it "converts natural numbers to roman numerals"
            (should= "I"     (to-roman 1))
            (should= "II"    (to-roman 2))
            (should= "III"   (to-roman 3))
            (should= "IV"    (to-roman 4))
            (should= "V"     (to-roman 5))
            (should= "VI"    (to-roman 6))
            (should= "VII"   (to-roman 7))
            (should= "VIII"  (to-roman 8))
            (should= "IX"    (to-roman 9))
            (should= "X"     (to-roman 10))
          )
)

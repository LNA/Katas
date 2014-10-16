(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "Coin Changer" 
  (it "gives change for 1"
    (should= [1]
      (make-change 1)))

  (it "gives change for 2"
    (should= [1 1]
      (make-change 2)))

  (it "gives change for 3"
    (should= [1 1 1]
      (make-change 3)))

  (it "gives change for 5"
    (should= [5]
      (make-change 5))))

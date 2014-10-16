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
      (make-change 5)))

  (it "gives change for 6"
    (should= [5 1]
      (make-change 6)))
  
  (it "gives change for 9"
    (should= [5 1 1 1 1]
      (make-change 9)))

  (it "gives change for 10"
    (should= [10]
      (make-change 10)))

  (it "gives change for 25"
    (should= [25]
      (make-change 25))))

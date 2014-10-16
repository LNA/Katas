(ns coin-changer.core)

(defn make-change [amount]
  (take amount (repeat 1)))

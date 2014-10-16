(ns coin-changer.core)

(defn make-change [amount]
  (let [amount-for-pennies (rem amount 5)
        nickles            (int (/ amount 5))]
        (concat 
          (take nickles (repeat 5))
          (take amount-for-pennies (repeat 1)))))

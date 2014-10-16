(ns coin-changer.core)

(defn make-change [amount]
  (let [denominations [10 5 1] 
        amounts       (reductions #(rem %1 %2) amount denominations)
        coins         (map #(int (/ %1 %2)) amounts denominations)]
          (mapcat #(take %1 (repeat %2)) coins denominations)))

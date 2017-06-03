(= ((fn [x y]
      (into []
            (let [a (* x y)]
              (map #(Character/digit % 10) (str a))))) 1 1) [1])

(= ((fn [x y]
      (into []
            (let [a (* x y)]
              (map #(Character/digit % 10) (str a))))) 99 9) [8 9 1])

(= ((fn [x y]
      (into []
            (let [a (* x y)]
              (map #(Character/digit % 10) (str a))))) 999 99) [9 8 9 0 1])

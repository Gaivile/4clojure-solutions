(= ((fn [data x]
  (apply concat
    (into []
      (for [y data]
          (into [] (repeat x y)))))) [1 2 3] 2) '(1 1 2 2 3 3))

(= ((fn [data x]
  (apply concat
    (into []
      (for [y data]
          (into [] (repeat x y)))))) [:a :b] 4) '(:a :a :a :a :b :b :b :b))

(= ((fn [data x]
  (apply concat
    (into []
      (for [y data]
          (into [] (repeat x y)))))) [4 5 6] 1) '(4 5 6))

(= ((fn [data x]
  (apply concat
    (into []
      (for [y data]
          (into [] (repeat x y)))))) [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))

(= ((fn [data x]
  (apply concat
    (into []
      (for [y data]
          (into [] (repeat x y)))))) [44 33] 2) [44 44 33 33])

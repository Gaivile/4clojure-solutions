(= ((fn [data]
  (sort (concat data data))) [1 2 3]) '(1 1 2 2 3 3))

(= ((fn [data]
  (sort (concat data data))) [:a :a :b :b]) '(:a :a :a :a :b :b :b :b))

(= ((fn [data]
  (sort (concat data data))) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

(= ((fn [data]
  (sort (concat data data))) [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4]))

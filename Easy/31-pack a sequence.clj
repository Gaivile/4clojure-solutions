(= ((fn [data]
  (partition-by identity data)) [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))

(= ((fn [data]
  (partition-by identity data)) [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))

(= ((fn [data]
  (partition-by identity data)) [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))

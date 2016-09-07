(= ((fn [val-seq element]
  (last (take (+ element 1) val-seq))) '(4 5 6 7) 2) 6)

(= ((fn [val-seq element]
  (last (take (+ element 1) val-seq))) [:a :b :c] 0) :a)

(= ((fn [val-seq element]
  (last (take (+ element 1) val-seq))) [1 2 3 4] 1) 2)

(= ((fn [val-seq element]
  (last (take (+ element 1) val-seq))) '([1 2] [3 4] [5 6]) 2) [5 6])

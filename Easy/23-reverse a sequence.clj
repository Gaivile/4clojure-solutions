(= ((fn [data]
  (if (vector? data)
    (into [] (reduce conj '() data))
    (reduce conj '() data))) [1 2 3 4 5]) [5 4 3 2 1])

(= ((fn [data]
  (if (vector? data)
    (into [] (reduce conj '() data))
    (reduce conj '() data))) (sorted-set 5 7 2 7)) '(7 5 2))

(= ((fn [data]
  (if (vector? data)
    (into [] (reduce conj '() data))
    (reduce conj '() data))) [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

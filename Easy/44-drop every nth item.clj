(= ((fn [data x]
  (vec (flatten
  (for [y (partition x x nil data)]
    (if (= (count y) x)
      (pop (vec y))
      (vec y)))))) [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])

(= ((fn [data x]
  (vec (flatten
  (for [y (partition x x nil data)]
    (if (= (count y) x)
      (pop (vec y))
      (vec y)))))) [:a :b :c :d :e :f] 2) [:a :c :e])

(= ((fn [data x]
  (vec (flatten
  (for [y (partition x x nil data)]
    (if (= (count y) x)
      (pop (vec y))
      (vec y)))))) [1 2 3 4 5 6] 4) [1 2 3 5 6])

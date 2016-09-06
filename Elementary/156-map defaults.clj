(= ((fn [value value-seq]
  (zipmap value-seq [value value value])) 0 [:a :b :c]) {:a 0 :b 0 :c 0})

(= ((fn [value value-seq]
  (zipmap value-seq [value value value])) "x" [1 2 3]) {1 "x" 2 "x" 3 "x"})

(= ((fn [value value-seq]
  (zipmap value-seq [value value value])) [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})

(= ((fn [data1 data2]
  (flatten (map vector data1 data2))) [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c))

(= ((fn [data1 data2]
  (flatten (map vector data1 data2))) [1 2] [3 4 5 6]) '(1 3 2 4))

(= ((fn [data1 data2]
  (flatten (map vector data1 data2))) [1 2 3 4] [5]) [1 5])

(= ((fn [data1 data2]
  (flatten (map vector data1 data2))) [30 20] [25 15]) [30 25 20 15])

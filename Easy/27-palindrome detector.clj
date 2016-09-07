(false? ((fn [data]
  (let [reversed (reverse data) ]
    (if (coll? data)
      (if (= data reversed)
        true
        false)
      (if (= (map char data) reversed)
        true
        false)))) '(1 2 3 4 5)))

(true? ((fn [data]
  (let [reversed (reverse data) ]
    (if (coll? data)
      (if (= data reversed)
        true
        false)
      (if (= (map char data) reversed)
        true
        false)))) "racecar"))

(true? ((fn [data]
  (let [reversed (reverse data) ]
    (if (coll? data)
      (if (= data reversed)
        true
        false)
      (if (= (map char data) reversed)
        true
        false)))) [:foo :bar :foo]))

(true? ((fn [data]
  (let [reversed (reverse data) ]
    (if (coll? data)
      (if (= data reversed)
        true
        false)
      (if (= (map char data) reversed)
        true
        false)))) '(1 1 3 3 1 1)))

(false? ((fn [data]
  (let [reversed (reverse data) ]
    (if (coll? data)
      (if (= data reversed)
        true
        false)
      (if (= (map char data) reversed)
        true
        false)))) '(:a :b :c)))

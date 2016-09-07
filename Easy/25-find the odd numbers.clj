(= ((fn [x]
  (let [z 
  (for [y x]
    (if (= (rem y 2) 1)
      y))]
    (remove nil? z))) #{1 2 3 4 5}) '(1 3 5))

(= ((fn [x]
  (let [z 
  (for [y x]
    (if (= (rem y 2) 1)
      y))]
    (remove nil? z))) [4 2 1 6]) '(1))

(= ((fn [x]
  (let [z 
  (for [y x]
    (if (= (rem y 2) 1)
      y))]
    (remove nil? z))) [2 2 4 6]) '())

(= ((fn [x]
  (let [z 
  (for [y x]
    (if (= (rem y 2) 1)
      y))]
    (remove nil? z))) [1 1 1 3]) '(1 1 1 3))

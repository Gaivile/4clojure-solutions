(= (apply str ((fn [data]
  (map first (partition-by identity data))) "Leeeeeerrroyyy")) "Leroy")

(= ((fn [data]
  (map first (partition-by identity data))) [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))

(= ((fn [data]
  (map first (partition-by identity data))) [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

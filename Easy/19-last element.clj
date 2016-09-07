(= ((fn [x]
  (first (reverse x))) [1 2 3 4 5]) 5)

(= ((fn [x]
  (first (reverse x))) '(5 4 3)) 3)

(= ((fn [x]
  (first (reverse x))) ["b" "c" "d"]) "d")

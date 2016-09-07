(= ((fn [x]
  (nth x (- (count x) 2))) (list 1 2 3 4 5)) 4)

(= ((fn [x]
  (nth x (- (count x) 2))) ["a" "b" "c"]) "b")

(= ((fn [x]
  (nth x (- (count x) 2))) [[1 2] [3 4]]) [1 2])


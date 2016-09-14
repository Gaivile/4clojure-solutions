(= ((fn  [x y]
  (take (- y x) (iterate inc x))) 1 4) '(1 2 3))

(= ((fn  [x y]
  (take (- y x) (iterate inc x))) -2 2) '(-2 -1 0 1))

(= ((fn  [x y]
  (take (- y x) (iterate inc x))) 5 8) '(5 6 7))

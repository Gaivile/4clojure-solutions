(= ((fn [x]
  (alength (to-array x))) '(1 2 3 3 1)) 5)

(= ((fn [x]
  (alength (to-array x))) "Hello World") 11)

(= ((fn [x]
  (alength (to-array x))) [[1 2] [3 4] [5 6]]) 3)

(= ((fn [x]
  (alength (to-array x))) '(13)) 1)

(= ((fn [x]
  (alength (to-array x))) '(:a :b :c)) 3)

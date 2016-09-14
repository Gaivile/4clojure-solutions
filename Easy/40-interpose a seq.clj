(= ((fn [x data]
  (pop (into [] (apply concat (into []
    (for [y data]
      [y x])))))) 0 [1 2 3]) [1 0 2 0 3])

(= (apply str ((fn [x data]
  (pop (into [] (apply concat (into []
    (for [y data]
      [y x])))))) ", " ["one" "two" "three"])) "one, two, three")

(= ((fn [x data]
  (pop (into [] (apply concat (into []
    (for [y data]
      [y x])))))) :z [:a :b :c :d]) [:a :z :b :z :c :z :d])

(= ((fn [x y]
      (let [all-x (clojure.set/difference y x)
            all-y (clojure.set/difference x y)
            returned-set (clojure.set/union all-x all-y )]
        returned-set)) #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})

(= ((fn [x y]
      (let [all-x (clojure.set/difference y x)
            all-y (clojure.set/difference x y)
            returned-set (clojure.set/union all-x all-y )]
        returned-set)) #{:a :b :c} #{}) #{:a :b :c})

(= ((fn [x y]
      (let [all-x (clojure.set/difference y x)
            all-y (clojure.set/difference x y)
            returned-set (clojure.set/union all-x all-y )]
        returned-set)) #{} #{4 5 6}) #{4 5 6})

(= ((fn [x y]
      (let [all-x (clojure.set/difference y x)
            all-y (clojure.set/difference x y)
            returned-set (clojure.set/union all-x all-y )]
        returned-set)) #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})

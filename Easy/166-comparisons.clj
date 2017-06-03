(= :gt ((fn [op a b]
          (cond
            (op a b) :lt
            (op b a) :gt
            :else :eq)) < 5 1))

(= :eq ((fn [op a b]
          (cond
            (op a b) :lt
            (op b a) :gt
            :else :eq)) (fn [x y] (< (count x) (count y))) "pear" "plum"))

(= :lt ((fn [op a b]
          (cond
            (op a b) :lt
            (op b a) :gt
            :else :eq)) (fn [x y] (< (mod x 5) (mod y 5))) 21 3))

(= :gt ((fn [op a b]
          (cond
            (op a b) :lt
            (op b a) :gt
            :else :eq)) > 0 2))

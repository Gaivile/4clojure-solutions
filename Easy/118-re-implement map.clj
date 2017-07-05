(= [3 4 5 6 7]
   ((fn new-map [f coll]
      (lazy-seq
       (when-let [s (seq coll)]
         (cons (f (first s)) (new-map f (rest s)))))) inc [2 3 4 5 6]))

(= (repeat 10 nil)
   ((fn new-map [f coll]
      (lazy-seq
       (when-let [s (seq coll)]
         (cons (f (first s)) (new-map f (rest s)))))) (fn [_] nil) (range 10)))

(= [1000000 1000001]
   (->> ((fn new-map [f coll]
           (lazy-seq
            (when-let [s (seq coll)]
              (cons (f (first s)) (new-map f (rest s)))))) inc (range))
        (drop (dec 1000000))
        (take 2)))

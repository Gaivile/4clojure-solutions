(= ((fn [f coll]
      (let [applied-fn (map #(vec %) (partition-by f coll))
            fn-results (map #(f (first %)) applied-fn)
            sorted-results (sort-by first (partition 2 (interleave fn-results applied-fn)))]
        (zipmap (distinct fn-results)
                (map (fn [values]
                       (vec (apply concat (rest (distinct values)))))
                     (map (fn [result]
                            (apply concat (filter #(= (first %) result) sorted-results)))
                          (distinct fn-results)))))) #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})

(= ((fn [f coll]
      (let [applied-fn (map #(vec %) (partition-by f coll))
            fn-results (map #(f (first %)) applied-fn)
            sorted-results (sort-by first (partition 2 (interleave fn-results applied-fn)))]
        (zipmap (distinct fn-results)
                (map (fn [values]
                       (vec (apply concat (rest (distinct values)))))
                     (map (fn [result]
                            (apply concat (filter #(= (first %) result) sorted-results)))
                          (distinct fn-results)))))) #(apply / %) [[1 2] [2 4] [4 6] [3 6]])
   {1/2 [[1 2] [2 4] [3 6]], 2/3 [[4 6]]})

(= ((fn [f coll]
      (let [applied-fn (map #(vec %) (partition-by f coll))
            fn-results (map #(f (first %)) applied-fn)
            sorted-results (sort-by first (partition 2 (interleave fn-results applied-fn)))]
        (zipmap (distinct fn-results)
                (map (fn [values]
                       (vec (apply concat (rest (distinct values)))))
                     (map (fn [result]
                            (apply concat (filter #(= (first %) result) sorted-results)))
                          (distinct fn-results)))))) count [[1] [1 2] [3] [1 2 3] [2 3]])
   {1 [[1] [3]], 2 [[1 2] [2 3]], 3 [[1 2 3]]})

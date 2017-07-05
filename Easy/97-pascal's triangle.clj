(= ((fn p-triangle
      ([x] (p-triangle x [1]))
      ([x coll]
       (if (= x (count coll))
         coll
         (p-triangle x (conj (into [] (conj (map + (drop-last coll) (drop 1 coll)) 1 )) 1))))) 1) [1])

(= (map (fn p-triangle
          ([x] (p-triangle x [1]))
          ([x coll]
           (if (= x (count coll))
             coll
             (p-triangle x (conj (into [] (conj (map + (drop-last coll) (drop 1 coll)) 1 )) 1))))) (range 1 6))
   [[1]
    [1 1]
    [1 2 1]
    [1 3 3 1]
    [1 4 6 4 1]])

(= ((fn p-triangle
      ([x] (p-triangle x [1]))
      ([x coll]
       (if (= x (count coll))
         coll
         (p-triangle x (conj (into [] (conj (map + (drop-last coll) (drop 1 coll)) 1 )) 1))))) 11)
   [1 10 45 120 210 252 210 120 45 10 1])

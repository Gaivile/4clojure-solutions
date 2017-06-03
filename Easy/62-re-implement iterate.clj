(= (take 5 ((fn [op x]
              (conj
               (let [a (atom x)]
                 (repeatedly #(swap! a op)))
               x)) #(* 2 %) 1)) [1 2 4 8 16])

(= (take 100 ((fn [op x]
                (conj
                 (let [a (atom x)]
                   (repeatedly #(swap! a op)))
                 x)) inc 0)) (take 100 (range)))

(= (take 9 ((fn [op x]
              (conj
               (let [a (atom x)]
                 (repeatedly #(swap! a op)))
               x)) #(inc (mod % 3)) 1)) (take 9 (cycle [1 2 3])))

(= 8 ((fn [numbers]
        (count
         (filter #(< %
                     (reduce +
                             (map (fn [n] (* n n))
                                  ((fn [x]
                                     (map (fn [y] (Character/digit y 10)) (str x))) %)))) numbers))) (range 10)))

(= 19 ((fn [numbers]
         (count
          (filter #(< %
                      (reduce +
                              (map (fn [n] (* n n))
                                   ((fn [x]
                                      (map (fn [y] (Character/digit y 10)) (str x))) %)))) numbers))) (range 30)))

(= 50 ((fn [numbers]
         (count
          (filter #(< %
                      (reduce +
                              (map (fn [n] (* n n))
                                   ((fn [x]
                                      (map (fn [y] (Character/digit y 10)) (str x))) %)))) numbers))) (range 100)))

(= 50 ((fn [numbers]
         (count
          (filter #(< %
                      (reduce +
                              (map (fn [n] (* n n))
                                   ((fn [x]
                                      (map (fn [y] (Character/digit y 10)) (str x))) %)))) numbers))) (range 1000)))

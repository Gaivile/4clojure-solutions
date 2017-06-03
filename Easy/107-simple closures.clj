(= 256 (((fn [data1 data2]
           (into #{} (flatten
                      (for [x data1
                            :when (contains? data2 x)]
                        (conj '() x))))) 2) 16),
   (((fn [data1 data2]
       (into #{} (flatten
                  (for [x data1
                        :when (contains? data2 x)]
                    (conj '() x))))) 8) 2))

(= [1 8 27 64] (map ((fn [data1 data2]
                       (into #{} (flatten
                                  (for [x data1
                                        :when (contains? data2 x)]
                                    (conj '() x))))) 3) [1 2 3 4]))

(= [1 2 4 8 16] (map #(((fn [data1 data2]
                          (into #{} (flatten
                                     (for [x data1
                                           :when (contains? data2 x)]
                                       (conj '() x))))) %) 2) [0 1 2 3 4]))

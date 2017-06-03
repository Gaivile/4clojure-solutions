(= ((fn [data1 data2]
      (into #{} (flatten
                 (for [x data1
                       :when (contains? data2 x)]
                   (conj '() x))))) #{0 1 2 3} #{2 3 4 5}) #{2 3})

(= ((fn [data1 data2]
      (into #{} (flatten
                 (for [x data1
                       :when (contains? data2 x)]
                   (conj '() x))))) #{0 1 2} #{3 4 5}) #{})

(= ((fn [data1 data2]
      (into #{} (flatten
                 (for [x data1
                       :when (contains? data2 x)]
                   (conj '() x))))) #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})

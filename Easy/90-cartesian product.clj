(= ((fn [data1 data2]
      (set
       (for [x data1
             y data2]
         [x y]))) #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
   #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
     ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
     ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]})

(= ((fn [data1 data2]
      (set
       (for [x data1
             y data2]
         [x y]))) #{1 2 3} #{4 5})
   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})

(= 300 (count ((fn [data1 data2]
                 (set
                  (for [x data1
                        y data2]
                    [x y]))) (into #{} (range 10))
                  (into #{} (range 30)))))

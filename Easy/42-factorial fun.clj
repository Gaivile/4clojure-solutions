(= ((fn fact [x]
  (if (= x 1)
    1
    (* x (fact (dec x))))) 1) 1)

(= ((fn fact [x]
  (if (= x 1)
    1
    (* x (fact (dec x))))) 3) 6)

(= ((fn fact [x]
  (if (= x 1)
    1
    (* x (fact (dec x))))) 5) 120)

(= ((fn fact [x]
  (if (= x 1)
    1
    (* x (fact (dec x))))) 8) 40320)

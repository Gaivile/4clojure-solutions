(= ((fn [x]
      (filter (complement sequential?)
              (rest (tree-seq sequential? seq x)))) '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

(= ((fn [x]
      (filter (complement sequential?)
              (rest (tree-seq sequential? seq x)))) ["a" ["b"] "c"]) '("a" "b" "c"))

(= ((fn [x]
      (filter (complement sequential?)
              (rest (tree-seq sequential? seq x)))) '((((:a))))) '(:a))

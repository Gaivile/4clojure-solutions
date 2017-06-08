(= ((fn [coll]
      (partition 2 (interleave coll (range))))
    [:a :b :c]) [[:a 0] [:b 1] [:c 2]])

(= ((fn [coll]
      (partition 2 (interleave coll (range))))
    [0 1 3]) '((0 0) (1 1) (3 2)))

(= ((fn [coll]
      (partition 2 (interleave coll (range))))
    [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])

(= ((fn tree- [coll]
      (if (= 3 (count (remove false? coll)))
        (if (and (empty? (filter coll? coll)))
          true
          (first (map #(tree- %) (filter coll? coll))))
        false)) '(:a (:b nil nil) nil))
   true)

(= ((fn tree- [coll]
      (if (= 3 (count (remove false? coll)))
        (if (and (empty? (filter coll? coll)))
          true
          (first (map #(tree- %) (filter coll? coll))))
        false)) '(:a (:b nil nil)))
   false)

(= ((fn tree- [coll]
      (if (= 3 (count (remove false? coll)))
        (if (and (empty? (filter coll? coll)))
          true
          (first (map #(tree- %) (filter coll? coll))))
        false)) [1 nil [2 [3 nil nil] [4 nil nil]]])
   true)

(= ((fn tree- [coll]
      (if (= 3 (count (remove false? coll)))
        (if (and (empty? (filter coll? coll)))
          true
          (first (map #(tree- %) (filter coll? coll))))
        false)) [1 [2 nil nil] [3 nil nil] [4 nil nil]])
   false)

(= ((fn tree- [coll]
      (if (= 3 (count (remove false? coll)))
        (if (and (empty? (filter coll? coll)))
          true
          (first (map #(tree- %) (filter coll? coll))))
        false)) [1 [2 [3 [4 nil nil] nil] nil] nil])
   true)

(= ((fn tree- [coll]
      (if (= 3 (count (remove false? coll)))
        (if (and (empty? (filter coll? coll)))
          true
          (first (map #(tree- %) (filter coll? coll))))
        false)) [1 [2 [3 [4 false nil] nil] nil] nil])
   false)

(= ((fn tree- [coll]
      (if (= 3 (count (remove false? coll)))
        (if (and (empty? (filter coll? coll)))
          true
          (first (map #(tree- %) (filter coll? coll))))
        false)) '(:a nil ()))
   false)

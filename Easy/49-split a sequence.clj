(= ((fn [x data]
  (let [a (subvec data 0 x)
        b (subvec data x)]
    [a b])) 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])

(= ((fn [x data]
  (let [a (subvec data 0 x)
        b (subvec data x)]
    [a b])) 1 [:a :b :c :d]) [[:a] [:b :c :d]])

(= ((fn [x data]
  (let [a (subvec data 0 x)
        b (subvec data x)]
    [a b])) 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])

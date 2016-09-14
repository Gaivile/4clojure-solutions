(= ((fn [data1 data2]
  (into {}
        (apply map vector [data1 data2]))) [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})

(= ((fn [data1 data2]
  (into {}
        (apply map vector [data1 data2]))) [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})

(= ((fn [data1 data2]
  (into {}
        (apply map vector [data1 data2]))) [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})

(true?  ((fn [value value-set]
  (if (contains? value-set value)
    (let [x (get value-set value)]
      (if (= x nil)
      true
      false))
    false)) :a {:a nil :b 2}))

(false? ((fn [value value-set]
  (if (contains? value-set value)
    (let [x (get value-set value)]
      (if (= x nil)
      true
      false))
    false)) :b {:a nil :b 2}))

(false? ((fn [value value-set]
  (if (contains? value-set value)
    (let [x (get value-set value)]
      (if (= x nil)
      true
      false))
    false)) :c {:a nil :b 2}))
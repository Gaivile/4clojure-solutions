(= ((fn [& args]
    (let [x (into [] args)]
        (last (sort x)))) 1 8 3 4) 8)

(= ((fn [& args]
    (let [x (into [] args)]
        (last (sort x)))) 30 20) 30)

(= ((fn [& args]
    (let [x (into [] args)]
        (last (sort x)))) 45 67 11) 67)

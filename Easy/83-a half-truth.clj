(= false ((fn [& args]
  (let [x (into [] args)]
    (if (and (some #(= false %) x) (some #(= true %) x)) true false))) false false))

(= true ((fn [& args]
  (let [x (into [] args)]
    (if (and (some #(= false %) x) (some #(= true %) x)) true false))) true false))

(= false ((fn [& args]
  (let [x (into [] args)]
    (if (and (some #(= false %) x) (some #(= true %) x)) true false))) true))

(= true ((fn [& args]
  (let [x (into [] args)]
    (if (and (some #(= false %) x) (some #(= true %) x)) true false))) false true false))

(= true ((fn [& args]
  (let [x (into [] args)]
    (if (and (some #(= false %) x) (some #(= true %) x)) true false))) false true false))

(= true ((fn [& args]
  (let [x (into [] args)]
    (if (and (some #(= false %) x) (some #(= true %) x)) true false))) true true true false))

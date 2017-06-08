(= 7  ((fn infix [& args]
         (let [prefix (if (not (vector? (first args))) (into [] args) (first args))
               value ((second prefix) (first prefix) (nth prefix 2))
               prefix (drop 3 prefix)]
           (if (empty? prefix)
             value
             (infix (into [] (conj prefix value)))))) 2 + 5))

(= 42 ((fn infix [& args]
         (let [prefix (if (not (vector? (first args))) (into [] args) (first args))
               value ((second prefix) (first prefix) (nth prefix 2))
               prefix (drop 3 prefix)]
           (if (empty? prefix)
             value
             (infix (into [] (conj prefix value)))))) 38 + 48 - 2 / 2))

(= 8  ((fn infix [& args]
         (let [prefix (if (not (vector? (first args))) (into [] args) (first args))
               value ((second prefix) (first prefix) (nth prefix 2))
               prefix (drop 3 prefix)]
           (if (empty? prefix)
             value
             (infix (into [] (conj prefix value)))))) 10 / 2 - 1 * 2))

(= 72 ((fn infix [& args]
         (let [prefix (if (not (vector? (first args))) (into [] args) (first args))
               value ((second prefix) (first prefix) (nth prefix 2))
               prefix (drop 3 prefix)]
           (if (empty? prefix)
             value
             (infix (into [] (conj prefix value)))))) 20 / 2 + 2 + 4 + 8 - 6 - 10 * 9))

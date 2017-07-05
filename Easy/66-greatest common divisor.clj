(= ((fn [x y]
      (let [primes [2 3 5 7 11 13 17 19 23]
            x-primes (flatten
                      (for [a primes
                            :when (= (mod x a) 0)]
                        (conj '() a)))
            y-primes (flatten
                      (for [b primes
                            :when (= (mod y b) 0)]
                        (conj '() b)))]
        (reduce *(clojure.set/intersection (set x-primes) (set y-primes))))) 2 4) 2)

(= ((fn [x y]
      (let [primes [2 3 5 7 11 13 17 19 23]
            x-primes (flatten
                      (for [a primes
                            :when (= (mod x a) 0)]
                        (conj '() a)))
            y-primes (flatten
                      (for [b primes
                            :when (= (mod y b) 0)]
                        (conj '() b)))]
        (reduce *(clojure.set/intersection (set x-primes) (set y-primes))))) 10 5) 5)

(= ((fn [x y]
      (let [primes [2 3 5 7 11 13 17 19 23]
            x-primes (flatten
                      (for [a primes
                            :when (= (mod x a) 0)]
                        (conj '() a)))
            y-primes (flatten
                      (for [b primes
                            :when (= (mod y b) 0)]
                        (conj '() b)))]
        (reduce *(clojure.set/intersection (set x-primes) (set y-primes))))) 5 7) 1)

(= ((fn [x y]
      (let [primes [2 3 5 7 11 13 17 19 23]
            x-primes (flatten
                      (for [a primes
                            :when (= (mod x a) 0)]
                        (conj '() a)))
            y-primes (flatten
                      (for [b primes
                            :when (= (mod y b) 0)]
                        (conj '() b)))]
        (reduce *(clojure.set/intersection (set x-primes) (set y-primes))))) 1023 858) 33)

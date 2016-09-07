(= ((fn [x]
  (loop [fib '(1 1)]
        (if (>= (count fib) x)
          fib
          (recur (sort (conj fib (+ (nth fib (- (count fib) 2)) (last fib)))))))) 3) '(1 1 2))

(= ((fn [x]
  (loop [fib '(1 1)]
        (if (>= (count fib) x)
          fib
          (recur (sort (conj fib (+ (nth fib (- (count fib) 2)) (last fib)))))))) 6) '(1 1 2 3 5 8))

(= ((fn [x]
  (loop [fib '(1 1)]
        (if (>= (count fib) x)
          fib
          (recur (sort (conj fib (+ (nth fib (- (count fib) 2)) (last fib)))))))) 8) '(1 1 2 3 5 8 13 21))

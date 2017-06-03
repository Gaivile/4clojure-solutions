(= 0     (#(Integer/parseInt % 2) "0"))

(= 7     (#(Integer/parseInt % 2) "111"))

(= 8     (#(Integer/parseInt % 2) "1000"))

(= 9     (#(Integer/parseInt % 2) "1001"))

(= 255   (#(Integer/parseInt % 2)_ "11111111"))

(= 1365  (#(Integer/parseInt % 2) "10101010101"))

(= 65535 (#(Integer/parseInt % 2) "1111111111111111"))

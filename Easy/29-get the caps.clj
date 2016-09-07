(= ((fn [string]
  (apply str (re-seq #"[A-Z]+" string))) "HeLlO, WoRlD!") "HLOWRD")

(empty? ((fn [string]
  (apply str (re-seq #"[A-Z]+" string))) "nothing"))

(= ((fn [string]
  (apply str (re-seq #"[A-Z]+" string))) "$#A(*&987Zf") "AZ")

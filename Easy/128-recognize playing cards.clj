(= {:suit :diamond :rank 10} ((fn [in]
                                (let [suit (str (first  (seq in)))
                                      rank (str (last  (seq in)))]
                                  {:suit (case suit
                                           "D" :diamond
                                           "H" :heart
                                           "C" :club
                                           "S" :spade)
                                   :rank (if (number? (read-string rank))
                                           (- (read-string rank) 2)
                                           (case (str rank)
                                             "T" 8
                                             "J" 9
                                             "Q" 10
                                             "K" 11
                                             "A" 12))})) "DQ"))

(= {:suit :heart :rank 3} ((fn [in]
                             (let [suit (str (first  (seq in)))
                                   rank (str (last  (seq in)))]
                               {:suit (case suit
                                        "D" :diamond
                                        "H" :heart
                                        "C" :club
                                        "S" :spade)
                                :rank (if (number? (read-string rank))
                                        (- (read-string rank) 2)
                                        (case (str rank)
                                          "T" 8
                                          "J" 9
                                          "Q" 10
                                          "K" 11
                                          "A" 12))})) "H5"))

(= {:suit :club :rank 12} ((fn [in]
                             (let [suit (str (first  (seq in)))
                                   rank (str (last  (seq in)))]
                               {:suit (case suit
                                        "D" :diamond
                                        "H" :heart
                                        "C" :club
                                        "S" :spade)
                                :rank (if (number? (read-string rank))
                                        (- (read-string rank) 2)
                                        (case (str rank)
                                          "T" 8
                                          "J" 9
                                          "Q" 10
                                          "K" 11
                                          "A" 12))})) "CA"))

(= (range 13) (map (comp :rank (fn [in]
                                 (let [suit (str (first  (seq in)))
                                       rank (str (last  (seq in)))]
                                   {:suit (case suit
                                            "D" :diamond
                                            "H" :heart
                                            "C" :club
                                            "S" :spade)
                                    :rank (if (number? (read-string rank))
                                            (- (read-string rank) 2)
                                            (case (str rank)
                                              "T" 8
                                              "J" 9
                                              "Q" 10
                                              "K" 11
                                              "A" 12))})) str)
                   '[S2 S3 S4 S5 S6 S7
                     S8 S9 ST SJ SQ SK SA]))

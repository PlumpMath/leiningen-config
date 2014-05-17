{:user
 {:plugins [[lein-pprint "1.1.1"]
            [lein-try "0.4.1"]
            ;;[lein-marginalia "0.7.1"]
            ;;[lein-midje "3.0.0"]
            ;;[lein-deps-tree "0.1.2"]
            ;;[lein-ritz "0.7.0"]]
            ]
  :dependencies [[org.clojure/tools.trace "0.7.6"]
                 [org.thnetos/cd-client "0.3.6"]
                 ;;[ritz/ritz-nrepl-middleware "0.7.0"]
                 ] 
  :repl-options {
                 :init
                 (do 
                   (require '[cd-client.core :as c])
                   (c/set-local-mode! "/Users/zand/dev/docs/clojuredocs-snapshot-latest.txt")
                   (require '[clojure.tools.trace :as t])
                   )
                 }
  }
}

; :nrepl-middleware
;                  [
;                  ;;ritz.nrepl.middleware.javadoc/wrap-javadoc
;                  ;; ritz.nrepl.middleware.simple-complete/wrap-simple-complete
;                  ;; ritz.nrepl.middleware.apropos/wrap-apropos
;                  ]

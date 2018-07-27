(ns child.core
  ;; (:gen-class)
  (:require [selmer.parser :as parser]
            [clojure.java.io :as io]))

(parser/set-resource-path! "templates")

(defn output
  []
  (parser/render-file "demo.html" {}))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World Child!")
  (println (output)))

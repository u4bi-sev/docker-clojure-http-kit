(ns c-http-kit.core
  (:use org.httpkit.server)
  (:require [compojure.core :refer [defroutes GET POST PUT DELETE context]]
            [compojure.route :refer [resources not-found]])
  (:gen-class))

(defroutes handler
           (GET "/" [] "<h1>u4bi</h1>")
           (resources "/")
           (not-found "<h1>page not found</h1>"))

(defn -main []
  (let [port (read-string (or (System/getenv "PORT") "3000"))]
  (run-server #'handler {:port port})
  (println "Started server on port" port)))
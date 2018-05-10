(ns c-http-kit.core
  (:use org.httpkit.server)
  (:require [compojure.core :refer [defroutes GET POST PUT DELETE context]]
            [compojure.route :refer [resources not-found]]))

(defroutes handler
           (GET "/" [] "<h1>u4bi</h1>")
           (resources "/")
           (not-found "<h1>page not found</h1>"))

(defn -main []
  (run-server #'handler {:port 8080})
  (println "Started server on port 8080"))
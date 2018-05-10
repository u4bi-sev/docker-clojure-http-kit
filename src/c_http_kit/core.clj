(ns c-http-kit.core
  (:use org.httpkit.server)
  (:require [compojure.core :refer [defroutes GET POST PUT DELETE context]]
            [compojure.route :refer [resources not-found]]
            [compojure.handler :as h]
            [ring.middleware.json :as m-json]
            [ring.middleware.cors :refer [wrap-cors]])
  (:gen-class))

(defroutes handler
           (GET "/" [] "<h1>u4bi</h1>")
           (GET "/search/:text" [text] (str "search " text))
           (resources "/")
           (not-found "<h1>page not found</h1>"))

(def app 
  (-> (h/api handler)
      (m-json/wrap-json-params)
      (m-json/wrap-json-response)
      (wrap-cors :access-control-allow-origin [#".*"]
                 :access-control-allow-methods [:get :put :post :delete])))

(defn -main []
  (let [port (read-string (or (System/getenv "PORT") "3000"))]
  (run-server #'handler {:port port})
  (println "Started server on port" port)))
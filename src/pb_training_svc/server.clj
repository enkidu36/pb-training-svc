(ns pb-training-svc.server
  (:require [pb-training-svc.handler :refer [app]]
            [ring.adapter.jetty :as jetty]))

(defn start []
  (jetty/run-jetty #'app {:port 3031, :join? false})
  (println "server running in port 3031"))

  (defn -main [& _]
    (start))
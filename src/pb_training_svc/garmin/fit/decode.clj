(ns pb-training-svc.garmin.fit.decode
  (:require  [clojure.tools.logging :as log]
             [pb-training-svc.garmin.fit.sdk :as sdk]))

(defn decode [file]
  (log/info (str "Decode fit file. SDK - " sdk/version)))

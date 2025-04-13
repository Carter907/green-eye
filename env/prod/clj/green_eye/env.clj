(ns green-eye.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[green-eye started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[green-eye has shut down successfully]=-"))
   :middleware identity})

(ns green-eye.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [green-eye.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[green-eye started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[green-eye has shut down successfully]=-"))
   :middleware wrap-dev})

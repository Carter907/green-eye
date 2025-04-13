(ns green-eye.routes.home
  (:require
   [green-eye.layout :as layout]
   [clojure.java.io :as io]
   [green-eye.middleware :as middleware]
   [ring.util.response]
   [ring.util.http-response :as response]))



(defn home-page [request]
  (layout/render request "home.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page [request]
  (layout/render request "about.html"))

(defn deforest-page [request]
  (layout/render request "deforestation.html" {:deforest (-> "docs/deforest.md" io/resource
                                                             slurp)}))

(defn home-routes []
  [ "" 
   {:middleware [middleware/wrap-csrf
                 middleware/wrap-formats
                 ]}
   ["/" {:get home-page}]
   ["/about" {:get about-page}]
   ["/deforest" {:get deforest-page}]
   ])


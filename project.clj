(defproject c-http-kit "0.1.0"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.6.1"]
                 [http-kit "2.2.0"]
                 [ring/ring-json "0.4.0"]
                 [ring-cors "0.1.12"]
                 [javax.servlet/servlet-api "2.5"]]
  :jvm-opts ["--add-modules" "java.xml.bind"]
  :main c-http-kit.core
  :profiles {:uberjar {:aot :all}})
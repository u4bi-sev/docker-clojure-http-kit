lein uberjar

docker build -t clojure-http .

docker run --rm -p 80:80 clojure-http
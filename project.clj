(defproject com.wagjo/clojurescript "0.1.0-SNAPSHOT"
  :description "Fork of a ClojureScript with small adjustments."
  :url "https://github.com/wagjo/clojurescript"
  :dependencies [;; [org.clojure/clojure "1.5.1"]
                 [com.wagjo/closure-library "0.1.0-SNAPSHOT"]
                 [org.clojure/data.json "0.2.3"]
                 [org.clojure/tools.reader "0.7.10"]
                 ;; http://code.google.com/p/closure-compiler/wiki/Maven
                 [com.google.javascript/closure-compiler "v20131014"]
                 [org.mozilla/rhino "1.7R4"]]
  :profiles {:1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}}
  :source-paths ["src/clj"]
  :resource-paths ["src/cljs"]
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as ClojureScript"}
  :jvm-opts ^:replace ["-server"]
  :jar-exclusions [#"project.clj"]
  :min-lein-version "2.0.0")

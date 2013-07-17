(defproject com.wagjo/clojurescript "0.1.0-SNAPSHOT"
  :description "Fork of a ClojureScript with small adjustments."
  :url "https://github.com/wagjo/clojurescript"
  :dependencies [[com.wagjo/closure-library "0.1.0-SNAPSHOT"]
                 ;; http://code.google.com/p/closure-compiler/wiki/Maven
                 [com.google.javascript/closure-compiler "v20130603"]
                 [org.mozilla/rhino "1.7R4"]]
  :source-paths ["src/clj" "src/cljs"]
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as ClojureScript"}
  :jar-exclusions [#"project.clj"])

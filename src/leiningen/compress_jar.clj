(ns leiningen.compress-jar
  (:require [metabase.jar-compression :as jar-compression]))

(defn- parse-options [options]
  (for [option options]
    (let [parsed (read-string option)]
      (if (symbol? parsed)
        (str parsed)
        parsed))))

(defn ^:no-project-needed compress-jar
  "Compress a JAR file. All options passed to the Metabase `jar-compression` library; see full list of options at
  https://github.com/metabase/jar-compression."
  [_ input-filename & options]
  (apply jar-compression/compress! input-filename (parse-options options)))

[![Clojars Project](https://img.shields.io/clojars/v/metabase/lein-compress-jar.svg)](https://clojars.org/metabase/lein-compress-jar)

A Leiningen plugin to compress JARs, pack them with Pack 200, and strip directories, source files, and blacklisted classes using https://github.com/metabase/jar-compression.

Typical usage:

```bash
lein compress-jar resources/modules/vertica.metabase-driver.jar :compression :xz \
  :pack200 true :out resources/modules/vertica.metabase-driver.jar.pack.xz
```

All options are passed directly to `jar-compression`'s `compress!`
function; see the [`jar-compression` README](https://github.com/metabase/jar-compression) for a full list
of options.

### License

Copyright © 2018 Metabase, Inc.

Distributed under the Eclipse Public License, same as Clojure.

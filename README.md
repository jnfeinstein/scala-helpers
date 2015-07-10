### Installing

Add this to your `build.sbt`
```scala
libraryDependencies += "joelf.helpers" %% "scala-helpers" % "0.0.1"

val joelfHelpersUrl = url("https://raw.githubusercontent.com/jnfeinstein/scala-helpers/master/releases")

resolvers += Resolver.url("scala-helpers", joelfHelpersUrl)(Resolver.ivyStylePatterns)
```

### Usage

```scala
import joelf.helpers.PairedColletions._

Seq(2, 4, 6, 8).keyBy(_ / 2)
// => Seq(1 -> 2, 2 -> 4, 3 -> 6, 4 -> 8)
Seq("x" -> 4, "x" -> 6, "y" -> 12).reduceByKey
// => Map("x" -> 10, "y" -> 12)
```

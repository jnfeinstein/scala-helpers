name := "scala-helpers"

organization := "joelf.helpers"

version := "0.0.1"

assemblyJarName in assembly := "scala-helpers.jar"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

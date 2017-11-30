// Project name (artifact name in Maven)
name := "CAPD System Tests"

version := "1.0-SNAPSHOT"

description := "CAPD System test project"

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false



libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12",
  "org.pegdown" % "pegdown" % "1.6.0" % Test,
  "org.scalatest" %% "scalatest" % "3.0.0" % Test
 
)

testOptions in Test ++= Seq(
  Tests.Argument(TestFrameworks.ScalaTest, "-u", "target/test-reports"),
  Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports")
)

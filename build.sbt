val dottyVersion = "0.27.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Experimenting",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.2" % "test"
    )
  )

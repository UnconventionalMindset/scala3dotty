lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Experimenting",
    version := "0.1.0",

    scalaVersion := "3.0.0",

    resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    
    libraryDependencies ++= Seq(
      ("org.scalatest" %% "scalatest" % "3.2.9" % Test),
      ("org.scalatestplus" %% "scalacheck-1-15" % "3.2.9.0" % Test),
      ("org.scalacheck" %% "scalacheck" % "1.15.4" % Test),
      ("org.scalactic" %% "scalactic" % "3.2.9" % Test),
    )
  )

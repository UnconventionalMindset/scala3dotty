lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Experimenting",
    version := "0.2.0",

    scalaVersion := "3.2.1-RC1-bin-20220716-bb9c8ff-NIGHTLY",

    resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    
    libraryDependencies ++= Seq(
      ("org.scalatest" %% "scalatest" % "3.2.11" % Test),
      ("org.scalatestplus" %% "scalacheck-1-15" % "3.2.11.0" % Test),
      ("org.scalacheck" %% "scalacheck" % "1.16.0" % Test),
      ("org.scalactic" %% "scalactic" % "3.2.9" % Test),
    )
  )

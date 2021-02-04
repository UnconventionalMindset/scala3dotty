lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Experimenting",
    version := "0.1.0",

    scalaVersion := "3.0.0-M3",

    resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
    
    libraryDependencies ++= Seq(
      ("org.scalatest" %% "scalatest" % "3.2.4-M1" % Test),
      ("org.scalatestplus" %% "scalacheck-1-15" % "3.2.4.0-M1" % Test).intransitive().withDottyCompat(scalaVersion.value),
      ("org.scalacheck" %% "scalacheck" % "1.15.2" % Test).withDottyCompat(scalaVersion.value),
      ("org.scalactic" %% "scalactic" % "3.2.4-M1" % Test),
    )
  )

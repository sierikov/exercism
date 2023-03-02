lazy val root = project
  .in(file("."))
  .settings(
    name := "exercism",
    moduleName := "exercism",
    description := "Collection of solutions to exercism problems",
    version := "0.0.1",
    scalaVersion := "3.2.2",
    scalacOptions ++= Seq("-deprecation", "-feature"),
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )

addCommandAlias("check", ";scalafmtCheck;Test / scalafmtCheck")

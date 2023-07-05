ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "event-scraper",
    libraryDependencies ++= Seq(
      "org.jsoup" % "jsoup" % "1.15.3",
      "net.ruippeixotog" %% "scala-scraper" % "3.0.0",
      "org.seleniumhq.selenium" % "selenium-java" % "4.5.0"
    )
  )

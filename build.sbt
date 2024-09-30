ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
  .settings(
    name := "akka-projections",
    idePackagePrefix := Some("com.nashtech")
  )

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % "2.9.0-M2",
  "com.typesafe.akka" %% "akka-stream" % "2.9.0-M2",
  "com.lightbend.akka" %% "akka-projection-jdbc" % "1.5.0-M4",
  "com.typesafe.akka" %% "akka-slf4j" % "2.9.0-M2",
  "org.postgresql" % "postgresql" % "42.7.4",
  "com.typesafe.slick" %% "slick" % "3.5.2",
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence" % "2.9.0-M2",
  "com.lightbend.akka" %% "akka-projection-eventsourced" % "1.5.0-M4",
  "com.typesafe.akka" %% "akka-actor" % "2.9.0-M2",
  "com.lightbend.akka" %% "akka-projection-core" % "1.5.0-M4",
  "org.postgresql" % "postgresql" % "42.7.4",
  "org.scalikejdbc" %% "scalikejdbc" % "4.3.2",
  "ch.qos.logback" % "logback-classic" % "1.5.8",
  "org.scalatest" %% "scalatest" % "3.2.19" % Test
)






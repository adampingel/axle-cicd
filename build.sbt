val scala3Version = "3.1.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "axle-cicd",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )

lazy val docs = project
  .settings(
    name := "axle-docs",
    scalaVersion := scala3Version,
    mdocIn := file("axle-docs/src/site/mdoc"),
    Laika / sourceDirectories := Seq(file("axle-docs/target/mdoc"))
  ).dependsOn(root)
  .enablePlugins(MdocPlugin)
  .enablePlugins(LaikaPlugin)

  // axle-docs/target/mdoc
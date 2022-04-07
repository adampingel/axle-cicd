val scala3Version = "3.1.1"

lazy val foo = project
  .in(file("axle-foo"))
  .settings(
    name := "axle-foo",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )

lazy val docs = project
  .settings(
    name := "axle-docs",
    scalaVersion := scala3Version,
    mdocIn := file("axle-docs/src/site/mdoc"),
    mdocOut := file("axle-docs/target/mdoc"),
    Laika / sourceDirectories := Seq(file("axle-docs/target/mdoc")),
    laikaExtensions ++= Seq(
      laika.markdown.github.GitHubFlavor,
      laika.parse.code.SyntaxHighlighting)
  ).dependsOn(foo)
  .enablePlugins(MdocPlugin)
  .enablePlugins(LaikaPlugin)

  // axle-docs/target/mdoc
val scala3Version = "3.1.1"

lazy val foo = project
  .in(file("axle-foo"))
  .enablePlugins(Sonatype)
  .settings(
    name := "axle-foo",
    organization := "org.axle-lang",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    publishTo := sonatypePublishToBundle.value,
    sonatypeProfileName := "org.axle-lang"
  )

lazy val docs = project
  .dependsOn(foo)
  .enablePlugins(MdocPlugin, LaikaPlugin, SitePlugin, GhpagesPlugin)
  .settings(
    name := "axle-docs",
    scalaVersion := scala3Version,
    mdocIn := file("axle-docs/src/site/mdoc"),
    mdocOut := file("axle-docs/target/mdoc"),
    Laika / sourceDirectories := Seq(file("axle-docs/target/mdoc")),
    laikaExtensions ++= Seq(
      laika.markdown.github.GitHubFlavor,
      laika.parse.code.SyntaxHighlighting),
    siteSourceDirectory := file("docs/target/docs/site/"),
    git.remoteRepo := "git@github.com:adampingel/axle-cicd.git"
  )


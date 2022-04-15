val scala3Version = "3.1.1"

def jarify(p: Project): Project =
  p
//  .enablePlugins(Sonatype)
  .settings(
    organization := "org.axle-lang",
    homepage := Some(url("https://cicd.axle-lang.org")),
    licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
    developers := List(
    Developer(
      "adampingel",
      "Adam Pingel",
      "adam@axle-lang.org",
      url("https://twitter.com/pingel")
    )),
//    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
//    publishTo := sonatypePublishToBundle.value
  )

lazy val foo = jarify(Project("foo", file("axle-foo")))

lazy val bar = jarify(Project("bar", file("axle-bar")))

lazy val docs = project
  .dependsOn(foo, bar)
  .enablePlugins(MdocPlugin, LaikaPlugin, SitePlugin, GhpagesPlugin)
  .settings(
    name := "axle-docs",
    scalaVersion := scala3Version,
    mdocIn := file("axle-docs/src/site/mdoc"),
    mdocOut := file("axle-docs/target/mdoc"),
    Laika / sourceDirectories := Seq(file("axle-docs/target/mdoc")),
    laikaSite / target := file("axle-docs/target/site"),
    laikaExtensions ++= Seq(
      laika.markdown.github.GitHubFlavor,
      laika.parse.code.SyntaxHighlighting),
    siteSourceDirectory := file("axle-docs/target/site"),
    ghpagesCleanSite / excludeFilter :=
      new FileFilter{
        def accept(f: File) = (ghpagesRepository.value / "CNAME").getCanonicalPath == f.getCanonicalPath
      } || "versions.html",
    git.remoteRepo := "git@github.com:adampingel/axle-cicd.git"
  )


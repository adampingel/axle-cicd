# axle-cicd

testbed for refreshing tools in axle release process

## TO DO

### High priority must-haves

* Covered in [this post](https://eed3si9n.com/auto-publish-sbt-plugin-from-github-actions/)
* Install [sbt-ci-release](https://github.com/sbt/sbt-ci-release) sbt plugin (tag, create, release artifact)
* Spiewak’s gh action sbt plugin (compile via github action & run tests)
* sitegen with mdoc / Laika?
  * https://github.com/http4s/http4s/pull/5313
* release site and jar

### Nice-to-have

* deploy to container, local k8s cluster, etc
* test coverage report
* security scan
* performance benchmark
* move to axle/axle-cicd?

## Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).

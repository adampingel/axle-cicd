# axle-cicd

testbed for refreshing tools in axle release process

## TO DO

* [sbt-sonatype](https://github.com/xerial/sbt-sonatype)
* [sbt-ci-release](https://github.com/sbt/sbt-ci-release)
  * tag, create, release artifact
* [sbt-github-actions](https://github.com/djspiewak/sbt-github-actions)
* release site and jar
* home icon (at top)
* remove .html from links

### Later

* deploy to container, local k8s cluster, etc
* test coverage report
* security scan
* performance benchmark
* move to axle/axle-cicd?

## Usage

`sbt compile`
`sbt run`
`sbt console`

## Build steps

```bash
sbt clean docs/mdoc docs/laikaSite
```

```bash
sbt docs/laikaPreview
```

then browse to [https://localhost:4242](https://localhost:4242)

```bash
sbt docs/ghpagesPushSite
```

Verify by browsing to the [site](https://adampingel.github.io/axle-cicd/)

## References

* [Laika](https://planet42.github.io/Laika/index.html)
  * [http4s Laika PR](https://github.com/http4s/http4s/pull/5313)
* [sbt-site](https://www.scala-sbt.org/sbt-site/)
* [sbt-ghpages](https://github.com/sbt/sbt-ghpages)
  * Note the instructions to set up a `gh-pages` branch
* [custom domain for github pages](https://docs.github.com/en/pages/configuring-a-custom-domain-for-your-github-pages-site)
  * Note instructions for apex domains

# axle-cicd

testbed for refreshing tools in axle release process

## TO DO

### Site

* `sbt-site`
* dns alias for cicd.axle-lang.org

### Release via git tag

* [sbt-ci-release](https://github.com/sbt/sbt-ci-release) sbt plugin (tag, create, release artifact)
* Spiewak’s gh action sbt plugin (compile via github action & run tests)
* release site and jar

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

## References

* [Laika](https://planet42.github.io/Laika/index.html)
  * [http4s Laika PR](https://github.com/http4s/http4s/pull/5313)
* [sbt-ghpages](https://github.com/sbt/sbt-ghpages)

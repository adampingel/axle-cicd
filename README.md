# axle-cicd

testbed for refreshing tools in axle release process

## TO DO

### High priority must-haves

* mv Foo and Bar to axle-foo directory
* fix confusion about List[Int]
* mv Laika md files to axle-docs
* mdoc
* publish site to gh pages
* dns alias for cicd.axle-lang.org
* [sbt-ci-release](https://github.com/sbt/sbt-ci-release) sbt plugin (tag, create, release artifact)
* Spiewak’s gh action sbt plugin (compile via github action & run tests)
* release site and jar

### Nice-to-have

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
sbt docs/mdoc
sbt docs/laikaSite
```

```bash
sbt docs/laikaPreview
```

then browse to [https://localhost:4242](https://localhost:4242)

## References

* [http4s Laika PR](https://github.com/http4s/http4s/pull/5313)

* [autopublish sbt plugin](https://eed3si9n.com/auto-publish-sbt-plugin-from-github-actions/)

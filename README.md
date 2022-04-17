# axle-cicd

testbed for refreshing tools in axle release process

## TO DO

Confirm v0.1.10 made it to [maven central](https://repo1.maven.org/maven2/org/axle-lang/)

### Before port to axle

* generate image during axle-foo test and then move into laika site
* home icon (at top)
* remove .html from links
* latest released version badge

* What's writing to `./docs`?

* custom 404
* 404 redirect.  Add this to 404.md header:

```md
layout: forward
target: https://cicd.axle-lang.org
```

* google analytics
* ghpagesCleanSite leaving stale HelloMDoc.html

### Later

* deploy to container, local k8s cluster, etc
* test coverage report
* security scan
* performance benchmark
* move to axle/axle-cicd?

## Usage

## Update site

```bash
sbt clean docs/mdoc docs/laikaSite
```

```bash
sbt docs/laikaPreview
```

then browse to [https://localhost:4242](https://localhost:4242)

```bash
sbt docs/ghpagesCleanSite docs/ghpagesPushSite
```

Monitor [https://github.com/adampingel/axle-cicd/actions/workflows/pages/pages-build-deployment](progress) of action.

Verify by browsing to the [site](https://adampingel.github.io/axle-cicd/)

### Publish snapshots

Push commits to repo.

Monitor [progress](https://github.com/adampingel/axle-cicd/actions/workflows/release.yml) of github action.

Confirm jars are present at the [sonatype snapshot repo](https://oss.sonatype.org/content/repositories/snapshots/org/axle-lang/)

### Release new version

For example, tag with a version:

```bash
git tag -a v0.1.6 -m "v.0.1.6"
git push origin v0.1.6
```

Monitor [progress](https://github.com/adampingel/axle-cicd/actions/workflows/release.yml)

Confirm jars are present at the [sonatype repo](https://oss.sonatype.org/content/repositories/releases/org/axle-lang/)

## Old steps

* Log in to [sonatype](https://oss.sonatype.org/) using credentials in `~/.sbt/1.0/sonatype.sbt`
* Select "Staging Repositories"
* find org.axle-lang repository
* close
* "closing axle $v"
* wait
* find org.axle-lang repository
* release
* "releasing axle $v"

## References

* [Laika](https://planet42.github.io/Laika/index.html)
  * [http4s Laika PR](https://github.com/http4s/http4s/pull/5313)
* [sbt-site](https://www.scala-sbt.org/sbt-site/)
* [sbt-ghpages](https://github.com/sbt/sbt-ghpages)
  * Note the instructions to set up a `gh-pages` branch
* [custom domain for github pages](https://docs.github.com/en/pages/configuring-a-custom-domain-for-your-github-pages-site)
  * Note instructions for apex domains
* [sbt-sonatype](https://github.com/xerial/sbt-sonatype)
* [sbt-ci-release](https://github.com/sbt/sbt-ci-release)

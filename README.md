## Sample project using Scala 3 compiler (Currently named Dotty)

### Usage

This is a normal sbt project, you can compile it with
```
sbt compile
```
and run it with
```
sbt run
```
to start a Dotty REPL, use:
```
sbt console
``` 
and finally, to run tests (not working):
```
sbt test
```
### Tooling
Dotty: `0.27.0-RC1`

SBT `1.3.13`

sbt-dotty `0.4.2`

Tested using JVM 13 & JVM 11

### Known issues
1. When running `sbt test` Scalatest returns the following error:
```value shouldBe is not a member of Boolean```
1. When running tests, the new quiet syntax does not seem to be recognised correctly.
## Sample project using Scala 3

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
Dotty: `0.24.0-RC1`

SBT `1.3.10`

sbt-dotty `0.4.1`

Tested using JVM 13

### Known issues
1. When running `sbt test` Scalatest returns the following error:
```value shouldBe is not a member of Boolean```
1. When running tests, the new quiet syntax does not seems to be recognised correctly.
## Sample project using Scala 3 compiler

### Usage

This is a normal sbt project, you can compile it with
```
sbt compile
```
and run it with (do NOT use Intellij for now)
```
sbt run
```
to start a Scala 3 REPL, use:
```
sbt console
``` 
and finally, to run tests:
```
sbt test
```
### Tooling
Scala Version: `3.0.0-M3`

SBT `1.4.7`

sbt-dotty `0.5.2`

Tested using JVM 11

### Known issues
1. When running tests, the new quiet syntax does not seem to be recognised correctly.
1. SBT actions do not work on intellij, but do work in SBT when used from CLI.
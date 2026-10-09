# octiq-java-maven-multimodule

> Synthetic fixture for testing Octiq's GitHub import of Java projects. Not a real application.

## Scenario

A dependency-free Maven reactor: root aggregator POM with modules `core` then `api`, where `api` depends on `core`. Java 17 comes from `maven.compiler.release` in the root properties.

## What this exercises

- Module list detection from `<modules>`
- A reactor build where one module depends on another (`core` builds before `api`)
- `maven.compiler.release` version precedence

## Expected result on import

| Field | Expected |
| --- | --- |
| stack | `java` |
| build tool | `maven` |
| Java version | `17` |
| image | `maven:3.9-eclipse-temurin-17` |
| framework | `java` |
| modules | `["core", "api"]` |
| final phase | `ready` |
| build green | `true` |

No external dependencies anywhere; `api` depends only on its sibling `core`.

## Layout

```
pom.xml
core/pom.xml
core/src/main/java/com/octiq/fixture/core/Greeter.java
api/pom.xml
api/src/main/java/com/octiq/fixture/api/GreetingService.java
```

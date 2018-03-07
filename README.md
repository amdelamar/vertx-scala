# vertx-scala

A simple Scala webapp using Eclipse [Vert.x](http://vertx.io)

## Prerequisites

* [Java 1.8](https://www.java.com/download/)
* [Scala 2.12](https://www.scala-lang.org/download/)
* [Docker](https://docs.docker.com/engine/installation/) (Optional)

## Download and Build

1. Download code `git clone https://github.com/amdelamar/vertx-scala`
1. `cd vertx-scala`
1. Run build `./gradlew clean build`

## Run 

1. Start server `scala build/libs/vertx-scala-0.1.0.jar`
1. Visit [https://localhost:8080/](https://localhost:8080/) to see the app running.

## Run with Redeploy

App can be run in redeploy mode, so any changes to files are recompiled quickly. Which is useful for development.

1. Run redeploy `./gradlew run`
1. Visit [https://localhost:8080/](https://localhost:8080/) to see the app running.

This last command launches the application and redeploys as soon as you change something in `src/`.

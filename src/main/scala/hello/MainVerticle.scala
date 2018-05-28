package hello

import io.vertx.lang.scala.ScalaVerticle
import scala.reflect.api.materializeTypeTag

class MainVerticle extends ScalaVerticle {

  override def start(): Unit = {
    println("Starting")
    vertx
      .createHttpServer()
      .requestHandler(_.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Scala + Vert.x"))
      .listen(8080)
     println("Started on port",8080)
  }
  
  override def stop(): Unit = {
   println("Stopping")
 }
}
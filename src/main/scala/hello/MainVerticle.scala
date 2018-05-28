package hello

import io.vertx.lang.scala.ScalaVerticle
import scala.reflect.api.materializeTypeTag
import io.vertx.scala.core.Vertx

object MainVerticle {
  
  /** Main method deploys the verticle */
  def main(args: Array[String]): Unit = {
    val vertx = Vertx.vertx
    vertx.deployVerticle(ScalaVerticle.nameForVerticle[hello.MainVerticle])
  }
  
}

class MainVerticle extends ScalaVerticle {

  /** Start the verticle */
  override def start(): Unit = {
    println("Starting")
    vertx
      .createHttpServer()
      .requestHandler(_.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Scala + Vert.x"))
      .listen(8080)
     println("Started on port "+8080)
  }
  
  override def stop(): Unit = {
   println("Stopping")
 }
}
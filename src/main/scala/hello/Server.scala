package hello

import io.vertx.core.Vertx
import io.vertx.lang.scala.ScalaVerticle

object Server {
  
  def main(args: Array[String]): Unit = {
    val vertx = Vertx.vertx
    vertx.deployVerticle(ScalaVerticle.nameForVerticle[hello.MainVerticle])
  }
  
}
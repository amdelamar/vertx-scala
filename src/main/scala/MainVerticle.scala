import io.vertx.core.Vertx
import io.vertx.lang.scala.ScalaVerticle

object MainVerticle {
  def main(args: Array[String]): Unit = {
    val vertx = Vertx.vertx
    vertx.deployVerticle(ScalaVerticle.nameForVerticle[MainVerticle])
  }
}

class MainVerticle extends ScalaVerticle {

  override def start(): Unit = {
    println("Starting")
    vertx
      .createHttpServer()
      .requestHandler(_.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Vert.x"))
      .listen(8080)
     println("Started on port 8080")
  }
  
  override def stop(): Unit = {
   println("Stopping")
 }
}
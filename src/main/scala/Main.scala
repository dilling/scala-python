import me.shadaj.scalapy.py
import me.shadaj.scalapy.py.SeqConverters

object Main extends App {
  println("Hello, World!")

  val result = Langchain.run()
  println(result)
}
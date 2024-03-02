import me.shadaj.scalapy.py
import me.shadaj.scalapy.py.SeqConverters

object Main extends App {
  println("Hello, World!")
  val list = py.Dynamic.global.range(1, 3 + 1)


  val listSum = py.Dynamic.global.sum(list)

  println(listSum)
}
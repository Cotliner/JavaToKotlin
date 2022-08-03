
fun main() {
  val banana = Banana("The Yellow Banana have 40 sugar")
  val apple = Apple("red")
  val avocado = Avocado
  println("The %s %s have %s sugar".format(apple.color, apple.name, apple.sugar))
  println("The %s have %s sugar".format(avocado.name, avocado.sugar))
  println(orange.toString())
  println(banana.example)
}

sealed interface Eatable

data class Apple( // Data class are final
  val color: String
) : Eatable {
  val name: String get() = "Apple"
  val sugar: Int get() = 50
}

object Avocado : Eatable {
  val name: String get() = "Avocado"
  val sugar: Int get() = 20
}

val orange = object {
  val name: String = "Orange"
  val sugar: Int = 60

  override fun toString(): String = "The $name have $sugar sugar"
}

@JvmInline
value class Banana(val example: String)
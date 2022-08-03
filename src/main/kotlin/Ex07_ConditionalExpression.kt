import kotlin.math.roundToInt

fun main() {
  val randOne: Int = Math.random().roundToInt()
  val randTwo: Int = Math.random().roundToInt()

  val toPrint: String? = if (randOne == 0 && randTwo == 0) "I love Koltin"
  else if (randTwo == 0) "I love Java"
  else null

  println(toPrint)
}
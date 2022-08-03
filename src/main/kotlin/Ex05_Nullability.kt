import kotlin.math.roundToInt

fun main() {
  val result: String? = nullHalfTheTime()
  println(result?.lowercase())
  // Or we can pass a default value
  val default: String = nullHalfTheTime() ?: "I love Java"
  println(default)
}

fun nullHalfTheTime(): String? {
  val rand: Int = Math.random().roundToInt() // Provide us 0 or 1 number
  return if (rand == 0) "I love Kotlin" else null
}
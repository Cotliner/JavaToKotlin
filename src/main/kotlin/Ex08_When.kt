import Color.BLUE
import Color.GREEN
import Color.ORANGE
import Color.PURPLE
import Color.RED
import Color.WHITE
import Color.YELLOW


fun main() {
  println(adjacentColor(GREEN))
  println(adjacentColor(WHITE))
}

fun adjacentColor(color: Color): String = when (
  color
) {
  BLUE, GREEN -> "yellow"
  RED, PURPLE -> "blue"
  YELLOW, ORANGE -> "red"
  else -> { println("The color could not be found."); "Unknown Color" }
}

enum class Color {
  BLUE,
  GREEN,
  RED,
  PURPLE,
  YELLOW,
  ORANGE,
  WHITE
}
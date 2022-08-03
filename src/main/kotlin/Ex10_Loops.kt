fun main() {
  arrayOf("Apple", "Banana", "Orange").printer()
}

fun Array<String>.printer() {
  for (i in 0 .. size - 1) {
    val fruit: String = this[i]
    println("$i: $fruit")
  }

  for (i in 0 until  size) {
    val fruit: String = this[i]
    // println("$i: $fruit")
  }

  for (i in 0 until  lastIndex) {
    val fruit: String = this[i]
    // println("$i: $fruit")
  }

  for (i in indices) {
    val fruit: String = this[i]
    // println("$i: $fruit")
  }
}
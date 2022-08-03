fun main() {
  println(higherOrderFunction(1, 2, Int::plus))
}

fun higherOrderFunction(
  one: Int,
  two: Int,
  operation: (Int, Int) -> Int
): Int = operation(one, two)
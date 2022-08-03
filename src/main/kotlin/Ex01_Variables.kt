fun main() {
  val hello = "Hello" // final variable => Not re-assignable
  var europcar = "Europcar" // re-assignable variable
  val (first, second) = Pair("Hello", "Europcar") // Kotlin destructuring
  println("$hello $europcar")
  println("$first $second")
}
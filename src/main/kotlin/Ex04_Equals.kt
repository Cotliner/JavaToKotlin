fun main() {
  val refInt1 = 0
  val refInt2 = 0
  println(refInt1 == refInt2) // To check equality

  val ref1: List<String> = listOf("Hello")
  val ref2: List<String> = listOf("Hello")

  println(ref1 === ref2) // To check references
  println(ref1 == ref2) // To check equality
}
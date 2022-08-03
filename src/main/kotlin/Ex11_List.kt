fun main() {
  /* List are Immutable on Kotlin */
  /* MutableList are mutable on Kotlin */

  val oneFruitMutable: MutableList<String> = mutableListOf("Kiwi") // Mutable singleton list of fruit
  val oneFruitImmutable: List<String> = listOf("Kiwi") // Immutable singleton list of fruit

  val fruits: MutableList<String>  = mutableListOf("Apple", "Banana", "Orange") // Mutable list of fruits

  val otherFruits: List<String> = listOf("Avocado", "Ananas", "Cranberry") // Immutable list of fruits

  val noFruitMutable: MutableList<String> = mutableListOf() // Mutable empty list
  val noFruitImmutable: List<String> = listOf() // Immutable empty list
}
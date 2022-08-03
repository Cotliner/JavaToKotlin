fun main() {
  /* Set are Immutable on Kotlin */
  /* MutableSet are mutable on Kotlin */

  val oneFruitMutable: MutableSet<String> = mutableSetOf("Kiwi") // Mutable singleton set of fruit
  val oneFruitImmutable: Set<String> = setOf("Kiwi") // Immutable singleton set of fruit

  val fruits: MutableSet<String>  = mutableSetOf("Apple", "Banana", "Orange") // Mutable set of fruits

  val otherFruits: Set<String> = setOf("Avocado", "Ananas", "Cranberry") // Immutable set of fruits

  val noFruitMutable: MutableSet<String> = mutableSetOf() // Mutable empty set
  val noFruitImmutable: Set<String> = setOf() // Immutable empty set
}
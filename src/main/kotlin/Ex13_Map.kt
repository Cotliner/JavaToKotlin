fun main() {
  val singleFruitWithSugarImmutable: Map<String, Int> = mapOf("Kiwi" to 60) // Immutable singleton Map of fruit
  val singleFruitWithSugarMutable: MutableMap<String, Int> = mutableMapOf("Kiwi" to 60) // Mutable singleton Map of fruit

  val fruitWithSugar: MutableMap<String, Int> = mutableMapOf( // Mutable Map of fruits associated by sugar
    "Apple" to 50,
    "Banana" to 70
  )

  val otherFruitWithSugar: Map<String, Int> = mapOf( // Immutable Map of fruits associated by sugar, no limit here like on Java
    "Avocado" to 30,
    "Ananas" to 70,
    "Cranberry" to 50
  )

  val noFruitWithSugarI: Map<String, Int> = mapOf() // Immutable Empty Map of fruits associated by sugar
  val noFruitWithSugarM: Map<String, Int> = mutableMapOf() // Mutable Empty Map of fruits associated by sugar
}
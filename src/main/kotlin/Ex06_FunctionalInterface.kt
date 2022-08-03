fun main() {
  println("Europcar".hello)
  println("Europcar".hello())
  println(hello("Europcar"))
  println(hello2("Europcar"))
  println(hello3("Europcar"))
  println(hello4("Europcar"))
}

// Extension Properties
val String.hello get(): String = "Hello $this"

// Extension Functions
fun String.hello(): String = "Hello $this"

// Lambda Functions
val hello: (String) -> String = { str: String -> "Hello $str" }
val hello2: (String) -> String = { str -> "Hello $str" }
val hello3 = { str: String -> "Hello $str" }
val hello4: (String) -> String = { "Hello $it" }

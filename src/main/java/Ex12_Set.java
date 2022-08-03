import java.util.HashSet;
import java.util.Set;

import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;

public class Ex12_Set {
    public static void main(String[] args) {
        Set<String> oneFruit = singleton("Kiwi"); // Declare singleton set of fruit => Immutable

        Set<String> fruits = new HashSet<>(); // Declare mutable set of fruits
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        Set<String> otherFruits = Set.of("Avocado", "Ananas", "Cranberry"); // Immutable set of fruits

        Set<Object> noFruits = emptySet(); // Declare empty set
    }
}

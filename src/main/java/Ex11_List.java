import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

public class Ex11_List {
    public static void main(String[] args) {
        List<String> oneFruit = singletonList("Kiwi"); // Declare singleton list of fruit => Immutable

        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange"); // Declare mutable list of fruits

        List<String> otherFruits = List.of("Avocado", "Ananas", "Cranberry"); // Immutable list of fruits

        List<Object> noFruits = emptyList(); // Declare empty list
    }
}

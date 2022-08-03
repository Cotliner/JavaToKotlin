import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.singletonMap;

public class Ex13_Map {
    public static void main(String[] args) {
        Map<String, Integer> singleFruitWithSugar = singletonMap("Kiwi", 60); // Singleton Map of fruit => Immutable

        Map<String, Integer> fruitWithSugar  = new HashMap<>() {{ // Mutable Map of fruits associated by sugar
            put("Apple", 50);
            put("Banana", 70);
        }};

        Map<String, Integer> otherFruitWithSugar = Map.of( // Immutable Map of fruits associated by sugar, limited to 10 Entry
                "Avocado", 30,
                "Ananas", 70,
                "Cranberry", 50
        );

        Map<Object, Object> noFruitWithSugar = Collections.emptyMap(); // Empty Map of fruits associated by sugar
    }
}

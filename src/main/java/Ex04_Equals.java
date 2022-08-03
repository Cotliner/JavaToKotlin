import java.util.List;

import static java.util.Collections.singletonList;

public class Ex04_Equals {
    public static void main(String[] args) {
        int refInt1 = 0;
        int refInt2 = 0;
        System.out.println(refInt1 == refInt2);

        List<String> ref1 = singletonList("Hello");
        List<String> ref2 = singletonList("Hello");
        System.out.println(ref1 == ref2); // To check references
        System.out.println(ref1.equals(ref2)); // To check equality
    }
}

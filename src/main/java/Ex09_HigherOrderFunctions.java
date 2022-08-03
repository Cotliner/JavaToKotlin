import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Ex09_HigherOrderFunctions {
    public static void main(String[] args) {
        System.out.println(higherOrderFunction(7, 1, Integer::max));
        System.out.println(higherOrderFunction(1, 2, Integer::sum));
        System.out.println(square().apply(2));
    }

    static int higherOrderFunction(
            int one,
            int two,
            BinaryOperator<Integer> operation
    ) {
        return operation.apply(one, two);
    }

    static UnaryOperator<Integer> square() {
        return (value) -> value * value;
    }
}

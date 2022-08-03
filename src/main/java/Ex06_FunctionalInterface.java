import java.util.function.UnaryOperator;

public class Ex06_FunctionalInterface {

    static UnaryOperator<String> HELLO = (value) -> "Hello " + value;

    public static void main(String[] args) {
        System.out.println(HELLO.apply("Europcar"));
    }
}

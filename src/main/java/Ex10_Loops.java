
public class Ex10_Loops {
    public static void main(String[] args) {
        fruitsPrinter("Banana", "Apple", "Orange");
    }

    static void fruitsPrinter(
        String... fruits
    ) {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i + " " + fruits[i]);
        }
    }
}

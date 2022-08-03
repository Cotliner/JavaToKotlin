public class Ex03_Classes {
    public static void main(String[] args) {
        Apple apple = new Apple("red");
        Avocado avocado = new Avocado();
        System.out.printf("The %s %s have %s sugar%n", apple.color(), apple.name(), apple.sugar());
        System.out.printf("The %s have %s sugar%n", avocado.name(), avocado.sugar());
    }
    sealed interface Eatable permits Apple, Avocado {}

    record Apple(String color) implements Eatable {

        public String name() { return "Apple"; }
        public int sugar() { return 50; }
    }

    record Avocado() implements Eatable {

        public String name() { return "Avocado"; }
        public int sugar() { return 20; }
    }
}


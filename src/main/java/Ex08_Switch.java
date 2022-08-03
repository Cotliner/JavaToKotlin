public class Ex08_Switch {

    public static void main(String[] args) {
        System.out.println(adjacentColor(Color.GREEN));
        System.out.println(adjacentColor(Color.WHITE));
    }

    static String adjacentColor(Color color) {
        return switch (color) {
            case BLUE, GREEN    -> "yellow";
            case RED, PURPLE    -> "blue";
            case YELLOW, ORANGE -> "red";
            default             -> {
                System.out.println("The color could not be found.");
                yield "Unknown Color";
            }
        };
    }

    public enum Color {
        BLUE,
        GREEN,
        RED,
        PURPLE,
        YELLOW,
        ORANGE,
        WHITE
    }
}

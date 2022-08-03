public class Ex07_ConditionalExpression {
    public static void main(String[] args) {
        long randOne = Math.round(Math.random()); // Provide us 0 or 1 number
        long randTwo = Math.round(Math.random()); // Provide us 0 or 1 number
        String toPrint = randOne == 0 ? randTwo == 0 ? "I love Kotlin" : "I love Java" : null;
        System.out.println(toPrint);
    }
}

import java.util.Optional;

public class Ex05_Nullability {
    public static void main(String[] args) {
        String rawValue = nullHalfTheTime();
        String filteredValue = rawValue != null ? rawValue : "";
        if (!filteredValue.equals("")) System.out.println("First " + filteredValue);

        Optional.ofNullable(nullHalfTheTime())
                .map(String::toLowerCase)
                .ifPresent(it -> System.out.println("Second " + it));
    }

    static String nullHalfTheTime() {
        long rand = Math.round(Math.random()); // Provide us 0 or 1 number
        return rand == 0 ? "I love Java" : null;
    }
}

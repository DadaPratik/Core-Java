package streams;

import java.util.List;

public class Reduce {
    static List<String> names = List.of(
            "spinach",
            "cabbage",
            "peas",
            "grean beans",
            "brussel sprouts",
            "carrots"

    );

    public static void main(String[] args) {
        reduceDemo();
    }

    public static void reduceDemo() {
        System.out.println(names.stream()
                .sorted()
                .reduce("", (a, b) -> a + " | " + b));

    }
}

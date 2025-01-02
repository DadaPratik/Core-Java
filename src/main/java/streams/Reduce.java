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
        // reduceDemo();
        intReducedDemo();
    }

    public static void reduceDemo() {
        System.out.println(names.stream()
                .sorted()
                .reduce("", (a, b) -> a + " | " + b));

    }

    public static void intReducedDemo() {
        List<Integer> numbers = List.of(2, 4, 6, 8, 10);
        System.out.println(
                numbers.stream()
                        .reduce(0, (a, b) -> a + b)

        );


    }
}

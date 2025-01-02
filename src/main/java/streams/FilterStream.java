package streams;

import java.util.List;

public class FilterStream {
    static List<String> Names = List.of(
            "Laptop",
            "Mobile",
            "Lenevo",
            "Leopard",
            "Monkey"
    );
    public static void main(String[] args) {
        Names.stream()
                .filter(f -> f.startsWith("L"))
                .forEach(System.out::println);

    }
}

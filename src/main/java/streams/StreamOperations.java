package streams;

import java.util.List;

public class StreamOperations {

    static List<String> veggies  = List.of(
            "Spinach",
            "cabbage",
            "peas",
            "grean beans",
            "brussel sprouts",
            "carrots"


    );

    public static void main(String[] args) {
//        anyMatchDemo();
//        allMatchDemo();
        filterDemo();
    }

    public static void anyMatchDemo(){
        boolean anyMatches = veggies.stream().anyMatch( v->v.contains(" "));
        System.out.println(anyMatches);
    }

    public static void allMatchDemo(){
        boolean allMatches = veggies.stream().allMatch( v->v.contains("s"));
        System.out.println(allMatches);
    }
    public static void filterDemo(){
        veggies.stream()
                .filter(v-> v.startsWith("c"))
                .forEach(System.out::println);
    }
}

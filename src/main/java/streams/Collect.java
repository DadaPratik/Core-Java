package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Collect {
    static List<String> veggies  = List.of(
            "Spinach",
            "cabbage",
            "peas",
            "grean beans",
            "brussel sprouts",
            "carrots"


    );


    public static void main(String[] args) {
        collectDemo();
        multiOperationDemo();

    }
    public static void collectDemo(){
      List veggiesEndingWithS =   veggies.stream().
                filter(f->f.endsWith("s"))
                .collect(Collectors.toList());


      veggiesEndingWithS.forEach(System.out::println);


    }

    public static void multiOperationDemo(){
        veggies.stream()
                .sorted()
                .filter(f->f.startsWith("c"))
                .map(String :: toUpperCase)
                .map(f->f.transform(w->"Yummy " + w))
                .forEach(System.out::println);


    }
}

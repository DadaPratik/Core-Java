package data_structure;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
//        List<String> countries = new ArrayList<String>();
//        countries.add("Nepal");
//        countries.add("Rome");
//        countries.add("Germany");
//       countries.forEach(f->{
//           System.out.println(f);
//       });

        List<String> countries  = List.of("Nepal","Canada","USA","UK");
        countries.forEach(System.out::println);

        Function<Integer,Integer> square = (n) -> n*n;
        System.out.println(square.apply(5));
        Function<Integer,Integer> add = (n) -> n + n;
        System.out.println(square.andThen(add).apply(5));




    }
}

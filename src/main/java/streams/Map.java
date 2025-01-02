package streams;

import javax.lang.model.element.Name;
import java.util.List;

public class Map {

    static List<String> names = List.of(
            "Dell",
            "Samsung",
            "Lenevo",
            "Google",
            "Microsoft",
            "Apple",
            "Mac Book"
    );

    public static void main(String[] args) {
        mapDemo();

    }

    public static void mapDemo(){
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

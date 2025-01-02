package streams;

import java.util.List;

public class AnyMatch {
    static List<String> names = List.of(
            "Sandeep Shrestha",
            "Ram Bahadur Thapa",
            "Sashank Lama",
            "Ovan Tamang",
            "Mausam Shrestha"
    );


    public static void main(String[] args) {

        boolean result = names.stream().anyMatch( f-> f.contains("Shrestha"));
        System.out.println(result);

    }
}

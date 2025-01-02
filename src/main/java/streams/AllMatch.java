package streams;

import java.util.List;

public class AllMatch {
    static List<String> Address = List.of(
            "Palpa",
            "Pokhara",
            "Tanahu",
            "Tamghas",
            "Chitwan",
            "Kathmandu"
    );

    public static void main(String[] args) {

        boolean allMatch = Address.stream().allMatch(f->f.contains("T"));
        System.out.println(allMatch);

    }
}

package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpression {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        // we dont break in this return switch expression;

        String message = switch (grade) {
            case "A" , "B" -> "Excellent jon!";
//            case "B" -> "Major jon!";
            case "C" -> {
                System.out.println("final line must end with yield");

                yield "Major caw!";
            }
            case "D" -> "Major daw!";
            default -> "Invalid grade";
        };
        System.out.println(message);


    }
}

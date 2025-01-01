package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        switch(grade){
            case "A":
                message = "Excellent jon!";
                break;
            case "B":
                message = "Major jon!";
                break;
            case "C":
                message = "Major caw!";
                break;
                case "D":
                    message = "Major daw!";
                    break;
                    default:
                        message = "Invalid";
                                break;
        }
    }
}

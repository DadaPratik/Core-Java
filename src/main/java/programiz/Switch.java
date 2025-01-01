package programiz;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7");
        int number = input.nextInt();
        String message = switch(number){
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";

            case 7 -> "Saturday";
            default -> "Invalid";

        };
        System.out.println(number + " day represent " + message);
    }
}

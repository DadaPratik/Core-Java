package loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        System.out.println("------------------------");
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {

            System.out.println("Enter a number: ");
            double number = scanner.nextDouble();
            System.out.println("Enter another number: ");
            double number2 = scanner.nextDouble();
            double  result = number + number2;

            System.out.println("Sum is: " + result);
            System.out.println("Would you like to add another number? Y/N: ");
            String answer = scanner.next();
            again = answer.equalsIgnoreCase("y");

        }while(again);
    }
}

package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("Enter the number of sales made: ");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();

        if(sales >= quota){
            System.out.println("Congrats ! you made your quota");
        }

        else {
            int salesShort = quota - sales;
            System.out.println("Sorry ! you are not enough quota" + "You were " + salesShort + " sales short");
        }

        input.close();

    }
}

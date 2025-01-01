package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 1000;
        double bonous = 200;
        int quota = 10;

        System.out.println("How many sales did the employee get this week?");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();


        if(sales > quota) {
            salary += bonous;
        }
        System.out.println("Salary: "+ salary );
    }
}

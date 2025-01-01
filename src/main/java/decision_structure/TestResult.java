package decision_structure;

import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {

        System.out.print("Enter your test Score: ");
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();
        input.close();

        char grade;

        if(score < 60 ){
            grade = 'F';
        }
        else if (score < 70 ){
            grade = 'D';
        }
        else if (score < 80 ){
            grade = 'C';
        }
        else if (score < 90 ){
            grade = 'B';
        }
        else {
            grade = 'A';
        }
        System.out.println("Your grade is : "   + grade);



    }
}

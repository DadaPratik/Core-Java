package programiz;

import java.util.Scanner;

public class SumOfArrayFromUser {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int size = scanner.nextInt();

        int[] array  = new int[size];

        System.out.println("Enter array elements:");
        for(int i =0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int j = 0 ; j < size ; j++){
            sum += array[j];
        }
        System.out.println("The sum is: " + sum);
    }
}

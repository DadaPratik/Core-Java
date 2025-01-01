package programiz;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Array items is : ");
        for (int i :array){
            System.out.println(i);
        }


    }
}

package programiz;

import java.util.Scanner;


public class ConversionKmIntoMiles {
    public static void main(String[] args) {

       double result =  Conversion();
        System.out.println(result);

    }

    public static double Conversion(){
        System.out.println("Conversion Km to Miles");

        System.out.println("Enter KM");
        Scanner scanner = new Scanner(System.in);

        double kilometer = scanner.nextDouble();
        scanner.close();
        double conversionRatio = 0.621;

        double miles = conversionRatio * kilometer;
        return miles;

    }
}

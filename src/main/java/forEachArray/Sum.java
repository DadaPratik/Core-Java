package forEachArray;

public class Sum {
    public static void main(String[] args) {

        double[] numbers = {13.55, 81.19, 31.6, -44.8};
        double sum = 0;
        for(double number: numbers){
            sum += number;
        }
        System.out.println("The sum is: " + sum);
    }
}

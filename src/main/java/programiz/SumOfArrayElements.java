package programiz;

public class SumOfArrayElements {
    public static void main(String[] args) {
        double[] numbers = {13.55, 81.19, 31.6, -44.8};
        double total = 0;

        for(int i = 0; i < numbers.length; i++) {
            total += numbers[i];

        }
        System.out.println(total);
    }
}

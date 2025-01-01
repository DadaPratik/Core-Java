package programiz;

import java.util.Arrays;

public class ChangeArrayElement {
    public static void main(String[] args) {
        int[] age = {24,23,18,19,20};
        age[1] = 28;
        age[3] = 21;

        for (int i : age) {
            System.out.println(i);
        }
    }
}

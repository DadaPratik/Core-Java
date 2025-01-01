package string;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("Java");
    }
    public static void reverseString( String text) {
        for(int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}

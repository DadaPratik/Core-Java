package string;

public class ReverseText {
    public static void main(String[] args) {
        ReverseString ("palindrome");
    }
    public static void ReverseString (String input) {
        String message = String.format("the reverse of %s is  ",input);
        System.out.println(message);
        for(int i = input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
    }
}

package string;

public class WordCount {
    public static void main(String[] args) {

        CountWord("My name is Sandeep Shrestha");
    }

    public static void CountWord(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words.", numberOfWords);
        System.out.println(message);

        for(String word : words){
            System.out.println(word);
        }

    }
}

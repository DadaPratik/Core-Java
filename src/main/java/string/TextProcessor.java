package string;

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Java");
    }

    public static void countWords(String text){
        var words = text.split(" ");
        var numberOfWords = words.length;
        String message = String.format("Your text contains %d ",numberOfWords);

        System.out.println(message);
        for(String word:words){
            System.out.println(word);
        }

    }
}

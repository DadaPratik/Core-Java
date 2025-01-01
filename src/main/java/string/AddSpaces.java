package string;

public class AddSpaces {
    public static void main(String[] args) {
        addSpaces("HiItsMeSandeep");
    }
    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);

        for(int i = 0; i < text.length(); i++) {
            if(i !=0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;


            }
        }
        System.out.println(modifiedText);


    }
}

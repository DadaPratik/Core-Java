package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandlingRedo {
    public static void main(String[] args) {
        File file = new File("files/names.txt");
        try{
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                System.out.println(fileReader.nextLine());
            }


        } catch(FileNotFoundException  | InputMismatchException e){
            System.out.println(e.getMessage());
        }





    }
}

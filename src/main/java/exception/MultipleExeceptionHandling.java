package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExeceptionHandling {
    public static void main(String[] args) {
        File file = new File("files/numbers.txt");
        
         try(Scanner fileReader = new Scanner(file)){

//             Scanner fileReader = new Scanner(file);
             // read from the file
             while(fileReader.hasNextLine()){
                 System.out.println(fileReader.nextDouble());

             }
         }
         catch(Exception e){
             System.out.println(e.getMessage());
         }
    }
}

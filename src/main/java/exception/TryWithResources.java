package exception;

import java.io.File;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {

        File file = new File("files/Integer.txt");

        //Automatically close file reader with try block
        try(Scanner fileReader = new Scanner(file)){

            while(fileReader.hasNext()){
                System.out.println(fileReader.nextInt());
            }

        }catch(Exception e){
            System.out.println(e.getMessage());

        }

    }
}

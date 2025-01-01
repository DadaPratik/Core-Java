package programiz;

public class SwapTwoVatiable {
    public static void main(String[] args) {
        double currentSalary = 5000;
        double updatedSalary = 89075.87;

        System.out.println("Before swap: \n" + "currentSalary: " + currentSalary + "\n updatedSalary " + updatedSalary );

        double tem = currentSalary;
        currentSalary = updatedSalary;
        updatedSalary = tem;
        System.out.println("After swap: \n" + "currentSalary: " + currentSalary + "\n updatedSalary " + updatedSalary );


    }
}

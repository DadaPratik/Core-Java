package exception;

public class ThrowingException {
   public static double calculatePay(double hours, double payRate) throws NegativeInputException {

       if( hours > 40) {
           throw new IllegalArgumentException("Hours must be less than 40");
       }
       else if ( hours < 0 || hours < 0) {
           throw new NegativeInputException();
       }
       return hours * payRate;


   }

}

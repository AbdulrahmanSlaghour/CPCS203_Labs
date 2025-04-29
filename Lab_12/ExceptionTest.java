//import the package

//even though it isn't written in the given code from Lab 12, InputMismatchException needs to be imported since it is specified later on in the catch part of the main method.
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionTest {
    public static String lessThan100(int number) throws Exception {
        if (number >= 100) {
            throw new Exception("Number is too large.");
        }
        
        //if code has reached this point then the number is less than 100, so we can continue under that assumption.
        return "" + number; //the documentation instructs to return the number if it is larger than 100, so to turn it into a String append it to an empty String.
    }
    
    public static String lessThan50(int number) throws Exception{
        if (number >= 50 && number < 100) {
            throw new Exception("Number is between 10 and 100.");
        } else if (number >= 100) {
            lessThan100(number);
        }
        
        //if code has reached this point then the number is less than 50, so we can continue under that assumption
        return "" + number; //the documentation instructs to return the number if it is larger than 100, so to turn it into a String append it to an empty String.
    }
    
    public static void main(String[] args) {
        //documentation wants the try-catch block implemented here in the main()
        
        //Since no exceptions are expected from creating a Scanner object, it will reside outside the try-catch block.
        Scanner input = new Scanner(System.in);
        
        try {
            int userNumber = input.nextInt();
            
            //Since documentation hasn't specified how return values should be handled, then they will not be stored in variables.
            lessThan50(userNumber);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
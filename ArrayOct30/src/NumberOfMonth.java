
import java.util.Scanner;


/**
 * This program will create an array to store the name of 12 months,
 * and prompt user to enter a number between 1 to 12 to see what month that represents.
 * Check that the user has entered a valid month #, if not, they should re-enter the number
 * @author MichaelWang
 */
public class NumberOfMonth {
    
    public static void main(String[] args) {
        
        int inputNumber;    //an integer to store user's input
        int validNumber;    //an integer to strore valid input
        
        String[] monthName = {"Januray", "February", "March", "April", "May",
        "June", "July", "August", "September", "October", "November", "December"};
        
        System.out.print("Enter a month number (1-12), I will return the month name: ");
        Scanner keyboard = new Scanner(System.in);
        inputNumber = keyboard.nextInt();
        validNumber = numberValidator(inputNumber);
        
        System.out.printf("%d represents the month: %s\n", 
                validNumber, monthName[validNumber-1]);
        
    }//end of main
    
    /**
     * This method is used to validate user's input number:
     * if it is not between 1-12, the method will ask user to input another
     * number till it is valid
     * @param inputNumber
     * @return 
     */
    public static int numberValidator(int inputNumber) {
        int validNumber;
        
        while ((inputNumber < 1) || (inputNumber > 12)) {
            System.out.printf("%d is not a valid month number, it must be between"
                    + " 1-12\n", inputNumber);
            System.out.print("Enter a month number (1-12), I will return the month name: ");
            Scanner keyboard = new Scanner(System.in);
            inputNumber = keyboard.nextInt();
        }
        
        validNumber = inputNumber;
        
        return validNumber;
    }//end of method
    
}//end of class

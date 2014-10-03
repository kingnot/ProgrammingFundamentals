
import java.util.Random;


/**
 *
 * @author MichaelWang
 */
public class diceClass {
    
    private int faceValue, numberOfSides;
    
    /**
     * The constructor accepts 1 integer argument that defines the number of sides
     * @param numOfSides
     */
    public diceClass(int numOfSides) {
        if (numOfSides >=4 && numOfSides <= 20) {
            numberOfSides = numOfSides;
            Random myRandomNumber = new Random();
            faceValue = myRandomNumber.nextInt(numOfSides);
            faceValue++;
            
        }
        else
            System.out.println("The dice was not created - please enter the number"
                    + "between 4 and 20");
    }//end of constructor
    
    public int faceValue() {
        return faceValue;
    }// end of method
    
    /**
     * This method will simulate rolling the dice
     */
    public void rollDice() {
        Random myRandomNumber = new Random();
        faceValue=myRandomNumber.nextInt(numberOfSides);
        faceValue++;
    }//end of method rollDice()    
}//end of class

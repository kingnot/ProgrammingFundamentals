
/**
 *
 * @author MichaelWang
 */
public class SnakeEyesTest {
    
    public static void main(String[] args) {
        diceClass die1 = new diceClass(6);
        diceClass die2 = new diceClass(6);
       
        
        System.out.printf("Die 1 value is : %d \t Die 2 value is %d\n", die1.faceValue(), 
                die2.faceValue());
        
        int count = 1;
        
        while (!(die1.faceValue()==1 && die2.faceValue()==1)) {
            count++;
            die1.rollDice();
            die2.rollDice();
            System.out.printf("Die 1 value is : %d \t Die 2 value is %d\n", die1.faceValue(), 
                die2.faceValue());
        }
        
        System.out.printf("Yeah ha, we have snake eyes after %d rolls.\n", count);
    }//end of main    
}//end of class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

/**
 *
 * @author MichaelWang
 */
import java.util.Scanner;

public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        int sum;
        
        System.out.println("Enter first integer: ");
        number1 = input.nextInt();
        
        System.out.println("Enter second integer: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        System.out.printf("Sum is %d%n", sum);
    }
    
}

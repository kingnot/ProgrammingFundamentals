
package dectobinconvertor;

import java.util.Scanner;

/**
 * This program will prompt the user an integer and convert it to binary number
 * @author MichaelWang
 */
public class DecToBinConvertor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer value and I will return a binary: ");
        int numberToConvert = keyboard.nextInt();
        
        System.out.println("Your number in Binary is: " + getBinary(numberToConvert));
        
    } //end of main method
    
    /**
     * The method will accept and integer value and return a string of the binary
     * representation of the number
     */
    public static String getBinary(int num) {
        String binaryNum="";

        while(num != 0){
            binaryNum = (num %2) + binaryNum;
            num = num / 2;
        }
        
        return addSpaces(addLeadingZeros(binaryNum));
    } //end of getBinary method
    
    /**
     * This method will receive a string of binary number and append
     * on the front of it to ensure it is representing by 1 byte or 2
     */
    public static String addLeadingZeros(String binaryNum) {
        while (binaryNum.length() % 4 != 0) {
            binaryNum = "0" + binaryNum;
        }
        return binaryNum;
    } //end of method
    
    /**
     * This method will receive a string of binary number and append
     * a space every 4 positions to increase its readability
     */
    
    public static String addSpaces(String binaryNum) {
        String tempString = "";
        
        while (binaryNum.length() >= 4) {
            tempString = tempString + binaryNum.substring(0, 4);
            if (binaryNum.length() != 4)
                tempString = tempString + " ";
            binaryNum = binaryNum.substring(4, binaryNum.length());
        }
        
        return tempString;
    } //end of method
    
} //end of class

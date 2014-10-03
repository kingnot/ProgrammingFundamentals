
package averagegrade;

import java.util.Scanner;

/**
 *This program will prompt user to enter 5 grades and print the corresponding
 * letter grade and average grade
 * @author MichaelWang
 */
public class AverageGrade {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        float grade1, grade2, grade3, grade4, grade5;
        float averageGrade;
        
        System.out.printf("Welcome to grade center! Please enter 5 of your grades "
                + "in order to see your average grade.%n");
        System.out.printf("Please enter ONLY ONE grade at a time: %n");
        grade1 = getGrade();    //call getGrade() and assign returned value of grade to variable
        grade2 = getGrade();
        grade3 = getGrade();
        grade4 = getGrade();
        grade5 = getGrade();
        
        averageGrade = avgGrade(grade1, grade2, grade3, grade4, grade5);
        ////call avgGrade() and assign returned value of average grade to variable
        System.out.printf("%nYour overall average grade is %.1f%%, or a letter grade %s.%n",
                averageGrade, letterGrade(averageGrade));   //call letterGrade() and print the returned overall letter grade
        
    } //end of main
    
    /**
     * This method prompt user to enter grade and record keyboard input and return it
     * @return 
     */
    public static float getGrade() {
        float grade; 
        String lettergrade;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What's your grade in percentage % scale: ");
        grade = keyboard.nextFloat();
        
        //validate user's input by calling validGrade(), till the input is valid number
        while (validGrade(grade) == false) {
            grade = keyboard.nextFloat();   
        }
        lettergrade = letterGrade(grade);   //call letterGrade() and assign the returned value of letter grade to variable
        System.out.printf("Your grade is %.0f%%, or a letter grade %s.%n", grade, lettergrade);
        
        return grade;
    } //end of method getGrade()
    
    /**
     * This method takes in 5 numbers and return the average value
     * @param g1
     * @param g2
     * @param g3
     * @param g4
     * @param g5
     * @return 
     */
    public static float avgGrade(float g1, float g2, float g3, float g4, float g5) {
        
        return (g1 + g2 + g3 + g4 + g5)/5;
    } //end of method avgGrade
    /**
     * This method takes in a number and determine which field it falls in
     * and return corresponding String of letter grade
     * @param grade
     * @return 
     */
    public static String letterGrade(float grade) {
        String letter;
        
        if (grade >= 80)
            letter = "A";
        else if (grade >= 70)
            letter = "B";
        else if (grade >= 60)
            letter = "C";
        else if (grade >= 50)
            letter = "D";
        else
            letter = "F";
        
        return letter;
    } //end of method letterGrade()
    
    /**
     * This method takes in a number, and decide if it is a valid grade value
     * @param grade
     * @return 
     */
    public static boolean validGrade(float grade) {
        if ((grade >= 0) && (grade <= 100))
            return true;
        else {
            System.out.println("Invalid number! Please enter a number between 0 and 100."); //print warning message to ask user to input a valid grade
            return false;
        }
    } //end of validGrade()
} //end of class

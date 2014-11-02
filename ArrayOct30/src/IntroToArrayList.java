
import java.util.ArrayList;
import java.util.Scanner;


/**
 * This will provide similar capability as assignment1 , but use arraylists
 * @author MichaelWang
 */
public class IntroToArrayList {
    public static void main(String[] args) {
        ArrayList gradeList = new ArrayList();
        Scanner keyboard = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Enter a student's grade. To stop entering grade, enter -1");
            userInput = keyboard.nextInt();
            //check if it is a valid grade
            if (userInput != -1) {
                gradeList.add(userInput);
            }
        } while(userInput != -1);
        displayLetterGrade(gradeList);
        System.out.printf("\nThe average grade is %.1f\n", average(gradeList));
        System.out.printf("The lowest grade is %d\n", findLowestGrade(gradeList));
    }//end of main
    
    public static float average(ArrayList grade) {
        int sum = 0;
        
        for (int index = 0; index < grade.size(); index++) {
            sum += (int) grade.get(index);
        }
        return (float) sum / grade.size();
    }//end of method
    /**
     * This method will receive an integer and return letter representing 
     * the grade
     */
    public static String getLetterGrade(int grade) {
        if (grade >= 80)
            return "A";
        else if (grade >= 70)
            return "B";
        else if (grade >= 60)
            return "C";
        else if (grade >= 50)
            return "D";
        else
            return "F";
    }//end of method
    
    /**
     * This method receive an ArrayList of integers that represent grades
     * and will display all of them to the screen with the letter grade
     */
    public static void displayLetterGrade (ArrayList grades) {
        for (int index = 0; index < grades.size(); index++){
            System.out.printf("\nThe mark in course %d is %d%%, that is a letter"
                    + " grade of %s.", index+1, (int)grades.get(index), 
                    getLetterGrade((int)grades.get(index)));
        }
    }//end of method
    
    /**
     * This method will receive an ArrayList of integers and return the 
     * lowest value
     */
    public static int findLowestGrade(ArrayList grades) {
        int min = 100;
        
        for (int index = 0; index < grades.size(); index++) {
            if ((int)grades.get(index) < min){
                min = (int)grades.get(index);
            }                   
        }
        return min;
    }//end of method
}

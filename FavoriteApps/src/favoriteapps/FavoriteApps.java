/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoriteapps;

import java.util.Scanner;

/**
 * This program prompts users to indicate their favorite apps and display the
 * names of apps on the screen.
 * @author MichaelWang
 */
public class FavoriteApps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String favApp1, favApp2, favApp3, favApp4, favApp5;     //variables to store user's favorite apps
        Scanner keyboard = new Scanner(System.in);      //use Scanner object to get input
        
        System.out.printf("Hi! Please tell me five of your favorite apps, "
                + "just one at a time: \n");    //ask user to input from keyboard
        favApp1 = keyboard.nextLine();      //get the user's input from keyboard, and store it
        System.out.printf("Got it! What's your next favorite app: \n");
        favApp2 = keyboard.nextLine();      //get the user's input from keyboard, and store it
        System.out.printf("Cool! What's your 3rd favorite app: \n");
        favApp3 = keyboard.nextLine();      //get the user's input from keyboard, and store it
        System.out.printf("Perfect! What's your 4th favorite app: \n");
        favApp4 = keyboard.nextLine();      //get the user's input from keyboard, and store it
        System.out.printf("Almost done! What's your 5th favorite app: \n");
        favApp5 = keyboard.nextLine();      //get the user's input from keyboard, and store it
        
        System.out.printf("\n\nYour favorite apps are: " + favApp1 + ", "
                + favApp2 + ", "+ favApp3 + ", "+ favApp4 + ", "
                + favApp5 + ".\n");     /*display user's favorite apps on screen, 
                                          one by one and seperated by commas*/
        System.out.printf("Thank you for your answers!\n");
    }       //end of main
    
}       //end of class

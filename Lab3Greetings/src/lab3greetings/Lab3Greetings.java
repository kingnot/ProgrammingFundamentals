/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3greetings;

import java.util.Scanner;

/**
 *
 * @author MichaelWang
 */
public class Lab3Greetings {

    /**
     * This program gets user's name and return it, and greets back
     * 
     */
    public static void main(String[] args){
        String userName;
        
        userName = getUserName(); //call method getUserName to get returned name string
        sendGreeting(userName); //call method sendGreeting to print greeting on screen
    } //end of main
    
    /*This method prompt to get user's anme and return it*/
    public static String getUserName(){
        String userName;
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Hi, what's your name?\n");
        userName = keyboard.nextLine();
        
        return userName;
    } // end of method getUserName
    
    /*This method greets back to user by using his/her name*/
    public static void sendGreeting(String name) {
        System.out.println("Hello " + name + "!");
    } // end of method sendGreeting
    
} //end of class

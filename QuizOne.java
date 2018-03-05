/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 * A class utilizing while(), if/else() blocks and nested if/else statements.
 * The while() loop will control the number of guesses before the program terminates.
 * The if/else and nested if/else will display the appropriate responses to user input.
 * @author Rolanda Gontz
 */
public class QuizOne {
    public static void main(String[] args){
        
             
        // declare and intialize final variable
        final int CORRECT_ANSWER = 400;
        final int ATTEMPT_CONTROL = 3;
        
        // declare other variables
        int numAttempt = 1;
        int enteredAnswer;
        
        // create new Scanner object
        Scanner userInputScanner = new Scanner(System.in);
        
        // create while statement
        while(numAttempt <= ATTEMPT_CONTROL) {
            
            // welcome user, provide math equation and ask user for answer
            System.out.println("***** Welcome to Math Skill Checker *****");
            System.out.println("Compute the value of (20-18)*200: ");

            // read input from user and store in variable enteredAnswer
            enteredAnswer = userInputScanner.nextInt();
            
            // compare input to correct answer
            if(enteredAnswer == CORRECT_ANSWER) {
                
                // enter success statement
                System.out.println("Correct! Good job.");
                System.out.println("Thank you for participating.");
                break;
            } else {
                System.out.println("Wrong answer.");
                numAttempt++;
                
                // add high/low if/else
                if(enteredAnswer < CORRECT_ANSWER) {
                    System.out.println("Your answer is too low");
                } else {
                    System.out.println("Your answer is too high");
                } // end of nested if/else 
            } // end of if/else bloc20-18)*200 = 2*200 = 400");
        } // close while loop
        System.out.println("Solution: (20-18)*200 = 2*200 = 400");
    } // close main
} // close class

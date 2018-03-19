/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.Random;


/**
 *
 * @author Rolanda Gontz
 */
public class MysteryMiniPuzzles {
    public static void main(String[] args){
        // declare variables
        int userInput;
        
        System.out.println("WELCOME TO THE GAMES WITHIN A GAME");
        System.out.println("**********************************")  ;
        
        // create scanner object
        Scanner s = new Scanner(System.in);
        
        // promt user for input
        System.out.println("Choose number 1, 2, or 3 and hit enter: ");
  
        // user scanner to object to get input from the user
        userInput = s.nextInt();
        
        // create switch statement
        switch(userInput) {
            case 1:
                piDay();
                break;
            case 2:
                saintPaddy();
                break;
            case 3:
                idesOfMarch();
                break;
        } // close switch
    } // close main
    
    // create pieDay method. The purpose of this method is to loop.
    public static void piDay(){
        double piUser;
        final double PI_ANSWER = 3.14;
        
        System.out.println("*****************************");
        System.out.println("You have chosen MINI GAME ONE");
        System.out.println("*****************************");
        System.out.println("Get the answer right and a I tell you my favorite pie flavor ");
        System.out.println("AND print a random big number for your entertainment!");
        
        // create Scanner object
        Scanner one = new Scanner(System.in);
        
        // prompt user for input
        System.out.println("What is the value of pi the mathmatical constant "
                + "to two decimal places?");
        
        // user scanner object to get input from user
        piUser = one.nextDouble();
        
        // create if else statement for user input
        if(piUser == PI_ANSWER){
            System.out.println("Congratulations! You are correct!");
            System.out.println("My favorite flavor pie is strawberry rhubarb");
            Random r = new Random();
            BigInteger bigInt = new BigInteger(100, r);
            System.out.println("Your random big number is: " + bigInt);
        
        } else { 
            System.out.println("You are wrong. Goodbye!");
        } // close if/else
    } // close pieDay
    
    // create saintPaddy method. This method will be a practice in forLoop
    public static void saintPaddy() {
        int loopControl;
        
        System.out.println("*****************************");
        System.out.println("You have chosen MINI GAME TWO");
        System.out.println("*****************************");
        System.out.println("Get the answer to right and I will tell you my ");
        System.out.println("favorite color and loop the correct answer number of times");
        
        // create Scanner object
        Scanner two = new Scanner(System.in);
        
        // prompt the user with the question
        System.out.println("What number of leaves is considered lucky on ");
        System.out.println("a clover or shamrock plant?");
        
        // grab the input from the scanner
        loopControl = two.nextInt();
        
        // create if else statement
        if (loopControl == 4) {
            System.out.println("Congratulations! You are correct!");
            System.out.println("My favorite color is black. Enjoy your loops!");
            for(int numLoops = 0; numLoops <= loopControl; numLoops = numLoops + 1) {
                System.out.println("The value of numLoops: " + numLoops);
            } // close for loop
        } else if (loopControl < 4) {
            System.out.println("You are too low. Goodbye!");
        } else if (loopControl > 4) {
            System.out.println("You are too high. Goodbye!");
        } // close of if/else
    } // close saintPaddy
    
    // create idesOfMarch method. The purpose of this method is to print 
    // a special statement if the user inputs the correct answer.
    public static void idesOfMarch() {
        int threeInput;
        
        System.out.println("*******************************");
        System.out.println("You have chosen MINI GAME THREE");
        System.out.println("*******************************");
        System.out.print("Get the answer right, I will tell you the number ");
        System.out.println("of pets I have in my house");
        System.out.println("AND the cube of that number");
        
        // create a scanner object 
        Scanner three = new Scanner(System.in);
         
        // prompt the user for input
        System.out.println("Which two digit day is the Ides of March?");
        
        // take user input and store it
        threeInput = three.nextInt();
        
        // create the if/else block
        if(threeInput == 15) {
            System.out.println("Congratulations! You are correct!");
            System.out.println("I have 4 pets total in my house.");
            System.out.println("The cube of 4 is: 256");
        } else {
            System.out.println("You are wrong. Goodbye!");
        } // close of if/else
    } // close idesOfMarch
} // close class

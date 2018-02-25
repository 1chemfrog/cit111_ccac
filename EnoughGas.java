/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Scanner;

/**
 * a program to determine if the driver of a vehicle has enough fuel to travel 
 * to the nearest gas station.
 * @author Rolanda Gontz
 */
public class EnoughGas {
    public static void main(String[] args){
        // declare MILES_PER_GALLON as a final int as this will not change in this program
        final int MILES_PER_GALLON = 28;
        // declare int variables to store gallons of gas left and distance to next station
        int gallonsOfGasLeft;
        int distanceToNextStation;
        
        // Print out header
        System.out.println("********Will I Make It?********");
        
        // create scanner object to retrieve user input
        Scanner userInputScanner = new Scanner(System.in);
        // prompt user for ramining gallons of gas
        System.out.println("How many gallons of gas remain in your tank?");
        // grab input from console
        gallonsOfGasLeft = userInputScanner.nextInt();
        // prompt user for miles to next service station
        System.out.println("How many miles to the next service station?");
        // grab input from console
        distanceToNextStation = userInputScanner.nextInt();
        
        // implement decision logic
        if ((gallonsOfGasLeft * MILES_PER_GALLON) > distanceToNextStation) {
            System.out.println("Whew! You'll make it to the next station!");
        } else {
            System.out.println("Red Alert! You'll be marooned soon. Sucker!");
        } // close if/else {
    
    } // close of main method
} // close class EnoughGas

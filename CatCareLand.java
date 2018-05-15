/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectProject;
import java.util.Random;
/**
 * // The purpose of this class is to call on our AutoCatFeeder blueprint class.
 * @author Rolanda Gontz
 */
public class CatCareLand {
    
    public static void main(String[] args){
        // intro lines to welcome user to the program
        System.out.println("Welcome to the automatic cat feeder simulation");
        System.out.println("**********************************************");
        System.out.println();
        
        // create a new object and store it in the class member AutoCatFeeder
        AutoCatFeeder feeder1;
        // execution of this method
        feeder1 = new AutoCatFeeder();
        
        // access objects properties and store in memory bin
        feeder1.name = "Cosmo";
        feeder1.brand = "PetSafe";
        feeder1.dispenseAmountkg = 0.5;
        feeder1.setCurrentTankLevelInkg(3.0);
        
        // print out the current stats as a baseline
        feeder1.displayAutoCatFeederStats(feeder1);
        System.out.println();
        
        // call the method simulateEating on feeder1 object and pass in 
        // the generateRandomNibbleSize output
        feeder1.simulateEating(generateRandomNibbleSize());
        System.out.println();
    
        // Print out stats to make sure program is working properly. 
        // also, more user friendly
        feeder1.displayAutoCatFeederStats(feeder1);
        System.out.println();
        
        // Call method simulateEating again to ensure calculations work
        feeder1.simulateEating(generateRandomNibbleSize());
        System.out.println();
      
        // Print out stats to ensure method is working and make 
        // the program more user friendly.
        feeder1.displayAutoCatFeederStats(feeder1);
        System.out.println();
        
        // create a second object and store it in the class member
        AutoCatFeeder feeder2;
        // execute 
        feeder2 = new AutoCatFeeder();
        
        // access properties and store
        feeder2.name = "Ash";
        feeder2.brand = "WOpet";
        feeder2.dispenseAmountkg = 0.75;
        feeder2.setCurrentTankLevelInkg(3.75);
        
        // display baselline stats to improve user interface
        feeder2.displayAutoCatFeederStats(feeder2);
        System.out.println();
        
        // call method simulate Eating and pass in our new random number.
        feeder2.simulateEating(generateRandomNibbleSize());
        System.out.println();
        
        // Display Stats as progress bar for program
        feeder2.displayAutoCatFeederStats(feeder2);
        System.out.println();
        
        // call method simuateEating with new random number
        feeder2.simulateEating(generateRandomNibbleSize());
        System.out.println();
        
        // display stats 
        feeder2.displayAutoCatFeederStats(feeder2);
        System.out.println();
        
    } // close main
    
    public static double generateRandomNibbleSize(){
      Random randomGenerator = new Random();
      double nibbleSize = randomGenerator.nextDouble();
      System.out.println("A cat has eaten " + nibbleSize + " of food from the bowl.");
      return nibbleSize;
      
    } // close method
    
} // close class

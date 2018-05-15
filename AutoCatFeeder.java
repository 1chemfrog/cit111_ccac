/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectProject;

/**
 * This is a blueprint class for an automatic cat feeder.
 * @author Rolanda Gontz
 */
public class AutoCatFeeder {
    // member variables
    
    public String name;
    public String brand;
    public double dispenseAmountkg = 0.0;
    public double bowelAmount = 0.0;
    
    private double currentTankLevelInkg = 0.0;
    
    
    // "getter" method
    public double getCurrentTankLevelInkg(){
        return currentTankLevelInkg;
    } // close "getter" method
    
    //"setter" method
    public void setCurrentTankLevelInkg(double foodLevelToSet){
        if(foodLevelToSet > 0){
            this.currentTankLevelInkg = foodLevelToSet;
            dispensingFood();
        } else {
            System.out.println("You have to put some food in the Tank");
            System.out.println();
        } // close if/else
    } // close method
    
    // method that takes no input parameters and returns bowlAmount.
    public double getBowelAmount(){
        return bowelAmount;
    } // close method
    
    // method that simulates dispensing food from the tank
    private void dispensingFood(){
        if(currentTankLevelInkg > dispenseAmountkg){
            currentTankLevelInkg = currentTankLevelInkg - dispenseAmountkg;
            bowelAmount = bowelAmount + dispenseAmountkg;
            System.out.println("Food Dispensed, there is now " + currentTankLevelInkg 
                    + " kg left in the Tank.");
        } else {
            System.out.println("There is not enough food left to dispense, please refill Tank.");
        } // close if/else
    } // close method
    
    // method to simulate eating and notify the user of the updated food level in bowl
    // then runs the dispensing food method.
    public void simulateEating(double amountEaten){
    if(amountEaten < bowelAmount){
        bowelAmount = bowelAmount - amountEaten;
        System.out.println("There is now " + bowelAmount + "of food left in the bowl");
    } else {
        bowelAmount = 0.0;
        dispensingFood();
    } // close if/else
    } // close method
    
    // print out stats it makes happy users
    public void displayAutoCatFeederStats(AutoCatFeeder inputAutoCatFeeder) {
        System.out.println("|-----Displaying Automatic Cat Feeder Stats-----|");
        System.out.println("Automatic Cat Feeder Brand: " + inputAutoCatFeeder.brand);
        System.out.println("Automatic Cat Feeder Name: " + inputAutoCatFeeder.name);
        System.out.println("Amount of food dispensed by this feeder at a time: " + inputAutoCatFeeder.dispenseAmountkg);
        System.out.println("The current food level of " + inputAutoCatFeeder.name + " the feeder is: " + currentTankLevelInkg);
    } // close method

} // close class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects2_creatures;

/**
 *
 * @author Rolanda Gontz
 */
public class Creature {
    // public member variable
    public String name;
    public String species;
    
    // private member variable
    private int biteSizeInPercent = 0;
    private int sizedDonutPref = 0;
    
    // Method to simulate eating donut
    public void eatDonut(SizedDonut donutToEat) {
        System.out.println("Eating " + biteSizeInPercent + " % of " + donutToEat.name);
       // call the simulateEating method on the passed in SizedDonut object
       donutToEat.simulateEating(biteSizeInPercent);
       
    } // close eatDonut
    
    // "getter" method for bitSizeInPercent
    public int getBiteSizeInPercent(){
        return biteSizeInPercent;
    } // close "getter" method
    
    // setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int sizeToSet){
        if(sizeToSet > 0){
            this.biteSizeInPercent = sizeToSet;
        } else {
            System.out.println("Oops negative values not allowed!");
        } // close if/else
        
    } // close setter method
    
    // "getter method for sizedDonutPref
    public int getSizedDonutPref(){
        return sizedDonutPref;
    } // close "getter method"
    
    public void setSizedDonutPref (int sizedDonutPref)   {
        if(sizedDonutPref > 10) {
            this.sizedDonutPref = sizedDonutPref;
        } else {
            System.out.println("Ruh Roh Shaggy, I won't eat a donut this small.");
        } // close if/else
    } // close method
    
     public void displayCreatureStats(Creature inputCreature){
        System.out.println("----------Creature Stats-----------");
        System.out.println("Name: " + inputCreature.name);
        System.out.println("Species: " + inputCreature.species);
        System.out.println("Bite Size percent: " + inputCreature.getBiteSizeInPercent());
        System.out.println("Preffered Bite Size of " + inputCreature.name + " in percent: " 
                + inputCreature.getSizedDonutPref());
        System.out.println("-----------------------------------");
    } // close method
} // close class

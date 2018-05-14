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
public class CreatureLand {
    public static void main(String[] args){
        System.out.println("Creating a new creature: ");
        // make a pointer variable
        Creature penguin;
        penguin = new Creature();
        // write member variable
        penguin.name = "Pablo";
        penguin.species = "Emperor Penguin";
        // penguin.setSizeLimit(40); removed to simplify CreatureLand
        penguin.setBiteSizeInPercent(5);
        penguin.setSizedDonutPref(22);
        
        penguin.displayCreatureStats(penguin);
        System.out.println();
        
        System.out.println("Creating a new donut for Pablo: ");
        SizedDonut donutForPenguin = new SizedDonut();
        donutForPenguin.name = "Chloe";
        donutForPenguin.sizeInmm = 32;
        
        donutForPenguin.displaySizedDonutStats(donutForPenguin);
        System.out.println();
        
        System.out.println("Time for Pablo to eat the Chloe");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        
        penguin.eatDonut(donutForPenguin);
        
        System.out.println("Back after eating, let's do it again!");
        System.out.println();
        
        System.out.println("Creating new donut for Pablo: ");
        SizedDonut secondDonutForPenguin = new SizedDonut();
        secondDonutForPenguin.name = "Erica";
        secondDonutForPenguin.sizeInmm = 20;
        
        secondDonutForPenguin.displaySizedDonutStats(secondDonutForPenguin);
        System.out.println();
        
        System.out.println("Time for Pablo to eat the Erica");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        
        penguin.eatDonut(secondDonutForPenguin);
        
    } // close main
    
     
} // close class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author Rolanda Gontz
 */
public class FoodLand {
    
    final static int NIBBLE = 5;
    final static int MEGA_BITE = 45;
    
    public static void main(String[] args){
        Soup firstSoup;
        firstSoup = new Soup ();
        firstSoup.name = "Chowda";
        firstSoup.vegetarian = false;
        printObjectDataSoup(firstSoup);
        System.out.println();
        
        Soup secondSoup;
        secondSoup = new Soup();
        secondSoup.name = "Gazpacho";
        secondSoup.vegetarian = true;
        printObjectDataSoup(secondSoup);
        System.out.println();
        
        System.out.println("Eating " + firstSoup.name);
        System.out.println("Sip........");
        firstSoup.eatSoup(NIBBLE);
        printObjectDataSoup(firstSoup);
        System.out.println();
        
        System.out.println("Eating " + secondSoup.name);
        System.out.println("Slurp......");
        secondSoup.eatSoup(MEGA_BITE);
        printObjectDataSoup(secondSoup);
        System.out.println();
        
        Sandwich firstSandwich = new Sandwich();
        firstSandwich.name = "Turkey Club";
        firstSandwich.vegetarian = false;
        printObjectDataSandwich(firstSandwich);
        System.out.println();
        
        Sandwich secondSandwich = new Sandwich();
        secondSandwich.name = "Portabella";
        secondSandwich.vegetarian = true;
        printObjectDataSandwich(secondSandwich);
        System.out.println();
        
        System.out.println("Eating " + firstSandwich.name);
        System.out.println("Chomp......");
        firstSandwich.eatSand(MEGA_BITE);
        printObjectDataSandwich(firstSandwich);
        System.out.println();
        
        System.out.println("Eating " + secondSandwich.name);
        System.out.println("Nom......");
        secondSandwich.eatSand(NIBBLE);
        printObjectDataSandwich(secondSandwich);
        System.out.println();
        
        Donut firstDonut;
        firstDonut = new Donut();
        firstDonut.name = "Chocolate";
        printObjectDataDonut(firstDonut);
        System.out.println();
    
        Donut secondDonut;
        secondDonut = new Donut();
        secondDonut.name = "Glazed";
        printObjectDataDonut(secondDonut);
        System.out.println();
        
        System.out.println("Eating " + firstDonut.name);
        System.out.println("Gobble......");
        firstDonut.simulateEating(MEGA_BITE);
        printObjectDataDonut(firstDonut);
        System.out.println();
        
        System.out.println("Eating " + secondDonut.name);
        System.out.println("Lick.....");
        secondDonut.simulateEating(NIBBLE);
        printObjectDataDonut(secondDonut);
        System.out.println();
        
        System.out.println("Eating more " + firstDonut.name);
        System.out.println("Chomp........");
        firstDonut.simulateEating(MEGA_BITE);
        printObjectDataDonut(firstDonut);
        System.out.println();
        
        System.out.println("Just one more bite " + firstDonut.name);
        System.out.println("Nom.........");
        firstDonut.simulateEating(NIBBLE);
        printObjectDataDonut(firstDonut);
        System.out.println();
        
        System.out.println("Might as well finish " + firstDonut.name);
        System.out.println("Nom........");
        firstDonut.simulateEating(NIBBLE);
        printObjectDataDonut(firstDonut);
        
    } // close main method
    
    private static void printObjectDataSoup(Soup inputSoup){
        System.out.println("|---------------------SOUP STATS-------------------|");
        System.out.println(" Name of Soup: " + inputSoup.name);
        System.out.println(" Percent Remaining: " + inputSoup.getPercSoupRemaining());
        System.out.println(" Is this soup vegetarian: " + inputSoup.vegetarian);
        System.out.println("|---------------------------------------------------|");
    } // close printObjectDataSoup method
    
    private static void printObjectDataSandwich(Sandwich inputSandwich){
        System.out.println("|-----------------SANDWICH STATS-------------------|");
        System.out.println(" Name of Sandwich: " + inputSandwich.name);
        System.out.println(" Percent Remaining: " + inputSandwich.getPercSandRemaining());
        System.out.println(" Is this sandwich vegetarian: " + inputSandwich.vegetarian);
        System.out.println("|--------------------------------------------------|");
    } // close printObjectDataSandwich
    
    private static void printObjectDataDonut(Donut inputDonut) {
        System.out.println("|----------------------DONUT STATS-----------------|");
        System.out.println(" Name of Donut: " + inputDonut.name);
        System.out.println(" Percent Remaining: " + inputDonut.getPercRemaining());
        System.out.println("|--------------------------------------------------|");
    } // close printObjectDataDonut
    
} // close class FoodLand

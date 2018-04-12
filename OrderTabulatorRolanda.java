/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekB1_scope;

import java.util.Scanner;

/**
 * This program will keep track of the number of each type of meal and prompt
 * the user to make more meals as they run low.
 * @author Rolanda Gontz
 */

public class OrderTabulatorRolanda {
    private static int totalMealDealsOrdered = 0;
    private static int totalVeggieMealDealsOrdered = 0;
    private static int totalCombinedMealDealsOrdered = 0;
    
    final static int MAKE_MORE_MEAL_DEALS = 120;
    final static int MAKE_MORE_VEGGIE_MEAL_DEALS = 60;
    
    Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Begin Order Tabulation");
        printOrderTotals();
        
        orderMealDeal(15);
        printOrderTotals();
        
        orderMealDeal(150);
        printOrderTotals();
        
        orderVeggieMealDeal(22);
        printOrderTotals();
        
        orderVeggieMealDeal(72);
        printOrderTotals();
        
    } // close main
    
    public static void orderMealDeal(int numMealDealsOrdered) {
        
        if(numMealDealsOrdered <= MAKE_MORE_MEAL_DEALS){    
            System.out.println("****************************************************************");
            System.out.println("Taking orders for origional Meal Deals. These meals contain meat.");
            System.out.println("Meat eaters rejoyce your food is almost ready!");
            totalMealDealsOrdered = numMealDealsOrdered;
        } else {
            System.out.println("***************************************************************");
            System.out.println("Busy day today, time to make more meal deals.");
            totalMealDealsOrdered = numMealDealsOrdered;
        } // close if/else
    } // close orderMealDeal
    
    public static void orderVeggieMealDeal (int numVeggieMealDealsOrdered){
        if(numVeggieMealDealsOrdered <= MAKE_MORE_VEGGIE_MEAL_DEALS){
            System.out.println("****************************************************************");
            System.out.println("Taking orders for veggie Meal Deals. These meals are vegetarian.");
            System.out.println("Vegetarians rejoyce your food is almost ready!");
            totalVeggieMealDealsOrdered = numVeggieMealDealsOrdered;
        } else {
            System.out.println("*****************************************************************");
            System.out.println("Busy day today, time to make more Veggie Meal Deals.");
            totalVeggieMealDealsOrdered = numVeggieMealDealsOrdered;
        } // close if/else
    } // close orderVeggieMealDeal
    
    public static void printOrderTotals (){
        System.out.println("***********ORDER TOTALS**********");
        System.out.println("Total Meal Deals Ordered: " + totalMealDealsOrdered);
        System.out.println("Total Veggie Meal Deals Ordered: " + totalVeggieMealDealsOrdered);
        totalCombinedMealDealsOrdered = (totalMealDealsOrdered + totalVeggieMealDealsOrdered);
        System.out.println("Total Combines Meal Deals Ordered: " + totalCombinedMealDealsOrdered);
    } // close displayOrderTotals
} // close class

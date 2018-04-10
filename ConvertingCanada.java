/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;

import java.util.Scanner;

/**
 * This program will allow users to travel to Canada and easily convert some of 
 * the most used units of measure.
 * @author Rolanda Gontz
 */
public class ConvertingCanada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Converting Canada!");
        System.out.println("Are you traveling to Canada soon or just curious "
                + "about the cost of living there?");
        System.out.println("This handy program converts the most common units there "
                + "to the units we use here in the United States");
        System.out.println("******************************************");
        System.out.println("Enter the current Canadian dollar value equal to $1 U.S:");
        double exchangeRate = scan.nextDouble(); 
        System.out.println("Now enter the amount, in US Dollars, that you would like to exhange:");
        double money = scan.nextDouble();
        
        double returnedmoneyToSpend = currencyConversion(exchangeRate, money);
        System.out.println("With an exchange rate of: " + exchangeRate + " Canadian Dollars to $1 US, $"
                + money + " will give you: " + returnedmoneyToSpend + " Canadian Dollars to spend.");
        
        System.out.println("****************************************************************");
        
        System.out.println("Now let's convert Canadian dollars per liter to US Dollars per gallon: ");
        System.out.println("Enter the Canadian dollars per liter that you would like to convert: ");
        
        double CDPerLiter = scan.nextDouble();
        
        double returnedmilesPerGallon = gasConversion(CDPerLiter, exchangeRate);
        System.out.println("If the cost of gas is: " + CDPerLiter + " Canadian Dollars per gallon, then it costs: " 
                + returnedmilesPerGallon + " US dollars per gallon.");
        
        System.out.println("***************************************************");
        System.out.println("Finally let's convert kilometers to miles.");
        System.out.println("Please enter the number of kilometers you would like to convert to miles:");
        
        double kilometers = scan.nextDouble();
        
        double returnedmiles = mileageConversion(kilometers);
        System.out.println("If you have traveled " + kilometers + " kilometers, you have traveled "
            + returnedmiles + " miles.");
        
    } // close main
    
    public static double currencyConversion(double exchangeRate, double money) {
        
        double moneyToSpend = (exchangeRate * money);
        return moneyToSpend;
    } // close method
    
    public static double gasConversion(double CDPerLiter, double exchangeRate){
        double dollarsPerGallon = (CDPerLiter * (1 / exchangeRate) * (3.79 / 1));
        return dollarsPerGallon;
    } // close method
    
    public static double mileageConversion(double kilometers){
        double miles = (kilometers * (1 / 1.61));
        return miles;
    } // close method
} // close class

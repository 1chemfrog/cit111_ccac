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
public class SizedDonut {
    
    // member variables
    public String name;
    public int sizeInmm;
    
    private int percRemaining = 100;
    
    public void simulateEating(int sizeToSet){
        percRemaining = percRemaining - sizeToSet;
        System.out.println("Percent of donut remaining " + percRemaining);
    } // close method
    
    public int getPercRemaining(){
        return percRemaining;
    } // close method
    
    public void displaySizedDonutStats(SizedDonut inputSizedDonut){
        System.out.println("**********Sized Donut Stats**********");
        System.out.println("Donut for Creature name: " + inputSizedDonut.name);
        System.out.println("Donut size in mm: " + inputSizedDonut.sizeInmm);
        System.out.println("**************************************");
    } // close method
} // close class

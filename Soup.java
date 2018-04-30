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
public class Soup {
    // member variables
    public int percSoupRemaining = 100;
    public String name;
    public boolean vegetarian;    
    
    public void eatSoup(int percEaten){
        percSoupRemaining = percSoupRemaining - percEaten;
    } // close method
    
    public int getPercSoupRemaining(){
        return percSoupRemaining;
    } // close method
    
    public void containsMeat(){
        if (vegetarian){
            vegetarian = true;
        } else {
            vegetarian = false;
        } // close if/else
    } // close method
} // close class 

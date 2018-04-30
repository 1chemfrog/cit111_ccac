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
public class Sandwich {
    public int percSandRemaining = 100;
    public String name;
    public boolean vegetarian;
    
    public void eatSand(int percEaten){
        percSandRemaining = percSandRemaining - percEaten;
    } // close method
    
    public int getPercSandRemaining(){
        return percSandRemaining;
    } // close method
    
    public void containsMeat(){
        if (vegetarian){
            vegetarian = true;
        } else {
            vegetarian = false;
        } // close if/else
    } // close method
} // close class

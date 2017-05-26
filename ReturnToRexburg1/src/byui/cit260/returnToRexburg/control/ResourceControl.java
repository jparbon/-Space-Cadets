/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;
import java.util.Random;
import byui.cit260.returnToRexburg.model.LocationScene;

/**
 *
 * @author douglasarbon1
 */
public class ResourceControl {
 
        //method for calculating fuel earned
 	public int gatherFuel(int userInput, int locationDepth, int surfaceHardness, int drillPower, int fuelEarned) { 
           
            //check to see if the user input is valid
            if (userInput <1 || userInput >10) { 
              System.out.println("You must enter a valid number between 1 and 10.");
            } 
                else {        
                    drillPower = userInput - surfaceHardness; 
                }
            
            if(drillPower <= 0 || drillPower < locationDepth) {
                    return 0;
            }
               
                else {
                    fuelEarned = drillPower - locationDepth;
                }
         
               return fuelEarned;
                 
        }
		 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import java.util.Random;

/**
 *
 * @author douglasarbon1
 */
public class ResourceControl {

    //Random whole number generator (1-30); seed of 30
    private Random random = new Random();
    
    //this is only for testing
    protected void setRandom(Random newRandom) {
        random = newRandom;
    }

    //method for calculating fuel earned
    public int gatherFuel(int userInput, int locationDepth, int surfaceHardness, int fuelEarned) {

        //check to see if the user input is valid; must be an integer between 1 and 10.
        int drillPower;
        
        if (userInput < 1 || userInput > 10) {
            return 0;
        } else {
            drillPower = random.nextInt() + userInput - surfaceHardness; //call the nextInt() method of the random object
        }

        if (drillPower <= 0 || drillPower < locationDepth) {
            return 0;
        } else {
            fuelEarned = drillPower - locationDepth;
        }

        return fuelEarned;

    }

}

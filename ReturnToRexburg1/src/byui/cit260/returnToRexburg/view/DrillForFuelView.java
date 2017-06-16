/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import java.util.Scanner;
import byui.cit260.returnToRexburg.control.ResourceControl;
import static byui.cit260.returnToRexburg.control.ResourceControl.fuelEarned;
import byui.cit260.returnToRexburg.model.LocationScene;

/**
 *
 * @author douglasarbon1
 */
public class DrillForFuelView extends IntView {

    public DrillForFuelView() {

        super("\n Enter a number between 1 and 10.");
        //display the banner when the view is created
        this.displayBanner();

    }

    public void displayBanner() {
        //LocationScene location = new LocationScene();
        //location.setLocationName(locationName);
        
        //LocationScene depth = new LocationScene();
        //depth.setPlanetDepth(planetDepth);
        
        //LocationScene hardness = new LocationScene();
        //hardness.setSurfaceHardness(surfaceHardness);
        
        
        System.out.println(
                "\n*****************************************************"
                + "\n"
                + "\n You have safely landed on *** ."
                + "\n The Planet Depth is *** ."
                + "\n The Surface Hardness is *** ."
                + "\n"
                + "\n In order to drill for more fuel, you will need to use"
                + "\n the drills on your spaceship. The power of the drills"
                + "\n ranges from 1 to 10, with 1 being the least powerful"
                + "\n and 10 being the most powerful. "
                + "\n"
                + "\n What drill power will you use on this planet?"
                + "\n"
                + "\n******************************************************"
        );

    }

  
    public int getInput() {

        Scanner userInputScanner = new Scanner(System.in);
        int value = userInputScanner.nextInt();
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);

            //if (value < 1) {  //value is blank
            //    System.out.println("\n Invalid entry. The value cannot be blank.");
            //    continue;
            //}
            break; //end the loop

        }

        return value; //return the value entered   

    }
    
    
    @Override
    public int doAction(int userInput) {

        //create a new resource control instance called resource
        ResourceControl resource = new ResourceControl();
        //call the gatherFuel() method from the ResourceControl class
        resource.gatherFuel(userInput, 0, 0, fuelEarned);  
        return fuelEarned;
        
        }   
    

    public void displayFuelEarnedView(ResourceControl fuelEarned) {

        
        //display the message to the player
        if (ResourceControl.fuelEarned >= 1) {
            System.out.println("\n==============================================="
                    + "\n Congratulations! You have earned " + fuelEarned
                    + "\n gallons of fuel!"
            );
        } else {
            System.out.println("\n Sorry, you did not earn any fuel. Please try again!");
        }
    }  

}    


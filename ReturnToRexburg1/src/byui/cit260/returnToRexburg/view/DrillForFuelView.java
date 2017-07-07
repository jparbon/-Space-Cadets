/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import java.util.Scanner;
import byui.cit260.returnToRexburg.control.ResourceControl;
import byui.cit260.returnToRexburg.exceptions.ResourceControlException;
import byui.cit260.returnToRexburg.model.LocationScene;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author douglasarbon1
 */
public class DrillForFuelView extends IntView {

    public DrillForFuelView() {

        super("\nEnter a number between 1 and 10.");
        //display the banner when the view is created
        displayBanner("Mars", 10, 10);
    }

    public void displayBanner(String locationName, int planetDepth, int surfaceHardness) {
            
        LocationScene location = new LocationScene();
        location.setLocationName(locationName);
        
        LocationScene depth = new LocationScene();
        depth.setPlanetDepth(planetDepth);
        
        LocationScene hardness = new LocationScene();
        hardness.setSurfaceHardness(surfaceHardness);
        
        this.console.println(
               "\n*****************************************************"
                + "\n"
                + "\n You have safely landed on " + locationName + "!"
                + "\n The Planet Depth is " + planetDepth + "."
                + "\n The Surface Hardness is " + surfaceHardness + "."
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

    
  
    @Override
    public boolean doAction(int userInput) {
        
        try {
            //create a new resource control instance called resource
            ResourceControl resource = new ResourceControl();
            
            //call the gatherFuel() method from the ResourceControl class
            int fuelEarned = resource.gatherFuel(userInput, 5, 10, 0);
            //to do: we need to save the fuel into the game class.
            this.console.println("You have earned " + fuelEarned + " points");
            
        } catch (ResourceControlException ex) {
            Logger.getLogger(DrillForFuelView.class.getName()).log(Level.SEVERE, null, ex);
            
        }//finally { System.out.println("You have earned 30 fuel points");
        //}
        return true;
        }   
  
     
    /*@Override
    public void display() {
        
        //ResourceControl resource = new ResourceControl();
        //resource.gatherFuel(int userInput, int planetDepth, int surfaceHardness, int fuelEarned);
       

        //display the message to the player
        if (ResourceControl.fuelEarned >= 1) {
            System.out.println("\n==============================================="
                    + "\n Congratulations! You have earned " + ResourceControl.fuelEarned
                    + "\n gallons of fuel!"
            );
        } else {
            System.out.println("\n Sorry, you did not earn any fuel. Please try again!");
        }
    }  */


    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    }
    
}    


/*

 //displays the drill for fuel view
    public void displayDrillForFuelView() {

        //System.out.println("This calls the displayDrillForFuelView");
        boolean done = false; //set flag to not done
        do {

            //prompt for and get user input as an integer between 1 and 10
            int userInput = getInput();
            if (userInput >= 11 || userInput < 1) { //user enters invalid number

                System.out.println("\n Not a valid input. Try again!");
                continue; //continues prompting for correct input
            }

            //do requested action and display next view
            //done = this.doAction(userInput);
        } while (!done);
    }




public int getInput() {

        Scanner userInputScanner = new Scanner(System.in);
        int value = userInputScanner.nextInt();
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);

            //if (value < 1) {  //value is blank
            //    System.out.println("\n Invalid entry. The value cannot be blank.");
            //    continue;
            //}
            break; //end the loop

        }

        return value; //return the value entered   

    }


*/

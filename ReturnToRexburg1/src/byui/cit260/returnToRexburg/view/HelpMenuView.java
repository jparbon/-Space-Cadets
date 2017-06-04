/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

/**
 *
 * @author douglasarbon1
 */

import byui.cit260.returnToRexburg.control.GameControl;
import java.util.Scanner;
import returntorexburg1.ReturnToRexburg1;

/**
 *
 * @author douglasarbon1
 */
public class HelpMenuView {
    
    //class instance variable
    private String menu;

    //default constructor initialized with text to be displayed
    public HelpMenuView() {
        this.menu = "\n"
                  + "\n---------------------------------------------"
                  + "\n| Help Menu                                 |"
                  + "\n---------------------------------------------"
                  + "\nG - The goal of the game"
                  + "\nL - How to move"
                  + "\nF - View fuel level"
                  + "\nM - Return to main menu"
                  + "\n---------------------------------------------";
               
    }
    
   
    void displayMenu() {
        System.out.println(menu);
    }

    
    
    public void displayHelpMenuView() {
        
        System.out.println(menu);
       
        boolean done = false; //set flag to not done
        do {
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals ("Q")) //user wants to quit
                return; //exit the game
        
            //do requested action and display next view
            done = this.doAction(menuOption);
       
        } while (!done);
        
        
    }    
    

    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = true; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            //System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1 ){ //value is incorrect
                System.out.println("\nInvalid value. The value is incorrect.");
                continue;
            }
            
            break; //end the loop
        }
        return value; //return the value entered
    }
    

    public boolean doAction(String choice) {

    choice = choice.toUpperCase(); //convert choice to uppercase

    switch (choice) {
        case "G": //goal of the game
            this.viewGoalOfGame();
            break;
        case "L": //how to move
            this.viewHowToMove();
            break;
        case "F": //display current fuel level
            this.viewFuelLevel();
            break;
        case "M": //returns player to Main Menu
            this.returnToMainMenu();
            break;
        default:
            System.out.println("\n*** Invalid selection. *** Please, try again!");
            break;
    }       

        return false;

    }

    
        private void viewGoalOfGame() {
            
            HelpMenuView goal = new HelpMenuView();
            goal.displayMenu();
          
        }

        private void viewHowToMove() {
        System.out.println("Select the letter L to move to a new location");
        }

        private void viewFuelLevel() {
        System.out.println("*** viewFuelLevel function called ***");
        }

        private void returnToMainMenu() {
        System.out.println("*** returnToMainMenu function called ***");
    }

      
        
}



/* 
G - What is the goal of the game?
The goal of the game is to return to Earth safely by navigating your way through 
space. When you land on a new planet or moon, you will be able to gather more 
fuel, and determine whether or not you are ready to fly to your next location, 
on your way back to Earth. Along the way, you will encounter alien creatures, 
who will try to thwart your efforts. In order to win the game, you will need to
return safely on Earth, back in your hometown of Rexburg, Idaho.
	
L - How to Move
You will be provided with a map of possible destinations, and will be prompted 
to select your next location. If you have enough fuel, you will be able to 
travel to the next location and will be one step closer to home! 
If you do not have enough fuel, you will need to gather more fuel.
 
F - View Fuel Level
Along your way, you should periodically check your fuel percentage to ensure 
that you have enough fuel. If your current fuel level is less than 20%, 
you will not be able to travel and will have to try to acquire more fuel to 
continue your journey. 
 
M - Main Menu
Return to the Main Menu.  
   */
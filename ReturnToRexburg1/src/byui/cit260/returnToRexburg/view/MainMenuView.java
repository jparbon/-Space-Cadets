/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import byui.cit260.returnToRexburg.model.Player;
import java.util.Scanner;

/**
 *
 * @author douglasarbon1
 */

public class MainMenuView {
    
    //class instance variable
    private String menu;

    //default constructor initialized with text to be displayed
    public MainMenuView() {
        this.menu = "\n"
                  + "\n---------------------------------------------"
                  + "\n| Main Menu                                 |"
                  + "\n---------------------------------------------"
                  + "\nN - Start new game"
                  + "\nR - Restore existing game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n---------------------------------------------";
               
    }
    
   
    public void displayMainMenuView() {
        System.out.println(menu);
       
    }    
        
    

    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            //System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1 && value.length() > 1){ //value is incorrect
                System.out.println("\nInvalid value. The value is incorrect.");
                continue;
            }
            
            break; //end the loop
        }
        return value; //return the value entered
    }
    

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to uppercase
        
        switch (choice) {
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "R": //get and start an existing game
                this.restoreExistingGame();
                break;
            case "H": //display Help Menu
                this.displayHelpMenu();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection. *** Please, try again!");
                break;
    }       

    return false;

    }
        private void startNewGame() {
            System.out.println("*** startNewGame function called ***");
        }

        private void restoreExistingGame() {
            System.out.println("*** restoreExistingGame function called ***");
        }

        private void displayHelpMenu() {
            System.out.println("*** displayHelpMenu function called ***");
        }

        private void saveGame() {
            System.out.println("*** saveGame function called ***");
        }

}

/*  




-------------------------------------------------------------------------------

Implement the STUB FUNCTIONS (p. 46)

-------------------------------------------------------------------------------

private void startNewGame() {
    //create a new game
    GameControl.createNewGame(ReturnToRexburg1.getPlayer());

    //display the game menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu.displayMenu();

}

private void restoreExistingGame() {
    System.out.println("*** restoreExistingGame function called ***");
}

private void displayHelpMenu() {
    System.out.println("*** displayHelpMenu function called ***");
}

private void saveGame() {
    System.out.println("*** saveGame function called ***");
}

-------------------------------------------------------------------------------

*/
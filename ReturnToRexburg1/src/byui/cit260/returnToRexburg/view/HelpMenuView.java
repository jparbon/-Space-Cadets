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
public class HelpMenuView {
    
}


/* 





G - What is the goal of the game?
The goal of the game is to return to Earth safely by navigating your way through 
space, fighting off dangerous alien creatures, and collecting helpful clues and 
resources to help you along the way. When you land on a new planet or moon, you 
will be able to gather more fuel,and determine whether or not you are ready to 
fly to your next stop, on your way back to Earth. Along the way, you will 
encounter alien creatures, who will try to stop you from returning home. 
	
M - How to Move
You will be provided with a map of possible destinations, and will be prompted 
to select your next location. If you have enough fuel, you will be able to 
travel to the next location and will be one step closer to home! 
If you do not have enough fuel, you will need to gather more fuel.
 
F - View Fuel Level
Along your way, you should periodically check your fuel percentage to ensure 
that you have enough fuel. If your current fuel level is less than 20%, 
you will not be able to travel and will have to try to gain more fuel to 
continue your journey. 
 
M - Main Menu
The player will be directed back to the Main Menu.


private String menu;

    public HelpMenuView() {
        this.menu = "\n"
                  + "\n---------------------------------------------"
                  + "\n| Help Menu                                 |"
                  + "\n---------------------------------------------"
                  + "\nG - The goal of the game"
                  + "\nM - How to move"
                  + "\nF - View fuel level"
                  + "\nM - Return to main menu"
                  + "\n---------------------------------------------";
               
    }
    
    
    public void displayHelpMenuView() {
        System.out.println("/n*** displayMenu() function called ***");
    }


public boolean doAction(String choice) {

    choice = choice.toUpperCase(); //convert choice to uppercase

    switch (choice) {
        case "G": //goal of the game
            this.viewGoalOfGame();
            break;
        case "M": //how to move
            this.viewHowToMove();
            break;
        case "F": //dispaly current fuel level
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

-------------------------------------------------------------------------------

STUB FUNCTIONS: 

private void viewGoalOfGame() {
    System.out.println("*** viewGoalOfGame function called ***");
}

private void viewHowToMove() {
    System.out.println("*** viewHowToMove function called ***");
}

private void viewFuelLevel() {
    System.out.println("*** viewFuelLevel function called ***");
}

private void returnToMainMenu() {
    System.out.println("*** returnToMainMenu function called ***");
}


-------------------------------------------------------------------------------

Implement the STUB FUNCTIONS: 

private void viewGoalOfGame() {
    //create a new game
    GameControl.viewGoalOfGame(????);

    //display the help menu
    HelpMenuView helpMenu = new HelpMenuView();
    helpMenu.displayMenu();

}

private void viewHowToMove() {
    System.out.println("*** viewHowToMove function called ***");
}

private void viewFuelLevel() {
    System.out.println("*** viewFuelLevel function called ***");
}

private void returnToMainMenu() {
    System.out.println("*** returnToMainMenu function called ***");
}

-------------------------------------------------------------------------------


*/
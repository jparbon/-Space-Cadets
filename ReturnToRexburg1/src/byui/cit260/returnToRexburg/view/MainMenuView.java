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
public class MainMenuView {

    private String menu;

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
        System.out.println("/n*** displayMenu() function called ***");
    }
    
}

/*  STEP 2 (p. 36)
-------------------------------------------------------------------------------

    boolean done = false; //set flag to not done
    do {
        //prompt for and get player's name
        String menuOption = this.getMenuOption();
        if (menuOption.toUpperCase().equals("Q")) //user wants to quit
            return; //exit the game

        //do the requested action and display the next view
        done = this.doAction(menuOption);

    } while (!done);


private String getMenuOption() {
    System.out.println("\n*** getMenuOption() function called ***");

private booelan doAction (String menuOption) {
    System.out.println("\n*** doAction() function called ***)");
    return true;
}

-------------------------------------------------------------------------------

public boolean doAction(String choice) {

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

-------------------------------------------------------------------------------

STUB FUNCTIONS: (p. 45)

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


-------------------------------------------------------------------------------

Implement the STUB FUNCTIONS (p. 46)

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
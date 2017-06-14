/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import java.util.Scanner;

/**
 *
 * @author douglasarbon1
 */
public class MainMenuView extends View {

   
    //default constructor initialized with text to be displayed
    public MainMenuView() {
            super("\n"
                + "\n---------------------------------------------"
                + "\n| Main Menu                                 |"
                + "\n---------------------------------------------"
                + "\nN - Start New Game"
                + "\nG - Game Menu"
                + "\nR - Restore Existing Game"
                + "\nH - Help on How to Play the Game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n---------------------------------------------");
    }

   
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "N": //create and start a new game
                this.startNewGame();
                break;
            case "G": //display game menu
                this.GameMenuView();
                break;
            case "R": //get and start an existing game
                this.restoreExistingGame();
                break;
            case "H": //display help menu
                this.displayHelpMenu();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            case "Q": //quits the game
                return true;
            default:
                System.out.println("\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;

    }

    private void startNewGame() {
        System.out.println("create and start a new game?");
    }

    private void restoreExistingGame() {
        System.out.println("So you want to keep playing the game?");
    }

    private void saveGame() {
        System.out.println("save the current game?");
    }

    private void displayHelpMenu() {

        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();

    }

    private void GameMenuView() {

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();

    }

    //private void GameMenuView() {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

//private static class alienMenuView {
//private static void displayAlienMenuView() {
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//}
//public alienMenuView() {
//}


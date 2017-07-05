/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import byui.cit260.returnToRexburg.control.GameControl;
import byui.cit260.returnToRexburg.exceptions.GameControlException;
import byui.cit260.returnToRexburg.model.Player;
import java.util.Scanner;
import returntorexburg1.ReturnToRexburg1;

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
                + "\nN - Start new game"
                + "\nR - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n---------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {

            case "N": //display game menu
                this.startNewGame();
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
                ErrorView.display("MainMenuView", 
                                  "*** Invalid selection *** Try again!");
                break;
        }

        return false;

    }

    private void startNewGame() {

        String name = ReturnToRexburg1.getPlayerName();
        try {
            Player player = GameControl.createPlayer(name);

            GameControl.createNewGame(player);

            //display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        } catch (GameControlException gce){
          System.out.println(gce.getMessage());  
        }
    }

    private void restoreExistingGame() {
        System.out.println("So you want to keep playing the game?");
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game
        this.console.println("\n\nEnter the file path for  file where the game "
                + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            //save the game to the specified file
            GameControl.saveGame(ReturnToRexburg1.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        } 
        
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


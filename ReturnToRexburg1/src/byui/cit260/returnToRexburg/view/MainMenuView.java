/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import byui.cit260.returnToRexburg.control.GameControl;
import byui.cit260.returnToRexburg.view.GameMenuView;
import java.util.Scanner;
import returntorexburg1.ReturnToRexburg1;


/**
 *
 * @author douglasarbon1
 */


public class MainMenuView {
    
    //class instance variable
    String menu;

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
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            //System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1){ //value is blank
                System.out.println("\nInvalid value. The value cannot be blank.");
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
            //create a new game
            GameControl.createNewGame(ReturnToRexburg1.getPlayer());
            
            //display the game menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.displayMenu();    
            
        }

        private void restoreExistingGame() {
            System.out.println("So you want to keep playing the game?");
        }

        private void displayHelpMenu() {
           
          
            HelpMenuView helpMenu = new HelpMenuView();
            helpMenu.displayMenu();
            
        }

        private void saveGame() {
            
            GameMenuView saveGame = new GameMenuView();
            saveGame.displayMenu();
        }

    

  
    
    }

    



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
public class GameMenuView {
    
    void displayMenu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
    
    //class instance variable
    String menu;

    //default constructor initialized with text to be displayed
    public GameMenuView() {
        this.menu = "\n"
                  + "\n---------------------------------------------"
                  + "\n| Game Menu                                 |"
                  + "\n---------------------------------------------"
                  + "\nA - Alien Menu"
                  + "\nM - Return to Main Menu"
                  + "\n---------------------------------------------";
            
    }
    
     
    public void displayGameMenuView() {
        
        
        
        boolean done = false; //set flag to not done
        do {
            
            System.out.println(menu);
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
            case "A": //display alien menu
                this.AlienMenuView();
                break;
            case "M": //returns player to Main Menu
                return true;
            default:
                System.out.println("\n*** Invalid selection. *** Please, try again!");
                break;
    }       

    return false;

    }


        private void AlienMenuView() {
           
          
            AlienMenuView alienMenuView = new AlienMenuView();
            alienMenuView.displayAlienMenuView();
        
    }
        
                private void returnToMainMenu() {
            MainMenuView mainMenu = new MainMenuView();
            mainMenu.displayMainMenuView();
        
    }

    private static class alienMenuView {

        private static void displayAlienMenuView() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public alienMenuView() {
        }
    }
  
}
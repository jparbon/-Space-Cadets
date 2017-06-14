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
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false; //set flag to not done
        do {

            //prompt for and get player's name
            String choice = this.getInput();
            if (choice.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do requested action and display next view
            done = this.doAction(choice);

        } while (!done);

    }
    
    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        boolean valid = false; //initialize to not valid
        String choice = null; //value to be returned
        

        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);

            choice = keyboard.nextLine(); //get next line typed on keyboard
            choice = choice.trim(); //trim off leading and trailing blanks

            if (choice.length() < 1) { //value is blank
                System.out.println("\nYou must enter a value *** ");
                continue;
            }

            break; //end the loop
        }
        return choice; //return the name
    }
    
    @Override
    public boolean doAction(String choice) {
        System.out.println("\n We called this function.");
        return true;
    }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import returntorexburg1.ReturnToRexburg1;

/**
 *
 * @author douglasarbon1
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = ReturnToRexburg1.getInFile();
    protected final PrintWriter console = ReturnToRexburg1.getOutFile();

    public View() {

    }

    public View(String message) {
        displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false; //set flag to not done
        do {

            //prompt for and get player's name
            String choice = getInput();
            if (choice.toUpperCase().equals("Q")) //user wants to quit
            {
                return; //exit the game
            }
            //do requested action and display next view
            done = doAction(choice);

        } while (!done);

    }

    @Override
    public String getInput() {

        //Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        boolean valid = false; //initialize to not valid
        String choice = null; //value to be returned

        try {

            while (!valid) { //loop while an invalid value is entered
                this.console.println("\n" + this.displayMessage);

                choice = this.keyboard.readLine(); //get next line typed on keyboard

                choice = choice.trim(); //trim off leading and trailing blanks

                if (choice.length() < 1) { //value is blank
                    ErrorView.display(this.getClass().getName(),
                                      "You must enter a value.");
                    continue;
                }
                break; //end the loop
            }

        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                                      "Error reading input: " + e.getMessage());
        }

        return choice; //return the name
    }

    @Override
    public boolean doAction(String choice) {
        this.console.println("\n Define own doAction.");
        return true;
    }

}

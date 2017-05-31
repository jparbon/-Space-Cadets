/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import java.util.Scanner;

/**
 *
 * @author nataliadams
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        
        this.promptMessage = "\nPlease enter your name: ";
        //display the banner when view is created
        this.displayBanner();
        
    }

    public void displayBanner() {
        System.out.println(
        //fix this later
        "\n*description*"
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false; //set flag to not done
        do{
            //prompt for and get playersName
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals ("Q")) //user wants to quit
                return; //exit the game
        
            //do requested action and display next view
            done = this.doAction(playersName);
            
        }while (!done);
        
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1){ //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break; //end the loop
        }
        return value; //return the value entered
    }

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called***");
        return true;
    }
    
}

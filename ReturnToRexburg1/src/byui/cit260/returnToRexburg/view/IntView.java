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
public abstract class IntView implements IntViewInterface {
    
    protected String displayMessage;
    
    public IntView() {
        
    }
    
    public IntView(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false; //set flag to not done
        do {

            //prompt for and get user input
            int userInput = this.getInput();
            
        } while (!done);

    }
    
    @Override
    public int getInput() {

        Scanner userInputScanner = new Scanner(System.in);
        int value = userInputScanner.nextInt();
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);

            //if (value < 1) {  //value is blank
            //    System.out.println("\n Invalid entry. The value cannot be blank.");
            //    continue;
            //}
            break; //end the loop

        }

        return value; //return the value entered   

    }
    
    @Override
    public int doAction(int userInput) {
        return userInput;
    }
   
}


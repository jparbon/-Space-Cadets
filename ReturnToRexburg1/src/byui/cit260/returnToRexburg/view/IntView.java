/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import java.util.InputMismatchException;
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
        displayMessage = message;
    }

    @Override
    //displays the drill for fuel view
    public void display() {

        //System.out.println("This calls the displayDrillForFuelView");
        boolean done = false; //set flag to not done
        do {
           
            int userInput = 0;
            //prompt for and get user input as an integer between 1 and 10
            try {
                userInput = getInput();
                if (userInput >= 11 || userInput < 1) { //user enters invalid number

                    System.out.println("\n Invalid entry. Please enter a number between 1 and 10.");
                    continue; //continues prompting for correct input
                }
            } catch (InputMismatchException nf) {
                continue;
            }
            
            //do requested action and display next view
            done = this.doAction(userInput);
        } while (!done);
    }

    @Override
    public int getInput() {

        Scanner userInputScanner = new Scanner(System.in);
        int value = 0;
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + displayMessage);
            value = userInputScanner.nextInt();
            if (value < 1) {  //value is blank
                System.out.println("\n Invalid entry. Please enter a number between 1 and 10.");
                continue;
            }
            break; //end the loop

        }

        return value; //return the value entered   

    }

    //@Override
    //public int doAction(int userInput) {
    //    return userInput;
    //}
}

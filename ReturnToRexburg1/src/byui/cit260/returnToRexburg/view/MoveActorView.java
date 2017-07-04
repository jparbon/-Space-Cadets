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

/*
public void display() {

        
        boolean done = false; //set flag to not done
        do {
           
            int userInput = 0;
            //prompt for and get user input as an integer between 2 and 26
            try {
                userInput = getInput();
                if (userInput >= 26 || userInput < 2) { //user enters invalid number

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
                System.out.println("\n Invalid entry. Please select a location "
                    + "between 2 and 25.");
                continue;
            }
            break; //end the loop

        }

        return value; //return the value entered   

    }

import java.util.InputMismatchException;
import java.util.Scanner;




public class MoveActorView {
 doAction(){
      try {
          moveActor(actor, currentLocation);
     }
      
      catch(ArrayIndexOutOfBoundsException e)
  }  
}
*/
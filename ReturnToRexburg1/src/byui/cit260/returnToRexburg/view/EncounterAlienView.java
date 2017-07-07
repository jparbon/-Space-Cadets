/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

//import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Robbie
 */
public class EncounterAlienView extends View {


    //default constructor initialized with text to be displayed
    public EncounterAlienView() {
        super ( "\n"
                + "\n---------------------------------------------"
                + "\n| Alien Trivia                              |"
                + "\n| Is the sky blue?                          |"
                + "\n---------------------------------------------"
                + "\nT - True"
                + "\nF - False"
                + "\nM - Return to Alien Menu"
                + "\n---------------------------------------------");

    }

    //void displayMenu() {
        //System.out.println(super);
    //}

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "T": //True
                this.checkAnswer(true);
                break;
            case "F": //False
                this.checkAnswer(false);
                break;
            case "M": //returns player to Alien Menu
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;
}

    private void checkAnswer(boolean answer) {
        if (answer) {
            this.console.println(
                    "\n**************************************************************"
                    + "\n Correct! You won a trophy and 25% of fuel."
                    + "\n**************************************************************"
            );
        } //true case
        else {
            this.console.println(
                    "\n**************************************************************"
                    + "\n Incorrect! You failed to get the question right."
                    + "\n**************************************************************"
            );
        }   //false case

    }

    private void returnToMainMenuView() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

}

//public class EncounterAlienView {
//Random question generator (1-10)
//private Random random = new Random();
//protected void setRandom(Random newRandom) {
//    random = newRandom;
/**
 *
 * @param alienEncounter
 * @param fuelEarned
 * @param trophiesEarned
 * @param questionsEarned
 * @param userInput
 * @return
 */
//public int questions(int alienEncounter, int fuelEarned, int trophiesEarned, int questionsEarned, int userInput) {
//Must be a valid number between 1 and 3.
//    int questions;
//    if (userInput < 1 || userInput > 3) {
//        return 0;
//    } else {
//        trophiesEarned = alienEncounter + questionsEarned;
//    }
//    if (alienEncounter <= 0 || alienEncounter >= trophiesEarned) {
//        return 0;
//    } else {
//        fuelEarned =  alienEncounter + trophiesEarned - userInput;
//    }
//    return fuelEarned;
//}

//}

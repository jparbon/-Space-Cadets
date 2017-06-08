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
public class EncounterAlienView {
    
    //class instance variable
    String menu;

    //default constructor initialized with text to be displayed
    public EncounterAlienView() {
        this.menu = "\n"
                  + "\n---------------------------------------------"
                  + "\n| Alien Trivia                              |"
                  + "\n| Is the sky blue?                          |"
                  + "\n---------------------------------------------"
                  + "\nT - True"
                  + "\nF - False"
                  + "\nM - Return to Alien Menu"
                  + "\n---------------------------------------------";
               
    }

        void displayMenu() {
        System.out.println(menu);
    }
    
    public void displayEncounterAlienView() {
        
        
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
            
            if (value.length() < 1 ){ //value is incorrect
                System.out.println("\nInvalid value. The value is incorrect.");
                continue;
            }
            
            break; //end the loop
        }
        return value; //return the value entered
    }
    

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
            System.out.println("\n*** Invalid selection. *** Please, try again!");
            break;
    }       

        return false;

    }

    private void checkAnswer (boolean answer) {
        if (answer) { 
         System.out.println(
              "\n**************************************************************"   
            + "\n Correct! You won a trophy and 25% of fuel."
            + "\n**************************************************************"
            );
        }   //true case
         else {
         System.out.println(
              "\n**************************************************************"   
            + "\n Incorrect! You failed to get the question right."
            + "\n**************************************************************"
            );
        }   //false case
    
        
        
    }
        
                private void returnToMainMenuView() {
            MainMenuView mainMenu = new MainMenuView();
            mainMenu.displayMainMenuView();
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
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
import java.util.Scanner;

/**
 *
 * @author douglasarbon1
 */
public class LocationView {

    //class instance variable
    String menu;

    //default constructor initialized with text to be displayed
    public LocationView() {
        this.menu = "\n"
                + "\n---------------------------------------------"
                + "\n| Location Menu                                 |"
                + "\n---------------------------------------------"
                + "\nE - Earn a new trophy"
                + "\nD - Drill for fuel"
                + "\nF - View fuel percentage"
                + "\nT - View trophy count"
                + "\nM - Return to main menu"
                + "\n---------------------------------------------";
    }

    void displayMenu() {
        System.out.println(menu);
    }

    public void displayLocationView() {

        boolean done = false; //set flag to not done
        do {

            System.out.println(menu);
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
            {
                return; //exit the game
            }
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

            if (value.length() < 1) { //value is incorrect
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
            case "E": //displays question to earn a new trophy scene
                this.viewTrophyQuestion();
                break;
            case "D": //display gather fuel scene
                this.viewDrillForFuel();
                break;
            case "F": //display current fuel level scene
                this.viewFuelLevel();
                break;
            case "T": //display current trophy count scene
                this.viewTrophyCount();
                break;
            case "M": //returns player to Main Menu
                return true;
            default:
                System.out.println("\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;

    }

    //Stub functions and returnToMainMenu() called
    private void viewTrophyQuestion() {
        System.out.println("\n This calls earn trophy view.");
    }

    private void viewDrillForFuel() {
        DrillForFuelView drillForFuel = new DrillForFuelView();
        drillForFuel.displayDrillForFuelView();
    }

    private void viewFuelLevel() {
        System.out.println("\n This calls the fuel level view.");
    }

    private void viewTrophyCount() {
        System.out.println("\n This calls the trophy room view.");
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMainMenuView();
    }

}

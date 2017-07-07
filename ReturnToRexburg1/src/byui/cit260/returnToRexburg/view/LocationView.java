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
public class LocationView extends View {

    //default constructor initialized with text to be displayed
    public LocationView() {
        super("\n"
                + "\n---------------------------------------------"
                + "\n| Location Menu                                 |"
                + "\n---------------------------------------------"
                + "\nE - Earn a new trophy"
                + "\nD - Drill for fuel"
                + "\nF - View fuel level"
                + "\nT - View trophy count"
                + "\nM - Return to main menu"
                + "\n---------------------------------------------");
    }

    //void displayMenu() {
    //    System.out.println(menu);
    //}
    @Override
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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;

    }

    //Stub functions and returnToMainMenu() called
    private void viewTrophyQuestion() {
        this.console.println("\n This calls earn trophy view.");
    }

    private void viewDrillForFuel() {
        DrillForFuelView drillForFuel = new DrillForFuelView(); 
        drillForFuel.display();
    }

    private void viewFuelLevel() {
        this.console.println("\n This calls the fuel level view.");
    }

    private void viewTrophyCount() {
        this.console.println("\n This calls the trophy room view.");
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

}

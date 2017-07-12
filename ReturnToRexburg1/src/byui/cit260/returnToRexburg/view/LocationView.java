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

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "E": //displays question to earn a new trophy
                this.viewTrophyQuestion();
                break;
            case "D": //displays gather fuel scene
                this.viewDrillForFuel();
                break;
            case "F": //displays current fuel level scene
                this.viewFuelLevel();
                break;
            case "T": //displays current trophy count scene
                this.viewTrophyCount();
                break;
            case "M": //returns player to Main Menu; lines 84 - 86)
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;

    }

    //Stub functions and returnToMainMenu() called
    private void viewTrophyQuestion() {
        this.console.println("\n This calls the earn trophy view.");
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

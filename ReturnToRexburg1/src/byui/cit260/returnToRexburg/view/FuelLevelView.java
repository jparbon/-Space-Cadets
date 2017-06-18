/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

/**
 *
 * @author nataliadams
 */

public class FuelLevelView extends View{
    
    
    //private object alienView;
    
    //default constructor initialized with text to be displayed
    public FuelLevelView() {
        super ( "\n"
                + "\n---------------------------------------------"
                + "\n| Fuel Level Menu                          |"
                + "\n---------------------------------------------"
                + "\nV - View Fuel Level"
                + "\nM - Return to Game Menu"
                + "\n---------------------------------------------");

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "V": //View Fuel Level
                this.viewFuelLevel();
                break;
            case "M": //Returns Player to Game Menu
                return true;
            default:
                System.out.println("\nInvalid selection. Please, try again!");
                break;
        }

        return false;

    }

    private void viewFuelLevel() {
        System.out.println(
                "\n**************************************************************"
                + "\n Your fuel level is at 100%"
                + "\n**************************************************************"
        );
    }
    
     
    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    }
   
}
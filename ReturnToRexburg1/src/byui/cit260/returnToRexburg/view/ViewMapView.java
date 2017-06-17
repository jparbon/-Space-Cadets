/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

/**
 *
 * @author shear
 */

public class ViewMapView extends View {
    
    //default constructor initialized with text to be displayed
    public ViewMapView() {
        super ( "\n"
                + "\n---------------------------------------------"
                + "\n| View Map Menu                      |"
                + "\n---------------------------------------------"
                + "\nX - View Locations"
                + "\nM - Return to Game Menu"
                + "\n---------------------------------------------");

    }
    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "X": //View Acquried Trophies
                this.viewCurrentLocations();
                break;
            case "M": //Returns Player to Game Menu
                return true;
            default:
                System.out.println("\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;

    }
    
    private void viewCurrentLocations() {
        System.out.println(
                "\n**************************************************************"
                + "\n Before Last Location"
                + "\n Last Location"
                + "\n CURRENT LOCATION"
                + "\n Next Location"
                + "\n**************************************************************"
        );
    }
    
        private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
     }
    
}

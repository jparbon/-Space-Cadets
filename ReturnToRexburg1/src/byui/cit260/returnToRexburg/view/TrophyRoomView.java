/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

/**
 *
 * @author Robbie
 */
    
public class TrophyRoomView extends View {

   
    //private Object alienView;

    //default constructor initialized with text to be displayed
    public TrophyRoomView() {
        super ( "\n"
                + "\n---------------------------------------------"
                + "\n| Trophy Room Menu                          |"
                + "\n---------------------------------------------"
                + "\nV - View Acquired Trophies"
                + "\nM - Return to Game Menu"
                + "\n---------------------------------------------");

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "V": //View Acquried Trophies
                this.viewAcquiredTrophies();
                break;
            case "M": //Returns Player to Game Menu
                return true;
            default:
                System.out.println("\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;

    }

    private void viewAcquiredTrophies() {
        System.out.println(
                "\n**************************************************************"
                + "\n You have collected 0 trophies"
                + "\n**************************************************************"
        );
    }
    
     
         private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    }
}
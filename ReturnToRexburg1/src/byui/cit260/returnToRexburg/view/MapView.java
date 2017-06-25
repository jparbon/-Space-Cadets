/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import byui.cit260.returnToRexburg.model.Game;
import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.Map;
import returntorexburg1.ReturnToRexburg1;
import byui.cit260.returnToRexburg.control.MapControl;
/**
 *
 * @author shear
 */
public class MapView extends View {

    //default constructor initialized with text to be displayed
    public MapView() {
        super("\n"
                + "\n---------------------------------------------"
                + "\nG - Return to Game Menu"
                + "\n---------------------------------------------"
                + "\nP - View your possible locations."
                + "\n---------------------------------------------"
                + "\n"
                + "\n|   Here are the locations in the game.     |"
                + "\n"
                + "\n---------------------------------------------"
        );

    }

    private static class Locations {
        
        private String possibleLocations;
        private int numberValue;
        private String stringValue;

        public Locations(int number, String string) {
            setNumberValue(number);
            setStringValue(string);
        }

        public void setNumberValue(int value) {
            numberValue = value;
        }

        public int getNumberValue() {
            return numberValue;
        }

        public void setStringValue(String value) {
            stringValue = value;
        }

        public String getStringValue() {
            return stringValue;
        }
        
        public void setPossibleLocations(String value) {
            possibleLocations = value;
        }

        public String getPossibleLocations() {
            return possibleLocations;
        }
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "G": //Returns Player to Game Menu
                return true;
            case "P": //Displays the possible locations that the player can travel to in the game
                this.displayPossibleLocations();
                break;
            default:
                System.out.println("\n*** Invalid selection. *** Please, try again!");
                break;
        }
        return false;
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    public void displayMap() {
        Game game = ReturnToRexburg1.getCurrentGame();
        Map map = game.getMap();
        LocationScene[] locations = map.getLocations();

        for (int i = 0; i < locations.length; i++) {
            System.out.println("Locations " + locations[i].getName() + ": "
                    + locations[i].getScene().getDescription());
        }
    }

    public void displayPossibleLocations() {
        Game game = ReturnToRexburg1.getCurrentLocation();
        //Map map = game.getMap();
        //LocationScene[] locations = map.getLocations();
        //call the createPossibleLocationsList()
        
        int[] mapControl = MapControl.createPossibleLocationsList();
        
        
        System.out.println("Possible Locations: " + MapControl.createPossibleLocationsList() +
                    "\nThis is where I need to figure out how to call the createPossibleLocationsList!");
    }
}


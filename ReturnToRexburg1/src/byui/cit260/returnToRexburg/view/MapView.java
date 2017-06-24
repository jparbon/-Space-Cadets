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
                + "\n"
                + "\n|   Here are the locations in the game.     |"
                + "\n---------------------------------------------"
        );

    }

    private void displayMap() {
        Game game = ReturnToRexburg1.getCurrentGame();
        Map map = game.getMap();
        LocationScene[] locations = map.getLocations();

        for (int i = 0; i < locations.length; i++) {
            System.out.println("Locations " + locations[i].getName() + ": "
                    + locations[i].getScene().getDescription());
        }

    }

    private class Locations {

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
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "G": //Returns Player to Game Menu
                return true;

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

}

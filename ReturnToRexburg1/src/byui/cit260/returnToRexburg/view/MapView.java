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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                + "\n"
                + "\nP - View your possible locations."
                + "\n"
                + "\nI - Print the report of locations."
                + "\n"
                + "\nL - Lift off and travel to the next location."
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
            case "I": {
                try {
                    //Prints a list of locations with information for each location
                    this.printLocationsReport();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MapView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "L": //Lift-Off and travel to the next location!
                this.moveActorToNewLocation();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. *** Please, try again!");
                break;
        }
        return false;
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    @Override
    public void display() {
        Game game = ReturnToRexburg1.getCurrentGame();
        Map map = game.getMap();
        LocationScene[] locations = map.getLocations();

        for (int i = 0; i < locations.length; i++) {
            this.console.println("Location" + locations[i].getLocationName());
        }

        super.display();

    }

    public void displayPossibleLocations() {
        // Get the map from the current game.
        Map map = ReturnToRexburg1.getCurrentGame().getMap();

        // Use the map's current location, and locations to 
        // call the possible locations' functions.
        LocationScene[] possibleLocations = MapControl.createPossibleLocationsList(
                map.getCurrentLocation(), map.getLocations());

        for (LocationScene location : possibleLocations) {
            this.console.println(location.getLocationName());
        }
    }

    private void printLocationsReport() throws FileNotFoundException {
        //prompt the user for a file path of where the report is to be printed
        this.console.println("\n\nEnter the file path for where the report"
                + " should be printed.");

        //get file path entered by the user
        String filePath = this.getInput();

        //call another View Layer method that prints the report using a character 
        //stream (PrintWriter), and use a for statement to go through list
        PrintWriter locationWriter = new PrintWriter("locations.txt");
        try (PrintWriter out = new PrintWriter(filePath)) {

            Game game = ReturnToRexburg1.getCurrentGame();
            Map map = game.getMap();
            LocationScene[] locations = map.getLocations();

            out.println(); //blank line
            out.println("Location Information");
            out.println(); //blank line
            out.println(); //blank line
            out.println(String.format("%-20s %-14s %-14s", "Location Name", "Planet Depth", "Surface Hardness"));
            out.println(String.format("%-20s %-14s %-14s", "-------------", "------------", "----------------"));

            for (LocationScene location : locations) {   //lines 161, 162, 163 are the getters that lead up to the LocationScene
                out.println(String.format("%-20s %-14d %-14d", //s for Strings, d for integers
                        location.getLocationName(),
                        location.getPlanetDepth(),
                        location.getSurfaceHardness()));

                out.flush();

            }
            //display a SUCCESS message to the console if the report was printed
            out.println(); //blank line  
            out.println("SUCCESS! The report was printed successfully!");

        } catch (IOException ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

        //locationOut.writeObject(location); close the output stream
        locationWriter.close();
    }

    private void moveActorToNewLocation() {

        //Move the actor to the next location on the map
        //LocationScene newLocation = new LocationScene();
        //newLocation.
    }
}

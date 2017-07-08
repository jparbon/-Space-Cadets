/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import byui.cit260.returnToRexburg.control.GameControl;
import byui.cit260.returnToRexburg.model.Game;
import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.Map;
import returntorexburg1.ReturnToRexburg1;
import byui.cit260.returnToRexburg.control.MapControl;
import static byui.cit260.returnToRexburg.model.LocationScene.location;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
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

        //call another View Layer function that prints the report using a character 
        //output stream (PrintWriter) to write to the file, and use a for statement to go through
        //the list of items to be displayed.
        //The report must include a title, column headings and at least TWO
        //columns of date for each item in the list.
        //Title= locations; Column headings= Location, Planet Depth, Surface Hardness
        PrintWriter locationWriter = new PrintWriter("locations.txt");
        try (PrintWriter out = new PrintWriter(filePath)) {
            
            out.println(); //blank line
            out.println("Location Information");
            out.println(); //blank line
            out.println(); //blank line
            out.println(String.format("%-20s %-4s %-8s", "Location Name", "Planet Depth", "Surface Hardness"));
            out.println(String.format("%-20s %-4s %-8s", "-------------", "------------", "----------------"));

            for (LocationScene location : location) {
                out.println(String.format("%-20s %-4d %-8d",  //s for Strings, d for integers
                        location.getLocationName(),
                        location.getPlanetDepth(),
                        location.getSurfaceHardness()));
                
                locationWriter.flush();
            }
            
        //display a SUCCESS message to the console if the report was printed
        locationWriter.println("SUCCESS! The report was printed sucessfully!");
        
        } catch (IOException ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

        //locationOut.writeObject(location);
        locationWriter.close();

        

        //Catch all runtime exceptions thrown during the execution of this story.
        //For each exception, call the ErrorView.display() method to display 
        //the message to the console and print the message to the log file-> log.txt
    }

    private void moveActorToNewLocation() {

        //Move the actor to the next location on the map
        //LocationScene newLocation = new LocationScene();
        //newLocation.
    }

}


/*
System.out.println(); //blank line
System.out.println("Locations");
System.out.println(String.format("%-20s %-4s %-8s", "locationName", "planetDepth", "surfaceHardness"));
System.out.println(String.format("%-20s %-4s %-8s", "--------------", "-----------", "------------"));

for (LocationScene location : ?????
    System.out.println(String.format("%-20s %-4s %-8s",
        location.getLocationName(), location.getPlanetDepth(), location.getSurfaceHardness()));

 */

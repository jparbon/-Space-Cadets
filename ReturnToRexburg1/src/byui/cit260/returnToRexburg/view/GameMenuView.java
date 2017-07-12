/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import java.util.Scanner;

/**
 *
 * @author douglasarbon1
 */
public class GameMenuView extends View {

    //default constructor initialized with text to be displayed
    public GameMenuView() {
        super("\n"
                + "\n---------------------------------------------"
                + "\n| Game Menu                                 |"
                + "\n---------------------------------------------"
                + "\nA - Alien Menu"
                + "\nL - Location Menu"
                + "\nT - Trophy Menu"
                + "\nF - Fuel Menu"
                + "\nX - Map Menu"
                + "\nM - Return to Main Menu"
                + "\n---------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "A": //display alien menu
                this.AlienMenuView();
                break;
            case "L": //display location menu 
                this.LocationView();
                break;
            case "T": //display trophy room menu    
                this.TrophyRoomView();
                break;
            case "F": //display fuel menu
                this.FuelLevelView();
                break;
            case "X": //display map     
                displayMap();
                break;
            case "M": //returns player to Main Menu
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;
    }

    private void AlienMenuView() {

        AlienMenuView alienMenuView = new AlienMenuView();
        alienMenuView.display();
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void LocationView() {
        LocationView location = new LocationView();
        location.display();
    }

    private void TrophyRoomView() {
        TrophyRoomView roomView = new TrophyRoomView();
        roomView.display();
    }

    private void MapView() {
        MapView mapLocation = new MapView();
        mapLocation.display();
    }

    private void FuelLevelView() {
        FuelLevelView fuelView = new FuelLevelView();
        fuelView.display();
    }

    private void displayMap() {
        MapView map = new MapView();
        map.display();
    }

}

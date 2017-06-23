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
                + "\nM - Return to Game Menu"
                + "\n---------------------------------------------"  
                + "\n" //
                + "\n|   Here are the locations in the game.     |"       
                + "\n---------------------------------------------"
        );

    }
    
    
    private class Locations {
            private int numberValue;
            private String stringValue;
            
            public Locations(int number, String string){
                setNumberValue(number);
                setStringValue(string);
            }
            
            public void setNumberValue(int value){
                numberValue = value;
            }
           
            public int getNumberValue(){
                return numberValue;
            }
            
            public void setStringValue(String value){
                stringValue = value;
            }
           
            public String getStringValue(){
                return stringValue;
            }
    }
    
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "M": //Returns Player to Game Menu
                return true;
                
            default:
                System.out.println("\n*** Invalid selection. *** Please, try again!");
                break;
    }

        return false;

    }
    
    private void displayMap() {
       LocationView locations = new LocationView();
       locations.display();
       
    }
    
    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
}

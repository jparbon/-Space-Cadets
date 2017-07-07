/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import returntorexburg1.ReturnToRexburg1;
import java.util.ArrayList;

import byui.cit260.returnToRexburg.control.TrophyControl;
import byui.cit260.returnToRexburg.model.Trophy;

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
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;

    }

    private void viewAcquiredTrophies() {
        ArrayList<Trophy> trophies = ReturnToRexburg1.getCurrentGame().getTrophies();


        this.console.println(
                "\n**************************************************************"
                + "\n You have collected " + trophies.size() + " trophies"     
                + "\n**************************************************************"
        );

        // Copy the list of trophies so the sorting doesn't mess with the original list.
        ArrayList<Trophy> sortedTrophies = new ArrayList<>();
        sortedTrophies.addAll(trophies);

        TrophyControl.sortTrophyList(sortedTrophies);

        for (Trophy trophy: sortedTrophies){
            this.console.println(trophy.name() + ": "+ trophy.getDescription());
        }
    }
         
}
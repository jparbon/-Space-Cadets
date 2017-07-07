package byui.cit260.returnToRexburg.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package byui.cit260.returnToRexburg.view;

import java.util.Scanner;

/**
 *
 * @author Robbie
 */
public class AlienMenuView extends View {

   
    private Object alienView;

    //default constructor initialized with text to be displayed
    public AlienMenuView() {
        super ( "\n"
                + "\n---------------------------------------------"
                + "\n| Alien Menu                                 |"
                + "\n---------------------------------------------"
                + "\nP - Pass by Alien"
                + "\nA - Answer Question"
                + "\nM - Return to Game Menu"
                + "\n---------------------------------------------");

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "P": //Pass by alien
                this.viewPassbyalien();
                break;
            case "A": //Answer question
                this.EncounterAlienView();
                break;
            case "M": //returns player to Game Menu
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;

    }

    private void viewPassbyalien() {
        this.console.println(
                "\n**************************************************************"
                + "\n You have passed by the alien safely"
                + "\n**************************************************************"
        );
    }

    private void EncounterAlienView() {

        EncounterAlienView encounterAlien = new EncounterAlienView();
        encounterAlien.display();

    }

}

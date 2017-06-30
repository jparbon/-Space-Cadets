/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import byui.cit260.returnToRexburg.control.GameControl;
import byui.cit260.returnToRexburg.model.Player;
import static java.awt.SystemColor.menu;
import java.util.Scanner;
import returntorexburg1.ReturnToRexburg1;

/**
 *
 * @author nataliadams
 */
public class StartProgramView extends View {

    public StartProgramView() {
        super("\nPlease enter your first name: ");

        //display the banner when view is created
        displayBanner();

    }

    public void displayBanner() {
        System.out.println(
                "\n*******************************************************************"
                + "\n*                                                                 *"
                + "\n* You awaken to find yourself on Triton, one of Neptune’s moons.  *"
                + "\n* Your spaceship has crashed and you have lost all communication  *"
                + "\n* with Earth. As you look out the window, you notice a shiny      *"
                + "\n* metal box next to the spaceship. With your spacesuit still      *"
                + "\n* intact, you open the door of the spaceship and retrieve the     *"
                + "\n* metal box. Secured safely within the box is a map, which        *"
                + "\n* provides you with the information to start you on your journey  *"
                + "\n* back to Earth. Knowing that you are a long way from home, you   *"
                + "\n* desperately want to make it back to Earth.                      *"
                + "\n*                                                                 *"
                + "\n* The goal of the game is for you to return to Earth safely. As   *"
                + "\n* you journey through space, you will encounter aliens on         *"
                + "\n* distant planets and moons, and will have to gather extra fuel   *"
                + "\n* to fly your spaceship back to Earth.                            *"
                + "\n*                                                                 *"
                + "\n* If you are successful, you will be able to return to Earth      *"
                + "\n* safely and you will win the game!                               *"
                + "\n*                                                                 *"
                + "\n*******************************************************************"
        );
    }

    private void displayNextView() {

        //display a custom welcome message
        System.out.println("\n==========================================="
                + "\n Welcome to the game, " + ReturnToRexburg1.getPlayerName() + "."
                + "\n We hope you can Return to Rexburg!"
                + "\n==========================================="
        );

        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        //Display the main menu view
        mainMenuView.display();

    }

    @Override
    public boolean doAction(String choice) {
        //Player player = new Player();
        ReturnToRexburg1.setPlayerName(choice);
        displayNextView();
        return true;
    }

}

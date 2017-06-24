/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

/**
 *
 * @author douglasarbon1
 */
import byui.cit260.returnToRexburg.control.GameControl;
import java.util.Scanner;
import returntorexburg1.ReturnToRexburg1;

/**
 *
 * @author douglasarbon1
 */
public class HelpMenuView extends View {

    //default constructor initialized with text to be displayed
    public HelpMenuView() {
        super("\n"
                + "\n---------------------------------------------"
                + "\n| Help Menu                                 |"
                + "\n---------------------------------------------"
                + "\nG - The Goal of the Game"
                + "\nL - How to Move Through Space"
                + "\nF - View Fuel Percentage"
                + "\nM - Return to Main Menu"
                + "\n---------------------------------------------");

    }

    //void displayMenu() {
    //    System.out.println(menu);
    //}
    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to uppercase

        switch (choice) {
            case "G": //goal of the game
                this.viewGoalOfGame();
                break;
            case "L": //how to move
                this.viewHowToMove();
                break;
            case "F": //display current fuel level
                this.viewFuelLevel();
                break;
            case "M": //returns player to Main Menu
                return true;
            default:
                System.out.println("\n*** Invalid selection. *** Please, try again!");
                break;
        }

        return false;

    }

    private void viewGoalOfGame() {
        System.out.println(
                "\n**************************************************************"
                + "\n The goal of the game is to return to Earth safely"
                + "\n by navigating your way through space. When you land on a new"
                + "\n planet or moon, you will be able to gather more fuel, and"
                + "\n should check to see if you have enough fuel to travel to another"
                + "\n location. You will also be given questions to answer, and when"
                + "\n you answer the question correctly, you will be awarded a"
                + "\n trophy, which will be added to your collection. You can"
                + "\n either use your trophies to exchange for fuel, or keep them"
                + "\n to show off to your friends back in Rexburg!"
                + "\n"
                + "\n In order to win the game, you will need to gather enough fuel"
                + "\n to fly back to Earth, and safely land in Rexburg, Idaho."
                + "\n*************************************************************"
        );
    }

    private void viewHowToMove() {
        System.out.println(
                "\n**************************************************************"
                + "\n You will be provided with a map of possible "
                + "\n destinations, and will be prompted to select your next"
                + "\n location. If you have enough fuel, you will be able to travel"
                + "\n to another location and will be one step closer to home!"
                + "\n"
                + "\n If you do not have enough fuel, you will need to drill for"
                + "\n more fuel to fly your spaceship."
                + "\n**************************************************************"
        );
    }

    private void viewFuelLevel() {
        System.out.println(
                "\n**************************************************************"
                + "\n While you journey through space, you should "
                + "\n periodically check your fuel percentage to ensure that you"
                + "\n have enough fuel to travel to your next destination. "
                + "\n"
                + "\n If your current fuel level is less than 20%,"
                + "\n you will not be able to travel and you will have to !"
                + "\n either drill for more fuel, or answer a question correctly"
                + "\n to have the chance to earn more fuel."
                + "\n**************************************************************"
        );
    }

    private void returnToMainMenu() {
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    }

}

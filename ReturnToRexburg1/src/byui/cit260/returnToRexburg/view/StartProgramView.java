/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import byui.cit260.returnToRexburg.control.GameControl;
import byui.cit260.returnToRexburg.model.Player;
import java.util.Scanner;

/**
 *
 * @author nataliadams
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        
        this.promptMessage = "\nPlease enter your first name: ";
        //display the banner when view is created
        this.displayBanner();
        
    }

    public void displayBanner() {
        System.out.println(
        "\n*******************************************************************"
       +"\n*                                                                 *"
       +"\n* You awaken to find yourself on Triton, one of Neptune’s moons.  *"         
       +"\n* Your spaceship has crashed and you have lost all communication  *"         
       +"\n* with Earth. As you look out the window, you notice a shiny      *"         
       +"\n* metal box next to the spaceship. With your spacesuit still      *"
       +"\n* intact, you open the door of the spaceship and retrieve the     *"         
       +"\n* metal box. Secured safely within the box is a map, which        *"         
       +"\n* provides you with the information to start you on your journey  *"         
       +"\n* back to Earth. Knowing that you are a long way from home, you   *"         
       +"\n* desperately want to make it back to Earth.                      *"         
       +"\n*                                                                 *"         
       +"\n* The goal of the game is for you to return to Earth safely. As   *"         
       +"\n* you journey through space, you will encounter aliens on         *"         
       +"\n* distant planets and moons, and will have to gather extra fuel   *"         
       +"\n* to fly your spaceship back to Earth.                            *"         
       +"\n*                                                                 *"         
       +"\n* If you are successful, you will be able to return to Earth      *"         
       +"\n* safely and you will win the game!                               *"         
       +"\n*                                                                 *"
       +"\n*******************************************************************"
        );
    }

    //displays the start program view
    public void displayStartProgramView() {
        
        boolean done = false; //set flag to not done
        do{
            //prompt for and get playersName
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals ("Q")) //user wants to quit
                return; //exit the game
        
            //do requested action and display next view
            done = this.doAction(playersName);
            
        }while (!done);
        
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1){ //value is blank
                System.out.println("\nInvalid value. The value cannot be blank.");
                continue;
            }
            
            break; //end the loop
        }
        return value; //return the value entered
    }

    private boolean doAction(String playersName) {
        
        
        if (playersName.length() < 2){
            System.out.println("\nInvalid player's name: "
            + "The name must be greater than one character in length.");
        return false;
        }
        
        //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null){
           System.out.println("\nError creating the player.");
           return false;
        }
        
        //display next view
        this.displayNextView(player);
        
        return true; //Success!
    
    }
 private void displayNextView(Player player) {
        
        //display a custom welcome message
        System.out.println("n==========================================="
                        + "/n Welcome to the game " +  player.getName()
                        + "/n We hope you have fun playing the game!"
                        + "/n==========================================="
                        );
        
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //Display the main menu view
        mainMenuView.displayMainMenuView();
    
        
    } 
  
}
   
    
    
    
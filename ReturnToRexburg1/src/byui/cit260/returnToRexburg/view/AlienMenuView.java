package byui.cit260.returnToRexburg.view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package byui.cit260.returnToRexburg.view;

import byui.cit260.returnToRexburg.model.Actor;
import byui.cit260.returnToRexburg.model.Game;
import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.Map;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import returntorexburg1.ReturnToRexburg1;

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
                + "\nR - Print Alien Report"
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
            case "R": //Print a report
                 try {
                    //Prints a list of Aliens in their current location with level of difficulty
                    this.printAlienReport();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(AlienMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
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

    private void printAlienReport () throws FileNotFoundException {
        //prompt the user for a file path of where the report is to be printed
        this.console.println("\n\nEnter the file path for where the report"
                + " should be printed.");

        //get file path entered by the user
        String filePath = this.getInput();
      
        PrintWriter actorWriter = new PrintWriter("alien.txt");
        try (PrintWriter out = new PrintWriter(filePath)) {
            
            Game game = ReturnToRexburg1.getCurrentGame();
            Map map = game.getMap();
            LocationScene[] actors = map.getActors();
            
            out.println(); //blank line
            out.println("Alien Information");
            out.println(); //blank line
            out.println(); //blank line
            out.println(String.format("Actor", "Planet Home", "Alien Species", "Level of Difficulty"));
            out.println(String.format("Actor", "-------------", "------------", "----------------"));
 
            for (LocationScene actor : actors) {   
                out.println(String.format("Actor",
                        actor.getCurrentLocation(),
                        actor.getName(),
                        actor.getDifficulty()));
                
                out.flush();
            
                
            }
          //display a SUCCESS message to the console if the report was printed
          out.println(); //blank line  
          out.println("SUCCESS! Your report has been printed.");
                
        } catch (IOException ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        
        }
        
        //locationOut.writeObject(location);
        actorWriter.close();

        

        //Catch all runtime exceptions thrown during the execution of this story.
        //For each exception, call the ErrorView.display() method to display 
        //the message to the console and print the message to the log file-> log.txt
    }

}

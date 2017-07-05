/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntorexburg1;

//import statements for each class
import byui.cit260.returnToRexburg.model.Actor;
import byui.cit260.returnToRexburg.model.Game;
import byui.cit260.returnToRexburg.model.Player;
import byui.cit260.returnToRexburg.model.Map;
import byui.cit260.returnToRexburg.model.Spaceship;
import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.RegularSceneType;
import byui.cit260.returnToRexburg.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nataliadams
 */
public class ReturnToRexburg1 {

    private static Game currentGame = null;
    private static String playerName = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
   
    //private static Player player = null;
    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        Player playerOne = new Player();    
        playerOne.setName("Jen Arbon");
  
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
     */
    public static void main(String[] args) {

        try {

            //open character stream files for end user input and input
            ReturnToRexburg1.inFile = new BufferedReader(new InputStreamReader(System.in));
            ReturnToRexburg1.outFile = new PrintWriter(System.out, true);

            try { 

                //open log file
                String filePath = "log.txt";
                ReturnToRexburg1.logFile = new PrintWriter(filePath);
            
            } catch (Exception e) {

            System.out.println("Exception:  " + e.toString() +
                               "\nCause:  " + e.getCause() +
                               "\nMessage:  " + e.getMessage());   
            }
            
            //create StartProgramView original and display the StartProgramView
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return;

        } catch (Throwable e) {

            System.out.println("Exception:  " + e.toString() +
                               "\nCause:  " + e.getCause() +
                               "\nMessage:  " + e.getMessage());

            e.printStackTrace();;

        } finally {

            try {
                if (ReturnToRexburg1.inFile != null) {
                    ReturnToRexburg1.inFile.close();
                }

                if (ReturnToRexburg1.outFile != null) {
                    ReturnToRexburg1.outFile.close();
                }
                
                if (ReturnToRexburg1.logFile != null) {
                    ReturnToRexburg1.logFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ReturnToRexburg1.currentGame = currentGame;
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(String name) {
        ReturnToRexburg1.playerName = name;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ReturnToRexburg1.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ReturnToRexburg1.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ReturnToRexburg1.logFile = logFile;
    }

    
    
}

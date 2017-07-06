/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import byui.cit260.returnToRexburg.exceptions.GameControlException;
import byui.cit260.returnToRexburg.model.Game;
import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.Map;
import byui.cit260.returnToRexburg.model.Player;
import byui.cit260.returnToRexburg.model.Spaceship;
import byui.cit260.returnToRexburg.model.Trophy;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import returntorexburg1.ReturnToRexburg1;

/**
 *
 * @author douglasarbon1
 */
public class GameControl {

    public static Player createPlayer(String name) throws GameControlException {

        if (name == null) {
        //    return null;
        throw new GameControlException ("Value cannot be blank. Please enter your name.");
        }

        Player player = new Player();
        player.setName(name);

        //ReturnToRexburg1.getCurrentGame().setPlayer(player); //save the player

        return player;
    }

    //implement createNewGame control function to save all objects needed to play the game
    public static void createNewGame(Player player) {
        //System.out.println("This calls the start new game");
        Game game = new Game(); // create new game
        ReturnToRexburg1.setCurrentGame(game); //save in ReturnToRexburg1

        game.setPlayer(player); //save player in game

        Spaceship spaceship = new Spaceship(); //create new spaceship
        game.setSpaceship(spaceship); //save ship in game

        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); //save map in game

        //move actors to starting position in the map
        //MapControl.moveActorsToStartingLocation(map);

        createMap(game);
        
        // Add a few trophies so we can show them later (this should be
        // replaced when the game gets to the point of earning trophies).
        // Add them out of order so we can see that they're sorted 
        // correctly.
        game.getTrophies().add(Trophy.Trophy3);
        game.getTrophies().add(Trophy.Trophy2);
        game.getTrophies().add(Trophy.Trophy5);
        game.getTrophies().add(Trophy.Trophy1);
        game.getTrophies().add(Trophy.Trophy4);
    }

    //public static void assignScenesToLocations(Map map, LocationScene[] scenes) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    public static void createMap(Game game) {
        Map map = MapControl.createMap();
        game.setMap(map);
    }

    //move actors to starting position in the map; the first location
    //MapControl.moveActorsToStartingLocation(map);

    public static void saveGame(Game currentGame, String filePath) 
            throws GameControlException {
       
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream (fops);
            
            output.writeObject(currentGame); //write the game object out to file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) 
                        throws GameControlException {
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); //read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        //close the output file
        ReturnToRexburg1.setCurrentGame(game); //save in ReturnToRexburg1
    }
   
 }


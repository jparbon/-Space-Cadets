/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import byui.cit260.returnToRexburg.model.Game;
import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.Map;
import byui.cit260.returnToRexburg.model.Player;
import byui.cit260.returnToRexburg.model.Spaceship;
import returntorexburg1.ReturnToRexburg1;

/**
 *
 * @author douglasarbon1
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        ReturnToRexburg1.setPlayer(player); //save the player
        
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
        MapControl.moveActorsToStartingLocation(map);
       
    }

    public static void assignScenesToLocations(Map map, LocationScene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    
}

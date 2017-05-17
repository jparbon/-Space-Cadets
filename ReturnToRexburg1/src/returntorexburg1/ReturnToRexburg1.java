/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntorexburg1;

//import statements for each class
import byui.cit260.returnToRexburg.model.Actor;
import byui.cit260.returnToRexburg.model.Game;
import byui.cit260.returnToRexburg.model.Location;
import byui.cit260.returnToRexburg.model.Map;
import byui.cit260.returnToRexburg.model.Player;
import byui.cit260.returnToRexburg.model.Spaceship;

/**
 *
 * @author nataliadams
 */
public class ReturnToRexburg1 {

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
    
    
    //Actor class
    
        Actor actorOne = new Actor();
        actorOne.setName("Jen");
        actorOne.setMinimumHealth(10);
        actorOne.setMaximumHealth(100);
        actorOne.setAttack(5);
        actorOne.setDamage(5);
        actorOne.setDefense(10);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        
        
    //Game class
    
       Game gameOne = new Game();
       gameOne.setPlayer("Roxanne");
       gameOne.setDescription("This is a game!");
        
       String gameDescriptionInfo = gameOne.toString();
       System.out.println(gameDescriptionInfo);

       
    //Location class (done)
  
       Location locationOne = new Location();
       locationOne.setName("Mars");
       locationOne.setDescription("Mars is hot!");
       locationOne.setMapLocation("You are almost there!");
       locationOne.setSurfaceHardness(10);
       locationOne.setPlanetDepth(40);
       locationOne.setAlienSpecies("Martian");
            
       
       String locationInfo = locationOne.toString();
       System.out.println(locationInfo);

    //Map class
    
       Map mapDescription = new Map();
       mapDescription.setDescription("This is the map!");
        
       String mapDescriptionInfo = mapDescription.toString();
       System.out.println(mapDescriptionInfo);
        
 
    //Spaceship class
    
       Spaceship shipOne = new Spaceship();
       
       shipOne.setName("Roxy");
       shipOne.setMaximumFuel(100);
       shipOne.setMinimumFuel(10);
       
       String shipInfo = shipOne.toString();
       System.out.println(shipOne);
        
    }

}   
    

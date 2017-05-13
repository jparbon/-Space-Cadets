/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntorexburg1;

//import statements for each class
import byui.cit260.returnToRexburg.model.Actor;
import byui.cit260.returnToRexburg.model.Game;
import byui.cit260.returnToRexburg.model.InventoryItem;
import byui.cit260.returnToRexburg.model.Location;
import byui.cit260.returnToRexburg.model.Map;
import byui.cit260.returnToRexburg.model.Player;
import byui.cit260.returnToRexburg.model.QuestionScene;
import byui.cit260.returnToRexburg.model.Spaceship;
import byui.cit260.returnToRexburg.model.Weapon;

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
        actorOne.setPlayer("Roxanne");
        actorOne.setMinimumHealth(10);
        actorOne.setMaximumHealth(100);
        actorOne.setAttack(5);
        actorOne.setDamage(5);
        actorOne.setDefense(10);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
        
        
        
    //Game class
    
       Game gameDescription = new Game();
       gameDescription.setDescription("This is a game!");
        
       String gameDescriptionInfo = gameDescription.toString();
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
       
    //Weapon class
    
        Weapon weaponOne = new Weapon();
        
        weaponOne.setName("Phaser");
        weaponOne.setDamageType("Electric");
        weaponOne.setAttackBonus(10);
        weaponOne.setDamageBonus(8);
        weaponOne.setDefenseBonus(8);
        
        String weaponInfo = weaponOne.toString();
        System.out.println(weaponOne);
        
    //InventoryItem class
    
        InventoryItem inventoryItemOne = new InventoryItem();
        
        inventoryItemOne.setInventoryType("health");
        inventoryItemOne.setQuantityInStock(28);
        inventoryItemOne.setRequiredAmount(49);
        
        String inventoryItemInfo = inventoryItemOne.toString();
        System.out.println(inventoryItemOne);
        
    //QuestionScene class
    
        QuestionScene questionSceneOne = new QuestionScene();
        
        questionSceneOne.setName("Natali");
        questionSceneOne.setType("Armor");
        questionSceneOne.setQuestion("what is 2 + 2?");
        questionSceneOne.setAnswer("4, correct!");
        
        String questionSceneInfo = questionSceneOne.toString();
        System.out.println(questionSceneOne);
    }

}   
    

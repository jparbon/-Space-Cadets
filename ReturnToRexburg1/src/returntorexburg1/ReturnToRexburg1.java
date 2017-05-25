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
import byui.cit260.returnToRexburg.model.CombatScene;
import byui.cit260.returnToRexburg.model.EncounterAlienScene;
import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.RegularSceneType;
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
        actorOne.setName("Roxanne");
        actorOne.setCurrentHealth(75);
        actorOne.setMaximumHealth(100);
        actorOne.setCurrentLocation("Titan");
        actorOne.setBaseAttackValue(5);
        actorOne.setBaseDamageValue(10);
        actorOne.setDefenseValue(20);
        
        String actorInfo = actorOne.toString();
        System.out.println(actorInfo);
       
        
    //Game class
    
       Game gameOne = new Game();
       gameOne.setPlayer("Jen");
       gameOne.setDescription("This is a game!");
        
       String gameDescriptionInfo = gameOne.toString();
       System.out.println(gameDescriptionInfo);

       
    //Player class  
       
       Player playerOne = new Player();
       playerOne.setCurrentWeaponEquipped("Laser Gun");
       playerOne.setTotalNumberOfWeapons(4);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
                  
       
    //LocationScene class 
  
       LocationScene locationOne = new LocationScene();
       locationOne.setName("Mars");
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
    
       Spaceship spaceshipOne = new Spaceship();   
       spaceshipOne.setName("Roxy");
       spaceshipOne.setCurrentFuel(10);
       spaceshipOne.setMaximumFuel(100);  
       
       String spaceshipInfo = spaceshipOne.toString();
       System.out.println(spaceshipInfo);
       

    //Weapon class
    
        Weapon weaponOne = new Weapon();
        weaponOne.setName("Phaser");
        weaponOne.setBonusToAttack(10);
        weaponOne.setBonusToDefense(8);
        weaponOne.setBonusToDamage(8);
        weaponOne.setAcquiredWeapon("Sword");
        
        String weaponInfo = weaponOne.toString();
        System.out.println(weaponInfo);
    
        
   //CombatScene Class
       
       CombatScene combatSceneOne = new CombatScene();  
       combatSceneOne.setActorAttackOutput(100);
       String combatSceneInfo = combatSceneOne.toString();
       System.out.println(combatSceneInfo);
   
       
   //EncounterAlienScene Class
       
       EncounterAlienScene encounterSceneOne = new EncounterAlienScene();
       
       String encounterSceneInfo = encounterSceneOne.toString();
       System.out.println(encounterSceneInfo);
       
   //RegularSceneType Class
       
       RegularSceneType regularSceneOne = new RegularSceneType();
       
       regularSceneOne.setDescription("You see a barren wasteland.");
       String regularSceneInfo = regularSceneOne.toString();
       System.out.println(regularSceneInfo);
      
    }

}   
    

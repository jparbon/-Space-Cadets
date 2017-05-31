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
import byui.cit260.returnToRexburg.view.StartProgramView;

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
    
            //create StartProgramView original and display the StartProgramView
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
      
    }

}   
    

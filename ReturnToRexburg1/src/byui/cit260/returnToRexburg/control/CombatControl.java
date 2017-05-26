/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import byui.cit260.returnToRexburg.model.Actor;
import java.util.Random;

/**
 *
 * @author douglasarbon1
 */
public class CombatControl {
 
//Combat (userInput, player, alien);
//calculateAccuracy(userInput, player.getBaseAttackValue(), player.getWeapon().getBonusToAttack(), 
//alien.getDefenseValue()); 
//alienDamage = getDamage();

    public static boolean calculateAccuracy(int userInput, int baseAttackValue, int bonusToAttack, int defenseValue) {
        int LIGHT_ATTACK_BONUS = 2;
        Random random = new Random();
        boolean isAdding = random.nextBoolean();
        int attackTotal = baseAttackValue + bonusToAttack + LIGHT_ATTACK_BONUS;
        
        if (isAdding == false) {
            attackTotal = -attackTotal;
        }
        int attackOutput = userInput + attackTotal;
        
        if (attackOutput >= defenseValue) {
            return true;
        }
        return false;
    }




//public void lightAttack(double userInput, double actorAttack, double bonusToAttack, double bonusToDefense, 
    //     double bonusToDamage, double opponentDefense, double actorAttackOutput)

/*    public void lightAttack(int userInput, Actor actorAttack, Actor actorDefense, double actorAttackOutput)
    
{
		
 light attack’s extra 2 to attack.
int LIGHT_ATTACK_BONUS = 2;

while(actorOne.currentHealth > 0 || actorOne.currentHealth > 0)
{
 		// random unit of 1 or 2
		int addOrSubtract = (int)((Math.random() * 2));
 
		// Checks to make sure the user input is valid
                if(userInput >= 21 && <=0) {
 
		// switch to decide whether we add or subtract
                    switch(addOrSubtract) {
                    		
        	       case 1: // case 1 will add
                    	actorAttackOutput = userInput + (player.baseAttackValue+
                        bonusToAttack + LIGHT_ATTACK_BONUS);
                    	break;
                                   		
                       case 2: // case 2 will subtract
                        actorAttackOutput = userInput - (player.baseAttackValue +     
                        bonusToAttack + LIGHT_ATTACK_BONUS);
                    	break;
        	                    		
                       default:
                        break;
			//Display error;
                   }
			
                    // compares the output to the alien's defense.
                    if(actorAttackOutput >= alienDefense) {		
                        alien.currentHealth -= player.baseDamageValue + player.weapon.bonusToDamage;
                       
                        if (alien.currentHealth <= 0) { // you win!!!
                        //Display you lose!
                        break;
                        }
                        
                        else if (player.currentHealth <= 0) {// you lose!!
                        //Display you win!
                        break;
                        }
                    }
			// if attack is lower than alien defense.
                    else {
                        System.out.println("You missed the alien!"); 
        		}
			
			//alienAttack();
                }
                //error if user input is greater than 20 or less than 0
                else {
        	       System.out.println("You have entered an invalid number. Please enter a valid number between 1 and 20.")       
        	}
                
                return actorAttackOutput; 
	}
*/ 
}
    
  
    
    
    
    
    
    
   


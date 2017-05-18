/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.model;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author shear
 */
public class CombatScene {
    //class instance variables
    private int playerAttackOutput;
    private int alienAttackOutput;

    //default constructor
    public CombatScene() {
    }

       // player attack output getter
    public int getPlayerAttackOutput() {
        return playerAttackOutput;
    }

    // player attack output setter
    public void setPlayerAttackOutput(int playerAttackOutput) {
        this.playerAttackOutput = playerAttackOutput;
    }

    //alien attack output getter
    public int getAlienAttackOutput() {
        return alienAttackOutput;
    }

    // alien attack output setter
    public void setAlienAttackOutput(int alienAttackOutput) {
        this.alienAttackOutput = alienAttackOutput;
    }
    
    
    // needs attack in actor defined before it will work.
   /* public int lightAttack() {
        playerAttackOutput = (int) ((Math.random() * 20) + player.attack + 2);
        return playerAttackOutput;
    }
  */
    
    // needs attack in actor defined before it will work.
   /* public int heavyAttack() {
        playerAttackOutput = (int) ((Math.random() * 20) + player.attack);
        return playerAttackOutput;
    }
  */
    
    // aliens attack roll. Needs attack defined to work.
    /*public int alienAttack() {
    alienAttackOutput = (int) ((Math.random() * 20) + alien.attack);
    return alienAttackOutput;
    }*/

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.playerAttackOutput;
        hash = 59 * hash + this.alienAttackOutput;
        return hash;
    }

    @Override
    public String toString() {
        return "CombatScene{" + "playerAttackOutput=" + playerAttackOutput + ", alienAttackOutput=" + alienAttackOutput + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) == false) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CombatScene other = (CombatScene) obj;
        if (this.playerAttackOutput != other.playerAttackOutput) {
            return false;
        }
        if (this.alienAttackOutput != other.alienAttackOutput) {
            return false;
        }
        return true;
    }
 
    
}
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


public class CombatScene extends RegularSceneType implements Serializable{
    
    //class instance variables
    private String description;
    private int actorAttackOutput;

    //default constructor
    public CombatScene() {
    }
 
    //getter
    public int getActorAttackOutput() {
        return actorAttackOutput;
    }

    //setter
    public void setActorAttackOutput(int actorAttackOutput) {
        this.actorAttackOutput = actorAttackOutput;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.actorAttackOutput;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
         //parent class can check
        if (super.equals(obj) == false){
            return false;    
        }
        //if (obj == null) {
        //    return false;
        //}
      
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CombatScene other = (CombatScene) obj;
        if (this.actorAttackOutput != other.actorAttackOutput) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CombatScene{" + "actorAttackOutput=" + actorAttackOutput + '}';
    }
    
    
}

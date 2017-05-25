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
 * @author nataliadams
 */

//Player class inherits from Actor class
public class Player extends Actor implements Serializable{
    
    //class instance variables
    private String currentWeaponEquipped;
    private int totalNumberOfWeapons; 

    //constructor
    public Player() { 
    }
    
    //getters and setters
    public String getCurrentWeaponEquipped() {
        return currentWeaponEquipped;
    }

    public void setCurrentWeaponEquipped(String currentWeaponEquipped) {
        this.currentWeaponEquipped = currentWeaponEquipped;
    }

    public int getTotalNumberOfWeapons() {
        return totalNumberOfWeapons;
    }

    public void setTotalNumberOfWeapons(int totalNumberOfWeapons) {
        this.totalNumberOfWeapons = totalNumberOfWeapons;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.currentWeaponEquipped);
        hash = 53 * hash + this.totalNumberOfWeapons;
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
        final Player other = (Player) obj;
        if (this.totalNumberOfWeapons != other.totalNumberOfWeapons) {
            return false;
        }
        if (!Objects.equals(this.currentWeaponEquipped, other.currentWeaponEquipped)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Player{" + super.toString() + "currentWeaponEquipped=" + currentWeaponEquipped + ", totalNumberOfWeapons=" + totalNumberOfWeapons + '}';
    }
    
}

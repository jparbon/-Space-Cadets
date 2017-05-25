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
public class Weapon implements Serializable{
    
    //class instance variables
    private String name;
    private int bonusToAttack;
    private int bonusToDefense;
    private int bonusToDamage;
    private String acquiredWeapon;

    
    //constructor
    public Weapon() {
    }
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonusToAttack() {
        return bonusToAttack;
    }

    public void setBonusToAttack(int bonusToAttack) {
        this.bonusToAttack = bonusToAttack;
    }

    public int getBonusToDefense() {
        return bonusToDefense;
    }

    public void setBonusToDefense(int bonusToDefense) {
        this.bonusToDefense = bonusToDefense;
    }

    public int getBonusToDamage() {
        return bonusToDamage;
    }

    public void setBonusToDamage(int bonusToDamage) {
        this.bonusToDamage = bonusToDamage;
    }

    public String getAcquiredWeapon() {
        return acquiredWeapon;
    }

    public void setAcquiredWeapon(String acquiredWeapon) {
        this.acquiredWeapon = acquiredWeapon;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.bonusToAttack;
        hash = 53 * hash + this.bonusToDefense;
        hash = 53 * hash + this.bonusToDamage;
        hash = 53 * hash + Objects.hashCode(this.acquiredWeapon);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Weapon other = (Weapon) obj;
        if (this.bonusToAttack != other.bonusToAttack) {
            return false;
        }
        if (this.bonusToDefense != other.bonusToDefense) {
            return false;
        }
        if (this.bonusToDamage != other.bonusToDamage) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.acquiredWeapon, other.acquiredWeapon)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", bonusToAttack=" + bonusToAttack + ", bonusToDefense=" + bonusToDefense + ", bonusToDamage=" + bonusToDamage + ", acquiredWeapon=" + acquiredWeapon + '}';
    }
   
}

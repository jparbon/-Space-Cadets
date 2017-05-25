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
 * @author douglasarbon1
 */
public class Actor implements Serializable {
    
    //class instance variables
    private String name;
    private int currentHealth;
    private int maximumHealth;
    private String currentLocation;
    private int baseAttackValue;
    private int baseDamageValue;
    private int defenseValue;

    //constructor
    //Actor is the Super class; Player class inherits from Actor class.
    public Actor() {
        super();
    }
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaximumHealth() {
        return maximumHealth;
    }

    public void setMaximumHealth(int maximumHealth) {
        this.maximumHealth = maximumHealth;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getBaseAttackValue() {
        return baseAttackValue;
    }

    public void setBaseAttackValue(int baseAttackValue) {
        this.baseAttackValue = baseAttackValue;
    }

    public int getBaseDamageValue() {
        return baseDamageValue;
    }

    public void setBaseDamageValue(int baseDamageValue) {
        this.baseDamageValue = baseDamageValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.currentHealth;
        hash = 47 * hash + this.maximumHealth;
        hash = 47 * hash + Objects.hashCode(this.currentLocation);
        hash = 47 * hash + this.baseAttackValue;
        hash = 47 * hash + this.baseDamageValue;
        hash = 47 * hash + this.defenseValue;
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
        final Actor other = (Actor) obj;
        if (this.currentHealth != other.currentHealth) {
            return false;
        }
        if (this.maximumHealth != other.maximumHealth) {
            return false;
        }
        if (this.currentLocation != other.currentLocation) {
            return false;
        }
        if (this.baseAttackValue != other.baseAttackValue) {
            return false;
        }
        if (this.baseDamageValue != other.baseDamageValue) {
            return false;
        }
        if (this.defenseValue != other.defenseValue) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
   
   }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", currentHealth=" + currentHealth + ", maximumHealth=" + maximumHealth + ", currentLocation=" + currentLocation + ", baseAttackValue=" + baseAttackValue + ", baseDamageValue=" + baseDamageValue + ", defenseValue=" + defenseValue + '}';
    }
}

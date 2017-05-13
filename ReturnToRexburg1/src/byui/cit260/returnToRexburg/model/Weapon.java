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
    private double attackBonus;
    private double damageBonus;
    private double defenseBonus;
    private String damageType;

    public Weapon() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.attackBonus) ^ (Double.doubleToLongBits(this.attackBonus) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.damageBonus) ^ (Double.doubleToLongBits(this.damageBonus) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.defenseBonus) ^ (Double.doubleToLongBits(this.defenseBonus) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.damageType);
        return hash;
    }
    
    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", attackBonus=" + attackBonus + ", damageBonus=" + damageBonus + ", defenseBonus=" + defenseBonus + ", damageType=" + damageType + '}';
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
        if (Double.doubleToLongBits(this.attackBonus) != Double.doubleToLongBits(other.attackBonus)) {
            return false;
        }
        if (Double.doubleToLongBits(this.damageBonus) != Double.doubleToLongBits(other.damageBonus)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defenseBonus) != Double.doubleToLongBits(other.defenseBonus)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.damageType, other.damageType)) {
            return false;
        }
        return true;
    }
    
    
}

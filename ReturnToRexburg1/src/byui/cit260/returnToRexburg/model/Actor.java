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
    
    //attributes: name, minimumHealth, maximumHealth, attack, damage, defense
    private String name;
    private String player;
    private int minimumHealth;
    private int maximumHealth;
    private int attack;
    private int damage;
    private int defense;

    public Actor() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
    
    public int getMinimumHealth() {
        return minimumHealth;
    }

    public void setMinimumHealth(int minimumHealth) {
        this.minimumHealth = minimumHealth;
    }

    public int getMaximumHealth() {
        return maximumHealth;
    }

    public void setMaximumHealth(int maximumHealth) {
        this.maximumHealth = maximumHealth;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.player);
        hash = 29 * hash + this.minimumHealth;
        hash = 29 * hash + this.maximumHealth;
        hash = 29 * hash + this.attack;
        hash = 29 * hash + this.damage;
        hash = 29 * hash + this.defense;
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
        if (this.minimumHealth != other.minimumHealth) {
            return false;
        }
        if (this.maximumHealth != other.maximumHealth) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        if (this.damage != other.damage) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", player=" + player + ", minimumHealth=" + minimumHealth + ", maximumHealth=" + maximumHealth + ", attack=" + attack + ", damage=" + damage + ", defense=" + defense + '}';
    }
    
  
}

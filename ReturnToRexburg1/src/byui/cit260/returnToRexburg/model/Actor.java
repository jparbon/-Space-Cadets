/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.model;


import java.io.Serializable;
/**
 *
 * @author douglasarbon1
 */
public class Actor implements Serializable {
    
    //attributes: name, minimumHealth, maximumHealth, attack, damage, defense
    private String name;
    private int minimumHealth;
    private int maximumHealth;
    private int attack;
    private int damage;
    private int defense;

    public Actor() {
    }
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
 
    
}

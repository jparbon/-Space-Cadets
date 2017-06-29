/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.model;

import byui.cit260.returnToRexburg.view.View;
import java.io.Serializable;
import java.util.Objects;

import java.util.ArrayList;

/**
 *
 * @author douglasarbon1
 */
public class Game extends View implements Serializable {

    //class instance variables
    private String description;
    private String player;
    private Spaceship spaceship;
    private Map map;
    private Map newMap;

    private ArrayList<Trophy> trophies;

    //default constructor
    public Game() {
        trophies = new ArrayList<>();
    }

    //getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
    }

    public Map getMap() {
        return map;
    }

    public ArrayList<Trophy> getTrophies(){
        return trophies;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + Objects.hashCode(this.player);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "description=" + description + ", player=" + player + '}';
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public void setPlayer(Player player) {
        System.out.println("This set the player.");
    }

}

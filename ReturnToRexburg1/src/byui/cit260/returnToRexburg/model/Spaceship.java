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
public class Spaceship implements Serializable{

    private String name;
    private int currentFuel;
    private int maximumFuel;
 
    public Spaceship() {
        this.name = "\nRoxy";
        this.currentFuel = 0;
        this.maximumFuel = 100;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int minimumFuel) {
        this.currentFuel = minimumFuel;
    }

    public int getMaximumFuel() {
        return maximumFuel;
    }

    public void setMaximumFuel(int maximumFuel) {
        this.maximumFuel = maximumFuel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + this.currentFuel;
        hash = 29 * hash + this.maximumFuel;
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
        final Spaceship other = (Spaceship) obj;
        if (this.currentFuel != other.currentFuel) {
            return false;
        }
        if (this.maximumFuel != other.maximumFuel) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Spaceship{" + "name=" + name + ", minimumFuel=" + currentFuel + ", maximumFuel=" + maximumFuel + '}';
    }
   
    
}

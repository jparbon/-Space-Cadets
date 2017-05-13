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
    private int minimumFuel;
    private int maximumFuel;
 
    public Spaceship() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinimumFuel() {
        return minimumFuel;
    }

    public void setMinimumFuel(int minimumFuel) {
        this.minimumFuel = minimumFuel;
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
        hash = 29 * hash + this.minimumFuel;
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
        if (this.minimumFuel != other.minimumFuel) {
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
        return "Spaceship{" + "name=" + name + ", minimumFuel=" + minimumFuel + ", maximumFuel=" + maximumFuel + '}';
    }
   
    
}

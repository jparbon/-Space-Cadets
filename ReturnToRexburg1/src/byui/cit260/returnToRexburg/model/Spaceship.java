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
    
    
    
   
    
}

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
    private String currentLocation;
    private String name;

    //default constructor  
    public Actor(String name) {  
        currentLocation = new String(currentLocation);
        this.name = name;
    }

    //convenience constructor
    public Actor(String currentLocation, String name) {
        setCurrentLocation(currentLocation);
        setName(name);
    } 

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
        public String toString() {
        return "Actor{" + "name=" + name + ", currentLocation=" + currentLocation + '}';
    }
}   


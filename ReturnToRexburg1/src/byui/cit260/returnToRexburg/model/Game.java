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
public class Game implements Serializable{
  
    private String description;

 
    public Game() {
    }

    //getter and setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Game{" + "description=" + description + '}';
    }
 
    
}

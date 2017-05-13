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
 * @author caseyShear
 */
public class RegularSceneType {
     //class instance variables
    private String description;

    // default constructor
    public RegularSceneType() {
    }
    
    //getter
    public String getDescription() {
        return description;
    }

    //setter
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}

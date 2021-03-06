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
public class RegularSceneType implements Serializable {
     
    //class instance variables
    private String description;

    // default constructor
    public RegularSceneType() {
        super();
    }
    
    //getter
    public String getDescription() {
        return description;
    }

    //setter
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.description);
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
        final RegularSceneType other = (RegularSceneType) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegularSceneType{" + "description=" + description + '}';
    }
    
    
    
    
}

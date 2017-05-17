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
public class Alien {
    /**
     * class instance variables
     * weaknesses can be "energy", "balastic", or "explosive"
     */
    private String weakness;

    // default constructor
    public Alien() {
    }
    
    // getter
    public String getWeakness() {
        return weakness;
    }

    // setter
    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.weakness);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) == false) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alien other = (Alien) obj;
        if (!Objects.equals(this.weakness, other.weakness)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alien{" + "weakness=" + weakness + '}';
    }
    
    
    
    
    
}

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
 * @author shear
 */
public class ResourceScene {
    //class instance variables
    private int amount;

    //default constructor
    public ResourceScene() {
    }

    //getter
    public int getAmount() {
        return amount;
    }

    //setter
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.amount;
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
        final ResourceScene other = (ResourceScene) obj;
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourceScene{" + "amount=" + amount + '}';
    }
    
    
    
    
    
}

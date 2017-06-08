/*
 
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
public class LocationScene extends RegularSceneType implements Serializable {
 
    //class instance variables
    private String locationName;
    private int surfaceHardness;
    private int planetDepth;

    //constructor
    public LocationScene() {
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getSurfaceHardness() {
        return surfaceHardness;
    }

    public void setSurfaceHardness(int surfaceHardness) {
        this.surfaceHardness = surfaceHardness;
    }

    public int getPlanetDepth() {
        return planetDepth;
    }

    public void setPlanetDepth(int planetDepth) {
        this.planetDepth = planetDepth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.locationName);
        hash = 23 * hash + this.surfaceHardness;
        hash = 23 * hash + this.planetDepth;
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
        final LocationScene other = (LocationScene) obj;
        if (this.surfaceHardness != other.surfaceHardness) {
            return false;
        }
        if (this.planetDepth != other.planetDepth) {
            return false;
        }
        if (!Objects.equals(this.locationName, other.locationName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LocationScene{" + "locationName=" + locationName + ", surfaceHardness=" + surfaceHardness + ", planetDepth=" + planetDepth + '}';
    }

    
    
}



    


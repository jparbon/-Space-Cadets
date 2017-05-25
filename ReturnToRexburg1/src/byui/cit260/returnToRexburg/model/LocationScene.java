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
    private String name;
    private String mapLocation;
    private int surfaceHardness;
    private int planetDepth;
    private String alienSpecies;
    
    //constructor
    public LocationScene() {
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(String mapLocation) {
        this.mapLocation = mapLocation;
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

    public String getAlienSpecies() {
        return alienSpecies;
    }

    public void setAlienSpecies(String alienSpecies) {
        this.alienSpecies = alienSpecies;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.mapLocation);
        hash = 89 * hash + this.surfaceHardness;
        hash = 89 * hash + this.planetDepth;
        hash = 89 * hash + Objects.hashCode(this.alienSpecies);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
         //parent class can check
        if (super.equals(obj) == false){
            return false;    
        }
        //if (obj == null) {
        //    return false;
        //}
       
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.mapLocation, other.mapLocation)) {
            return false;
        }
        if (!Objects.equals(this.alienSpecies, other.alienSpecies)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LocationScene{" + "name=" + name + ", mapLocation=" + mapLocation + ", surfaceHardness=" + surfaceHardness + ", planetDepth=" + planetDepth + ", alienSpecies=" + alienSpecies + '}';
    }
 
}



    


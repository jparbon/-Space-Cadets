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
public class Location implements Serializable {
 
    //attributes: name, description, mapLocation, surfaceHardness, planetDepth, alienSpecies
    private String name;
    private String description;
    private String mapLocation;
    private int surfaceHardness;
    private int planetDepth;
    private String alienSpecies;
    
    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String location) {
        this.description = location;
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
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + Objects.hashCode(this.mapLocation);
        hash = 97 * hash + this.surfaceHardness;
        hash = 97 * hash + this.planetDepth;
        hash = 97 * hash + Objects.hashCode(this.alienSpecies);
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
        final Location other = (Location) obj;
        if (this.surfaceHardness != other.surfaceHardness) {
            return false;
        }
        if (this.planetDepth != other.planetDepth) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
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
        return "Location{" + "name=" + name + ", location=" + description + ", mapLocation=" + mapLocation + ", alienSpecies=" + alienSpecies + '}';
    }
    
}

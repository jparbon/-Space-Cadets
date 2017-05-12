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
public class Location implements Serializable {
 
    //attributes: name, description, mapLocation, surfaceHardness, planetDepth, alienSpecies
    private String name;
    private String location;
    private String mapLocation;
    private int surfaceHardness;
    private int planetDepth;
    private String alienSpecies;
    
    //constructor
    public Location() {
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
    public String toString() {
        return "Location{" + "name=" + name + ", location=" + location + ", mapLocation=" + mapLocation + ", alienSpecies=" + alienSpecies + '}';
    }

   
    //not sure methods???: gatherFuel, encounterAlien, travelToNewPlanet
    
}

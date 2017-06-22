/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author douglasarbon1
 */
public class Map implements Serializable{
    
    //class instance variables
    private String description;
    private LocationScene[] locationScene;
    
    
 
    //default constructor
    public Map() {
    }
    
    public static ArrayList<String> createLocationSceneList() {
        //create ArrayList of locations and information for each location
        
        //define the ArrayList
        ArrayList<String> location = new ArrayList<String>();
        
        location.add("Neptune");  //index 0
        location.add("Triton");   //index 1
        location.add("Proteus");  //index 2
        location.add("Titan");   //index 3
        location.add("F-Ring");  //index 4
        location.add("Triton");   //index 5
        location.add("Rhea");  //index 6
        location.add("Prometheus");   //index 7
        location.add("Pandora");  //index 8
        location.add("Oberon");   //index 9
        location.add("Ariel");  //index 10
        location.add("Wunda");   //index 11
        location.add("Mab");  //index 12
        location.add("Great Red Spot");   //index 13
        location.add("Lo");  //index 14
        location.add("Europa");   //index 15
        location.add("Ganymede");  //index 16
        location.add("Callisto");   //index 17
        location.add("Arabia Terra");  //index 18
        location.add("Planum Boreum");   //index 19
        location.add("Amazonis Planitia");  //index 20
        location.add("Syrtis");   //index 21
        location.add("Tharsis");  //index 22
        location.add("Phobos");   //index 23
        location.add("Aitken");  //index 24
        location.add("Montes Rook");   //index 25
        location.add("Earth");  //index 26
        
        return location;
  
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
        hash = 97 * hash + Objects.hashCode(this.description);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + '}';
    }
   
}

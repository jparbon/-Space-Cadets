/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author douglasarbon1
 */
public class Map implements Serializable{
    
    //class instance variables
    private String description;
    //private LocationScene[] locationScene;
  
    //default constructor
    public Map() {
    }
    
    public class createLocationList{
        //create Array(list) of locations and information for each location
        ArrayList<LocationScene> location = new ArrayList<LocationScene>(26);
        
        
        //LocationScene[] location = new LocationScene[26];
        /*
        location[0] = new LocationScene("Neptune", 0, 0, "question", "answer");
        location[1] = new LocationScene("Triton", 0, 0, "question", "answer");
        location[2] = new LocationScene("Proteus", 0, 0, "question", "answer");
        location[3] = new LocationScene("Titan", 0, 0, "question", "answer");
        location[4] = new LocationScene("F-Ring", 0, 0, "question", "answer");
        location[5] = new LocationScene("Rhea", 0, 0, "question", "answer");
        location[6] = new LocationScene("Prometheus", 0, 0, "question", "answer");
        location[7] = new LocationScene("Pandora", 0, 0, "question", "answer");
        location[8] = new LocationScene("Oberon", 0, 0, "question", "answer");
        location[9] = new LocationScene("Ariel", 0, 0, "question", "answer");
        location[10] = new LocationScene("Wunda", 0, 0, "question", "answer");
        location[11] = new LocationScene("Mab", 0, 0, "question", "answer");
        location[12] = new LocationScene("Great Red Spot", 0, 0, "question", "answer");
        location[13] = new LocationScene("Lo", 0, 0, "question", "answer");
        location[14] = new LocationScene("Europa", 0, 0, "question", "answer");
        location[15] = new LocationScene("Ganymede", 0, 0, "question", "answer");
        location[16] = new LocationScene("Callisto", 0, 0, "question", "answer");
        location[17] = new LocationScene("Arabia Terra", 0, 0, "question", "answer");
        location[18] = new LocationScene("Planum Boreum", 0, 0, "question", "answer");
        location[19] = new LocationScene("Amazonis Planitia", 0, 0, "question", "answer");
        location[20] = new LocationScene("Syrtis", 0, 0, "question", "answer");
        location[21] = new LocationScene("Tharsis", 0, 0, "question", "answer");
        location[22] = new LocationScene("Phobos", 0, 0, "question", "answer");
        location[23] = new LocationScene("Aitken", 0, 0, "question", "answer");
        location[24] = new LocationScene("Montes Rook", 0, 0, "question", "answer");
        location[25] = new LocationScene("Earth", 0, 0, "question", "answer");    
        
    }
        */
           
        
        //define the ArrayList
        /*
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
        
        for(int i = 0; i < location.size(); i++);
        
        return location;
   
    }
    */
    
    //getter
    public String getDescription() {
        return description;
    }
        
    //setter
    //public void setDescription(String description) {
        //this.description = description;
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

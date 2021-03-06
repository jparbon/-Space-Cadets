/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.model;

import byui.cit260.returnToRexburg.control.GameControl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Arrays;

/**
 *
 * @author douglasarbon1
 */
public class Map implements Serializable {

    //class instance variables
    private String description;
    public LocationScene[] locations;
    private int currentLocation;
    public int length;
    public LocationScene[] actors;

    public LocationScene[] getActors() {
        return actors;
    }

    public void setActors(LocationScene[] actors) {
        this.actors = actors;
    }
    
    public static Actor[] createActorList() {
        // create array(list) of actor

        Actor[] actor = new Actor[26];

        //list of actors
        actor[0] = new Actor("Neptune", "Rex", "easy");
        actor[1] = new Actor("Triton", "Orbit Triton", "easy");
        actor[2] = new Actor("Proteus", "Pebrelz", "easy");
        actor[3] = new Actor("Titan", "Tyap", "easy");
        actor[4] = new Actor("F-Ring", "Tredduhr", "easy");
        actor[5] = new Actor("Rhea", "Blubot", "medium");
        actor[6] = new Actor("Prometheus", "Rwadhi", "medium");
        actor[7] = new Actor("Pandora", "Comelius", "medium");
        actor[8] = new Actor("Oberon", "Oberocliptian", "medium");
        actor[9] = new Actor("Ariel", "Aristices", "medium");
        actor[10] = new Actor("Wunda", "Woolenep", "hard");
        actor[11] = new Actor("Mab", "Mabonean", "hard");
        actor[12] = new Actor("Great Red Spot", "Poxibeast", "hard");
        actor[13] = new Actor("Lo", "Lava Monster", "hard");
        actor[14] = new Actor("Europa", "Silician", "hard");
        actor[15] = new Actor("Ganymede", "Gigantor", "hard");
        actor[16] = new Actor("Callisto", "Callipso", "hard");
        actor[17] = new Actor("Arabia Terra", "Azarius", "hard");
        actor[18] = new Actor("Planum Boreum", "Atinecle", "expert");
        actor[19] = new Actor("Amazonis Planitia", "Mutator", "expert");
        actor[20] = new Actor("Syrtis", "Plactodil", "expert");
        actor[21] = new Actor("Tharsis", "Toriador", "expert");
        actor[22] = new Actor("Phobos", "Aracnophilian", "expert");
        actor[23] = new Actor("Aitken", "Rabitus", "expert");
        actor[24] = new Actor("Montes Rook", "Verminius", "expert");
        actor[25] = new Actor("Earth", "Rexburg", "expert");

        return actor;
    }

    //default constructor
    public Map() {
    }

    
    //create Array(list) of locations and information for each location
    public LocationScene[] getLocations() {
        return locations;
    }

    public void setLocations(LocationScene[] locations) {
        this.locations = locations;
    }

    public static LocationScene[] createLocationList() {
        
        //create an array (list) of 25 locations
        int[] myIntList = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
            14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        
        //create and define ArrayList by adding integers for all locations; use ArrayList to add more locations later, if necessary.
        ArrayList<Integer> myArrayList = new ArrayList<Integer>(); //ArrayList<dataType> variableName 

        myArrayList.add(1);  //index 0
        myArrayList.add(2);   //index 1
        myArrayList.add(3);  //index 2
        myArrayList.add(4);   //index 3
        myArrayList.add(5);  //index 4
        myArrayList.add(6);   //index 5
        myArrayList.add(7);  //index 6
        myArrayList.add(8);   //index 7
        myArrayList.add(9);  //index 8
        myArrayList.add(10);   //index 9
        myArrayList.add(11);  //index 10
        myArrayList.add(12);   //index 11
        myArrayList.add(13);  //index 12
        myArrayList.add(14);   //index 13
        myArrayList.add(15);  //index 14
        myArrayList.add(16);   //index 15
        myArrayList.add(17);  //index 16
        myArrayList.add(18);   //index 17
        myArrayList.add(19);  //index 18
        myArrayList.add(20);   //index 19
        myArrayList.add(21);  //index 20
        myArrayList.add(22);   //index 21
        myArrayList.add(23);  //index 22
        myArrayList.add(24);   //index 23
        myArrayList.add(25);  //index 24
        myArrayList.add(26);   //index 25
        myArrayList.add(27);  //index 26
        
        //myArrayList.add(27, 28);
         

        LocationScene[] location = new LocationScene[26]; //use new to call the constructor

        location[0] = new LocationScene("  0 - Neptune", 0, 0, "question", "answer");
        location[1] = new LocationScene("  1 - Triton", 5, 10, "question", "answer");
        location[2] = new LocationScene("  2 - Proteus", 10, 10, "question", "answer");
        location[3] = new LocationScene("  3 - Titan", 15, 6, "question", "answer");
        location[4] = new LocationScene("  4 - F-Ring", 8, 9, "question", "answer");
        location[5] = new LocationScene("  5 - Rhea", 3, 2, "question", "answer");
        location[6] = new LocationScene("  6 - Prome", 5, 11, "question", "answer");
        location[7] = new LocationScene("  7 - Pandora", 20, 10, "question", "answer");
        location[8] = new LocationScene("  8 - Oberon", 3, 2, "question", "answer");
        location[9] = new LocationScene("  9 - Ariel", 20, 10, "question", "answer");
        location[10] = new LocationScene(" 10 - Wunda", 20, 4, "question", "answer");
        location[11] = new LocationScene(" 11 - Mab", 10, 5, "question", "answer");
        location[12] = new LocationScene(" 12 - Red", 2, 5, "question", "answer");
        location[13] = new LocationScene(" 13 - Lo", 7, 8, "question", "answer");
        location[14] = new LocationScene(" 14 - Europa", 16, 12, "question", "answer");
        location[15] = new LocationScene(" 15 - Ganymede", 15, 3, "question", "answer");
        location[16] = new LocationScene(" 16 - Callisto", 18, 4, "question", "answer");
        location[17] = new LocationScene(" 17 - Arabia", 15, 1, "question", "answer");
        location[18] = new LocationScene(" 18 - Boreum", 21, 4, "question", "answer");
        location[19] = new LocationScene(" 19 - Amazonis", 15, 16, "question", "answer");
        location[20] = new LocationScene(" 20 - Syrtis", 2, 8, "question", "answer");
        location[21] = new LocationScene(" 21 - Tharsis", 9, 20, "question", "answer");
        location[22] = new LocationScene(" 22 - Phobos", 5, 10, "question", "answer");
        location[23] = new LocationScene(" 23 - Aitken", 2, 10, "question", "answer");
        location[24] = new LocationScene(" 24 - Montes", 20, 10, "question", "answer");
        location[25] = new LocationScene(" 25 - Earth", 0, 0, "question", "answer");

        return location;
    }

    //getters
    public String getDescription() {
        return description;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }
    
    //setters
    public void setDescription(String description) {
        //this.description = description;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
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

    public void setLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*//one-dimensional map; list of locations
    public Map(int numberOfRows){
        if (numberOfRows < 1) {
            System.out.println("The number of rows must be > zero.");
            return;
        }
    
        this.numberOfRows = numberOfRows;
        
        //create 1-D array for location objects
        this.locations = new LocationScene[numberOfRows];
        
        for (int row = 0; row < numberOfRows; row++) {
           //create and initialize new LocationScene object instance 
           LocationScene location = new LocationScene();
           location.setRow(row);
           location.setVisited(false);
           
           //assign the Location object to the current position in array
           locations[row] = location;
        } 
    }
       
    private static LocationScene[] createScenes() {
        LocationScene[] location = new LocationScene[Map.locationScene().length];
        
        LocationScene startingScene = new LocationScene();
        startingScene.setDescription(
                  "You have landed on Neptune."
                + "\n......"
        );
        startingScene.setMapSymbol("1");
        location[RegularSceneType.start.ordinal()] = location;
        
        LocationScene finishScene = new LocationScene();
        finishScene.setDescription(
                 "Congratulations!"
                +"----"
        );
        finishScene.setMapSymbol("");  
        
        return location;
        
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[] locations = map.getLocations();
        
        //start point
        locations[0].setScene(scenes[SceneType.])
    
    }
    
    public static Map createMap() {
        //create the map
        Map map = new Map();
        //create the scenes for the game
        LocationScene[] scenes = createScenes();
        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }    
     */
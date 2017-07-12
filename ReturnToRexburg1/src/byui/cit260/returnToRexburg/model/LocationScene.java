/*
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.model;

import byui.cit260.returnToRexburg.view.Scene;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author douglasarbon1
 */
public final class LocationScene extends RegularSceneType implements Serializable {

    public static ArrayList<LocationScene> location; //static variables remain constant and do not go anywhere and are loaded into runtime memory for use later!
    public static ArrayList<LocationScene> actor; //static variables ARE NOT instances or copies and exist long-term!

    //class instance variables
    private String locationName;
    private static int SURFACE_HARDNESS; //CONSTANTS are static because their value cannot be changed. 
    private static int PLANET_DEPTH; //There is only ONE copy of this value across all objects of the class.
    private String locationQuestion;
    private String locationAnswer;
    private Scene scene;
    private String currentLocation;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String difficulty;

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
   

    //default constructor
    public LocationScene(String locationName, int surfaceHardness, int planetDepth, String locationQuestion, String locationAnswer) {
        locationName = new String(locationName);
        locationName = null;
        surfaceHardness = new Integer(surfaceHardness);
        surfaceHardness = 0;
        planetDepth = new Integer(planetDepth);
        planetDepth =  0;
        locationQuestion = new String(locationQuestion);
        locationQuestion = null;
        locationAnswer = new String(locationAnswer);
        locationAnswer = null;

    }

    //public LocationScene() {
    //    System.out.println("This creates a new scene.");
    //}

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene locationScene) {
        scene = locationScene;

    }

   public static Actor[] createActorList() {
        // create array (list) of actors
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

    //convenience constructor
    public LocationScene() {
        setLocationName(locationName);
        setSurfaceHardness(SURFACE_HARDNESS);
        setPlanetDepth(PLANET_DEPTH);
        setLocationQuestion(locationQuestion);
        setLocationAnswer(locationAnswer);

    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getSurfaceHardness() {
        return SURFACE_HARDNESS;
    }

    public final static void setSurfaceHardness(int surfaceHardness) {
        SURFACE_HARDNESS = surfaceHardness;
    }

    public int getPlanetDepth() {
        return PLANET_DEPTH;
    }

    public void setPlanetDepth(int planetDepth) {
        PLANET_DEPTH = planetDepth;
    }

    public String getLocationQuestion() {
        return locationQuestion;
    }

    public void setLocationQuestion(String locationQuestion) {
        this.locationQuestion = locationQuestion;
    }

    public String getLocationAnswer() {
        return locationAnswer;
    }

    public void setLocationAnswer(String locationAnswer) {
        this.locationAnswer = locationAnswer;
    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.locationName);
        hash = 89 * hash + this.SURFACE_HARDNESS;
        hash = 89 * hash + this.PLANET_DEPTH;
        hash = 89 * hash + Objects.hashCode(this.locationQuestion);
        hash = 89 * hash + Objects.hashCode(this.locationAnswer);
     
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
        if (this.SURFACE_HARDNESS != other.SURFACE_HARDNESS) {
            return false;
        }
        if (this.PLANET_DEPTH != other.PLANET_DEPTH) {
            return false;
        }
  
        if (!Objects.equals(this.locationName, other.locationName)) {
            return false;
        }
        if (!Objects.equals(this.locationQuestion, other.locationQuestion)) {
            return false;
        }
        if (!Objects.equals(this.locationAnswer, other.locationAnswer)) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "LocationScene{" + "locationName=" + locationName + ", surfaceHardness=" + 
                SURFACE_HARDNESS + ", planetDepth=" + PLANET_DEPTH + ", locationQuestion=" + 
                locationQuestion + ", locationAnswer=" + locationAnswer +  '}';
    }

    

}

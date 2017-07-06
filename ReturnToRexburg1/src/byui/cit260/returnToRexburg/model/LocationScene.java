/*
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.model;

import byui.cit260.returnToRexburg.view.Scene;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author douglasarbon1
 */
public final class LocationScene extends RegularSceneType implements Serializable {

    //class instance variables
    private String locationName;
    private int surfaceHardness;
    private int planetDepth;
    private String locationQuestion;
    private String locationAnswer;
    private Scene scene;
   

    //default constructor
    public LocationScene(String locationName, int surfaceHardness, int planetDepth, String locationQuestion, String locationAnswer) {
        locationName = new String(locationName);
        this.locationName = locationName;
        surfaceHardness = new Integer(surfaceHardness);
        this.surfaceHardness = surfaceHardness;
        planetDepth = new Integer(planetDepth);
        this.planetDepth = planetDepth;
        locationQuestion = new String(locationQuestion);
        this.locationQuestion = locationQuestion;
        locationAnswer = new String(locationAnswer);
        this.locationAnswer = locationAnswer;

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
        // create array(list) of actor

        Actor[] actor = new Actor[26];

        //list of actors
        actor[0] = new Actor("Neptune", "Rex");
        actor[1] = new Actor("Triton", "Orbit Triton");
        actor[2] = new Actor("Proteus", "Pebrelz");
        actor[3] = new Actor("Titan", "Tyap");
        actor[4] = new Actor("F-Ring", "Tredduhr");
        actor[5] = new Actor("Rhea", "Blubot");
        actor[6] = new Actor("Prometheus", "Rwadhi");
        actor[7] = new Actor("Pandora", "Comelius");
        actor[8] = new Actor("Oberon", "Oberocliptian");
        actor[9] = new Actor("Ariel", "Aristices");
        actor[10] = new Actor("Wunda", "Woolenep");
        actor[11] = new Actor("Mab", "Mabonean");
        actor[12] = new Actor("Great Red Spot", "Poxibeast");
        actor[13] = new Actor("Lo", "Lava Monster");
        actor[14] = new Actor("Europa", "Silician");
        actor[15] = new Actor("Ganymede", "Gigantor");
        actor[16] = new Actor("Callisto", "Callipso");
        actor[17] = new Actor("Arabia Terra", "Azarius");
        actor[18] = new Actor("Planum Boreum", "Atinecle");
        actor[19] = new Actor("Amazonis Planitia", "Mutator");
        actor[20] = new Actor("Syrtis", "Plactodil");
        actor[21] = new Actor("Tharsis", "Toriador");
        actor[22] = new Actor("Phobos", "Aracnophilian");
        actor[23] = new Actor("Aitken", "Rabitus");
        actor[24] = new Actor("Montes Rook", "Verminius");
        actor[25] = new Actor("Earth", "Rexburg");

        return actor;
    }

    //convenience constructor
    public LocationScene() {
        setLocationName(locationName);
        setSurfaceHardness(surfaceHardness);
        setPlanetDepth(planetDepth);
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
        hash = 89 * hash + this.surfaceHardness;
        hash = 89 * hash + this.planetDepth;
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
        if (this.surfaceHardness != other.surfaceHardness) {
            return false;
        }
        if (this.planetDepth != other.planetDepth) {
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
                surfaceHardness + ", planetDepth=" + planetDepth + ", locationQuestion=" + 
                locationQuestion + ", locationAnswer=" + locationAnswer +  '}';
    }

    

}

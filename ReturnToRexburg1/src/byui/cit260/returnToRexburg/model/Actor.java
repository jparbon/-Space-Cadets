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

public class Actor implements Serializable {

    //class instance variables
    private String currentLocation;
    private String name;
    private String difficulty;

    //default constructor  
   /* public Actor(String name) {  
        currentLocation = new String(currentLocation);
        this.name = name;
    }

    //convenience constructor
    public Actor(String currentLocation, String name) {
        setCurrentLocation(currentLocation);
        setName(name);
    } */

    public Actor(String currentLocation, String name, String difficulty) {
        setCurrentLocation(currentLocation);
        setName(name);
        setDifficulty(difficulty);
    }

      /*  public static Actor[] createActorList() {
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
    }*/
        
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getDifficulty(){
        return difficulty;
    }
    
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
    }
    
    @Override
        public String toString() {
        return "Actor{" + "name=" + name + ", currentLocation=" + currentLocation + '}';
    }
}   


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.Map;

/**
 *
 * @author douglasarbon1
 */
public class MapControl {

    public static Map createMap() {
       //create the map
       Map map = new Map();
       LocationScene[] location = new LocationScene[26];
       
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
       
       assignScenesToLocations(location);
       return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("This moves the actors to the starting location.");
    }
    
    private static void assignScenesToLocations(LocationScene[] location) {
        System.out.println("This assigns the scenes to locations");
        //stub function until we figure out how to do this!
    }    
        /*location[0].setScene("Neptune");
        location[1].setScene(new LocationScene());
        location[2].setScene(new LocationScene());
        location[3].setScene(new LocationScene());
        location[4].setScene(new LocationScene());
        location[5].setScene(new LocationScene());
        location[6].setScene(new LocationScene());
        location[7].setScene(new LocationScene());
        location[8].setScene(new LocationScene());
        location[9].setScene(new LocationScene());
        location[10].setScene(new LocationScene());
        location[11].setScene(new LocationScene());
        location[12].setScene(new LocationScene());
        location[13].setScene(new LocationScene());
        location[14].setScene(new LocationScene());
        location[15].setScene(new LocationScene());
        location[16].setScene(new LocationScene());
        location[17].setScene(new LocationScene());
        location[18].setScene(new LocationScene());
        location[19].setScene(new LocationScene());
        location[20].setScene(new LocationScene());
        location[21].setScene(new LocationScene());
        location[22].setScene(new LocationScene());
        location[23].setScene(new LocationScene());
        location[24].setScene(new LocationScene());
        location[25].setScene(new LocationScene());
    
    */
}

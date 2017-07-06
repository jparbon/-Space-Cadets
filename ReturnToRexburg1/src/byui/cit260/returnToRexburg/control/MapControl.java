/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import byui.cit260.returnToRexburg.exceptions.MapControlException;
import byui.cit260.returnToRexburg.model.Actor;
import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.Map;

import java.util.ArrayList;
import returntorexburg1.ReturnToRexburg1;

/**
 *
 * @author douglasarbon1
 */
public class MapControl {

    public static Map createMap() {
        //create the map
        Map map = new Map();
        LocationScene[] location = new LocationScene[26];

        location[0] = new LocationScene("  0 - Neptune", 0, 0, "question", "answer");
        location[1] = new LocationScene("  1 - Triton", 5, 10, "question", "answer");
        location[2] = new LocationScene("  2 - Proteus", 10, 10, "question", "answer");
        location[3] = new LocationScene("  3 - Titan", 15, 6, "question", "answer");
        location[4] = new LocationScene("  4 - F-Ring", 8, 9, "question", "answer");
        location[5] = new LocationScene("  5 - Rhea", 3, 2, "question", "answer");
        location[6] = new LocationScene("  6 - Prometheus", 5, 11, "question", "answer");
        location[7] = new LocationScene("  7 - Pandora", 20, 10, "question", "answer");
        location[8] = new LocationScene("  8 - Oberon", 3, 2, "question", "answer");
        location[9] = new LocationScene("  9 - Ariel", 20, 10, "question", "answer");
        location[10] = new LocationScene(" 10 - Wunda", 20, 4, "question", "answer");
        location[11] = new LocationScene(" 11 - Mab", 10, 5, "question", "answer");
        location[12] = new LocationScene(" 12 - Great Red Spot", 2, 5, "question", "answer");
        location[13] = new LocationScene(" 13 - Lo", 7, 8, "question", "answer");
        location[14] = new LocationScene(" 14 - Europa", 16, 12, "question", "answer");
        location[15] = new LocationScene(" 15 - Ganymede", 15, 3, "question", "answer");
        location[16] = new LocationScene(" 16 - Callisto", 18, 4, "question", "answer");
        location[17] = new LocationScene(" 17 - Arabia Terra", 15, 1, "question", "answer");
        location[18] = new LocationScene(" 18 - Planum Boreum", 21, 4, "question", "answer");
        location[19] = new LocationScene(" 19 - Amazonis Planitia", 15, 16, "question", "answer");
        location[20] = new LocationScene(" 20 - Syrtis", 2, 8, "question", "answer");
        location[21] = new LocationScene(" 21 - Tharsis", 9, 20, "question", "answer");
        location[22] = new LocationScene(" 22 - Phobos", 5, 10, "question", "answer");
        location[23] = new LocationScene(" 23 - Aitken", 2, 10, "question", "answer");
        location[24] = new LocationScene(" 24 - Montes Rook", 20, 10, "question", "answer");
        location[25] = new LocationScene(" 25 - Earth", 0, 0, "question", "answer");

        assignScenesToLocations(location);
        map.setLocations(location);
        return map;
    }
    
    //runtime errors
    public static void moveActorToNewLocation(Actor actor, LocationScene location) throws MapControlException{
        Map map = ReturnToRexburg1.getCurrentGame().getMap();
        int newLocation = -1;
        
        if (newLocation < 0 || newLocation >= map.getCurrentLocation()) {
            throw new MapControlException("Cannot move actor to new location because "
                    + "that location is not on the list.");
        }
    
    }
    
    /**
     * Return an array of unvisited locations. Pass in the current location index and the
     * list of all locations in the map.
     */
    public static LocationScene[] createPossibleLocationsList(int currentLocation, LocationScene[] allLocations){
        
        // Use an arraylist so we can start with nothing and build it up
        // as our loop progresses.
        ArrayList<LocationScene> possibleLocations = new ArrayList<>();

        // According to the test matrix description, this function returns
        // all locations that come after the current location in the map.
        // So our for loop can start at currentLocation + 1.
        for (int i=currentLocation+1; i < allLocations.length; i++){
            possibleLocations.add(allLocations[i]);
        }

        // ArrayList has a goofy way to convert itself to an Array
        return possibleLocations.toArray(new LocationScene[0]);
    }

    
    //static void moveActorsToStartingLocation(Map map) {
        //System.out.println("This moves the actors to the starting location.");
    //}

    private static void assignScenesToLocations(LocationScene[] location) {
        //System.out.println("This assigns the scenes to locations");
        //stub function until we figure out how to do this!
    /*
        location[0].setScene(new LocationScene1());
        location[1].setScene(new LocationScene2());
        location[2].setScene(new LocationScene3());
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
    }
            */ 
}
}
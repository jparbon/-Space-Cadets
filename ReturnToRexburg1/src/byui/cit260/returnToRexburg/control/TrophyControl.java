/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.Map;
import byui.cit260.returnToRexburg.view.TrophyRoomView;

/**
 *
 * @author Robbie
 */
public class TrophyControl {

    public static TrophyRoomView[] createTrophy() {
        //create the map
        Trophy trophy = new Trophy();
        TrophyRoomView [] trophyRoom = new TrophyRoomView[20];
        TrophyRoomView[] Trophy = null;

        Trophy[0] = new TrophyRoomView("Neptune", 0, 0, "question", "answer");
        Trophy[1] = new TrophyRoomView("Triton", 0, 0, "question", "answer");
        Trophy[2] = new TrophyRoomView("Proteus", 0, 0, "question", "answer");
        Trophy[3] = new TrophyRoomView("Titan", 0, 0, "question", "answer");
        Trophy[4] = new TrophyRoomView("F-Ring", 0, 0, "question", "answer");
        Trophy[5] = new TrophyRoomView("Rhea", 0, 0, "question", "answer");
        Trophy[6] = new TrophyRoomView("Prometheus", 0, 0, "question", "answer");
        Trophy[7] = new TrophyRoomView("Pandora", 0, 0, "question", "answer");
        Trophy[8] = new TrophyRoomView("Oberon", 0, 0, "question", "answer");
        Trophy[9] = new TrophyRoomView("Ariel", 0, 0, "question", "answer");
        Trophy[10] = new TrophyRoomView("Wunda", 0, 0, "question", "answer");
        Trophy[11] = new TrophyRoomView("Mab", 0, 0, "question", "answer");
        Trophy[12] = new TrophyRoomView("Great Red Spot", 0, 0, "question", "answer");
        Trophy[13] = new TrophyRoomView("Lo", 0, 0, "question", "answer");
        Trophy[14] = new TrophyRoomView("Europa", 0, 0, "question", "answer");
        Trophy[15] = new TrophyRoomView("Ganymede", 0, 0, "question", "answer");
        Trophy[16] = new TrophyRoomView("Callisto", 0, 0, "question", "answer");
        Trophy[17] = new TrophyRoomView("Arabia Terra", 0, 0, "question", "answer");
        Trophy[18] = new TrophyRoomView("Planum Boreum", 0, 0, "question", "answer");
        Trophy[19] = new TrophyRoomView("Amazonis Planitia", 0, 0, "question", "answer");
        Trophy[20] = new TrophyRoomView("Syrtis", 0, 0, "question", "answer");

        assignTrophyToTrophyRoomView(trophy);
        return Trophy;
    }
    
    //method finds the locations not yet visited by the player
    public static int[] createPossibleLocationsList() {
        int currentLocation = 0;
        
        int [] possibleLocations = {1,2,3}; //initialize the array
        int total = 0;
        //navigate a 1D array using a for each loop with index
        for (int location : possibleLocations){
            total += location;
            if (total > currentLocation){
               return possibleLocations;
            } 
        }    
        return possibleLocations;
        
    
    } 

    private static void assignTrophyToTrophyRoomView(Trophy trophy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Trophy {

        public Trophy() {
        }
    }
}
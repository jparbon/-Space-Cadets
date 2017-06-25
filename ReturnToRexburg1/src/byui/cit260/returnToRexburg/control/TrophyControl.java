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
 * @author Natali
 */
public class TrophyControl {

    public static TrophyRoomView[] createTrophy() {
        //create the map
        Trophy trophy = new Trophy();
        TrophyRoomView [] trophyRoom = new TrophyRoomView[20];
        TrophyRoomView[] Trophy = null;

        Trophy[0] = new TrophyRoomView("0",0,0,"", ""  );
        Trophy[1] = new TrophyRoomView("1",0,0, "", "" );
        Trophy[2] = new TrophyRoomView("2",0,0, "", "" );
        Trophy[3] = new TrophyRoomView("3",0,0,"", ""  );
        Trophy[4] = new TrophyRoomView("4",0,0,"", ""  );
        Trophy[5] = new TrophyRoomView("5",0,0,"", ""  );
        Trophy[6] = new TrophyRoomView("6",0,0,"", ""  );
        Trophy[7] = new TrophyRoomView("7",0,0,"", ""  );
        Trophy[8] = new TrophyRoomView("8",0,0,"", ""  );
        Trophy[9] = new TrophyRoomView("9",0,0,"", ""  );
        Trophy[10] = new TrophyRoomView("10",0,0,"", "" );
        Trophy[11] = new TrophyRoomView("11",0,0,"", "" );
        Trophy[12] = new TrophyRoomView("12",0,0,"", "" );
        Trophy[13] = new TrophyRoomView("13",0,0,"", "" );
        Trophy[14] = new TrophyRoomView("14",0,0,"", "" );
        Trophy[15] = new TrophyRoomView("15",0,0,"", "" );
        Trophy[16] = new TrophyRoomView("16",0,0,"", "" );
        Trophy[17] = new TrophyRoomView("17",0,0,"", "" );
        Trophy[18] = new TrophyRoomView("18",0,0,"", "" );
        Trophy[19] = new TrophyRoomView("19",0,0,"", "" );
        Trophy[20] = new TrophyRoomView("20",0,0,"", "" );

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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import byui.cit260.returnToRexburg.model.LocationScene;
import byui.cit260.returnToRexburg.model.Map;
import byui.cit260.returnToRexburg.model.Trophy;

import java.util.ArrayList;

/**
 *
 * @author Robbie
 * @author Natali
 */
public class TrophyControl {

    /**
     * Sort an array of trophies alphabetically by description.
     */
    public static void sortTrophyList(ArrayList<Trophy> trophies){
        for (int i=0; i < trophies.size()-1; i++){
            for (int j=i+1; j < trophies.size(); j++){
                if (trophies.get(i).getDescription().compareTo(trophies.get(j).getDescription()) > 0){
                    Trophy temp = trophies.get(i);
                    trophies.set(i, trophies.get(j));
                    trophies.set(j, temp);
                }
            }
        }
    }


    
}
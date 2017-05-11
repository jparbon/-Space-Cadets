/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntorexburg1;

import byui.cit260.returnToRexburg.model.Player;

/**
 *
 * @author nataliadams
 */
public class ReturnToRexburg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player(); 
        
        playerOne.setName("Jen Arbon");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robbie
 */
public class AlienDefenseControlTest {
    
    public AlienDefenseControlTest() {
    }

    /**
     * Test of calculateDefense method, of class AlienDefenseControl.
     */
    @Test
    public void testCalculateDefense() {
        System.out.println("calculateDefense");
        int defenseValue = 50;
        AlienDefenseControl instance = new AlienDefenseControl();
        int expResult = 50;
        int result = instance.calculateDefense(defenseValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

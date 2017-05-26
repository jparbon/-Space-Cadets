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
 * @author shear
 */
public class CombatControlTest {
    
    public CombatControlTest() {
    }

    /**
     * Test of calculateAccuracy method, of class CombatControl.
     */
    @Test
    public void testCalculateAccuracy() {
        System.out.println("calculateAccuracy");
        int userInput = 18;
        int baseAttackValue = 5;
        int bonusToAttack = 5;
        int defenseValue = 10;
        boolean expResult = true;
        boolean result = CombatControl.calculateAccuracy(userInput, baseAttackValue, bonusToAttack, defenseValue);
        assertEquals(expResult, result);
        //System.out.println("calculateAccuracy" + expResult + "/" + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    
}

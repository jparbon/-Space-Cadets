/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author Robbie
 */
public class EncounterAlienSceneTest {
    
    
    public EncounterAlienSceneTest() {
    }

    /**
     * Test of user input method, of class EncounterAlienScene.
     */
    
        @Test
    public void testtrue() {
        System.out.println("Test Case #1 True");
        int userInputValue = 50;
        EncounterAlienScene instance = new EncounterAlienScene();
        int expResult = 50;
        int result = instance.calculateAnswer(userInputValue);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testfalse() {
        System.out.println("Test Case #2 False");
        int userInputValue = 50;
        EncounterAlienScene instance = new EncounterAlienScene();
        int expResult = 0;
        int result = instance.calculateAnswer(userInputValue);
        assertEquals(expResult, result);
    }

    private static class EncounterAlienScene {

        public EncounterAlienScene() {
        }

        private int calculateAnswer(int userInputValue) {
            return 50;
        
        }
    }
}
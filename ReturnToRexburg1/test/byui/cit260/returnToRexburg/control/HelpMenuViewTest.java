/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;

import byui.cit260.returnToRexburg.view.HelpMenuView;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author nataliadams
 */
public class HelpMenuViewTest {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



    /**
     * Test of user input method, of class HelpMenuView.
     */
    
        @Test
    public void testTrueHelpMenu() {
        System.out.println("Test Case #1 True");
        int userInputValue = 50;
        HelpMenuView instance = new HelpMenuView();
        int expResult = 50;
        int result = instance.calculateAnswer(userInputValue);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testFalseHelpMenu() {
        System.out.println("Test Case #2 False");
        int userInputValue = 50;
        HelpMenuView instance = new HelpMenuView();
        int expResult = 0;
        int result = instance.calculateAnswer(userInputValue);
        assertEquals(expResult, result);
    }

    private static class HelpMenuView {

        public HelpMenuView() {
        }

        private int calculateAnswer(int userInputValue) {
            return 50;
        
        }
    }
}
    


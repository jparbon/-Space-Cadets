/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import byui.cit260.returnToRexburg.control.ResourceControl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author douglasarbon1
 */
public class ResourceControlTest {
    
    public ResourceControlTest() {
    }
    
    // Test of gatherFuel method, of class ResourceControl.
    
    @Test
    public int gatherFuel() {
        System.out.println("gatherFuel");
        //Test case #1
        System.out.println("/tTest case #1");
      
        //input values for test case 1 - valid user input - top of boundary
        int userInput = 10;
        int locationDepth = 10;
        int surfaceHardness = 5;
        int drillPower = 0;
        int fuelEarned = 0;
        
        int expectedResult = 0; //the expected amount of fuel earned
       
        //create instance of ResourceControl class
        ResourceControl instance = new ResourceControl();
        
        //call function to run test
        int result = instance.gatherFuel(userInput, locationDepth, surfaceHardness, drillPower, fuelEarned);
        
        //compare expected return value with actual return value
        assertEquals(expectedResult, result, 0);
        fail("The test case is a prototype.");
    
    
  
        //Test case #2
        System.out.println("/tTest case #2");
      
        //input values for test case 2 - valid user input - bottom of boundary
        userInput = 1;
        locationDepth = 10;
        surfaceHardness = 5;
        
        expectedResult = 0; //the expected amount of fuel earned
      
        
        //call function to run test
        result = instance.gatherFuel(userInput, locationDepth, surfaceHardness, drillPower, fuelEarned);
        
        //compare expected return value with actual return value
        assertEquals(expectedResult, result, 0);
        fail("The test case is a prototype.");
    
        
        
        //Test case #3
        System.out.println("/tTest case #3");
      
        //input values for test case 3 - invalid integer
        userInput = 0;
        locationDepth = 10;
        surfaceHardness = 5;
        
        expectedResult = 0; //the expected amount of fuel earned
      
        
        //call function to run test
        result = instance.gatherFuel(userInput, locationDepth, surfaceHardness, drillPower, fuelEarned);
        
        //compare expected return value with actual return value
        assertEquals(expectedResult, result, 0);
        fail("The test case is a prototype.");
        
        
        //Test case #4
        System.out.println("/tTest case #4");
      
        //input values for test case 4 - illegal character input
        userInput = 'z';
        locationDepth = 10;
        surfaceHardness = 5;
        
        expectedResult = 0; //the expected amount of fuel earned
      
        
        //call function to run test
        result = instance.gatherFuel(userInput, locationDepth, surfaceHardness, drillPower, fuelEarned);
        
        //compare expected return value with actual return value
        assertEquals(expectedResult, result, 0);
        fail("The test case is a prototype.");
    
        return fuelEarned;
    }
    
    
}

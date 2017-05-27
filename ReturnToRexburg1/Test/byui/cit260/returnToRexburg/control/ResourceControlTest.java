/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.control;


import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author douglasarbon1
 */
public class ResourceControlTest {
    
    public ResourceControlTest() {
    }

    
    /**
     * Test of gatherFuel method, of class ResourceControl.
     */
    @Test
    public void testGatherFuel() {
        System.out.println("gatherFuel");
        

        //Test Case #1 - this is a valid test
        System.out.println("Test Case #1");
        
        //input values for Test Case #1 
        int userInput = 10;
        int locationDepth = 10;
        int surfaceHardness = 5;
        int drillPower = 25;
        int fuelEarned = 15;
        int expResult = 0;
        
        //create instance of ResourceControl/ Random class
        ResourceControl instance = new ResourceControl();
        Random number = new Random(20); //create a new Random object and initialize with seed of 20
     
        //call function to run test
        instance.setRandom(number); //call the setRandom() method on the control class and pass it the Random object created in the test????
        int result = instance.gatherFuel(userInput, locationDepth, surfaceHardness, drillPower, fuelEarned); 
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result);
       
        
        //Test Case #2
        System.out.println("Test Case #2");
        
        //input values for Test Case #2
        userInput = 5;
        locationDepth = 10;
        surfaceHardness = 5;
        drillPower = 0;
        fuelEarned = 0;
        expResult = 0;
        
        //call function to run test
        instance.gatherFuel(userInput, locationDepth, surfaceHardness, drillPower, fuelEarned); 
        
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result); 
    
        //Test Case #3
        System.out.println("Test Case #3");
        
        //input values for Test Case #3
        userInput = 21;
        locationDepth = 10;
        surfaceHardness = 5;
        drillPower = 0;
        fuelEarned = 0;
        expResult = 0;
        
        //call function to run test
        instance.gatherFuel(userInput, locationDepth, surfaceHardness, drillPower, fuelEarned); 
      
        //compare expected return value with actual value returned
        assertEquals(expResult, result); 
    
        
        //Test Case #4
        System.out.println("Test Case #4");
        
        //input values for Test Case #4
        userInput = 0;
        locationDepth = 10;
        surfaceHardness = 5;
        drillPower = 0;
        fuelEarned = 0;
        expResult = 0;
        
        //call function to run test
        instance.gatherFuel(userInput, locationDepth, surfaceHardness, drillPower, fuelEarned); 
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result); 
      
        
        //Test Case #5
        System.out.println("Test Case #5");
        
        //input values for Test Case #5
        userInput = 1;
        locationDepth = 10;
        surfaceHardness = 5;
        drillPower = 0;
        fuelEarned = 0;
        expResult = 0;
        
        //call function to run test
        instance.gatherFuel(userInput, locationDepth, surfaceHardness, drillPower, fuelEarned); 
        
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result); 
    
        
        //Test Case #6
        System.out.println("Test Case #6");
        
        //input values for Test Case #6
        userInput = 'x';
        locationDepth = 10;
        surfaceHardness = 5;
        drillPower = 0;
        fuelEarned = 0;
        expResult = 0;
        
        //call function to run test
        instance.gatherFuel(userInput, locationDepth, surfaceHardness, drillPower, fuelEarned); 
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result); 
    
        
        
    }  
    
    
    
    
    
    
    
}

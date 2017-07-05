/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.returnToRexburg.view;

import java.io.PrintWriter;
import returntorexburg1.ReturnToRexburg1;

/**
 *
 * @author douglasarbon1
 */
public class ErrorView {
   
    private static final PrintWriter errorFile = ReturnToRexburg1.getOutFile();
    private static final PrintWriter logFile = ReturnToRexburg1.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "----------------------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n----------------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
    
}

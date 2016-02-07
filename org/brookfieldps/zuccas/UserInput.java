package org.brookfieldps.zuccas;

/**
 * Write a description of class APCS here.
 * 
 * @author S. Zucca 
 * @version 2016
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class UserInput
{
    private static final String STRING_INPUT_MESSAGE = "Input a String:";
    
    private static Scanner initScanner(String message){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(message + " ");    // don't expect the user to provide proper spacing
        return scanner;
    }
    
    public static String getString( String message ){
        Scanner scanner = initScanner(message);
        String data = scanner.nextLine();
        return data;
    }
    
    public static String getString(  ){
        return getString(STRING_INPUT_MESSAGE);
    }
    
    public static String getStringDialog(String message){
        return JOptionPane.showInputDialog(null, message );
    }
    
    public static String getStringDialog(){
        return getStringDialog(STRING_INPUT_MESSAGE);
        
    }
    
    public static int getInteger( String message ){
        Scanner scanner = initScanner(message);
        Integer n = null;
        
        while(n == null) {
            try {
                n = scanner.nextInt();
            } catch(Exception e) {
                System.out.print( "Unable to convert input to an integer. Try again. " );
                scanner.skip(".*"); // skip over all buffered input
            }
        }

        
        return (int) n;
    }
    
    public static int getInteger(  ){
        return getInteger("Input an integer:");
    }
    
    public static double getDouble( String message ){
        Scanner scanner = initScanner(message);
        Double d = null;
        
        while(d == null) {
            try {
                d = scanner.nextDouble();
            } catch(Exception e) {
                System.out.print( "Unable to convert input to a double. Try again. " );
                scanner.skip(".*"); // skip over all buffered input
            }
        }

        
        return (double) d;
    }
    
    public static double getDouble(  ){
        return getDouble("Input a double:");
    }
    
    
}

import org.brookfieldps.zuccas.UserInput;

/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Tester
{
    public static void testInput() {
        
        int x = UserInput.getIntegerDialog();
        
        System.out.println(x);
        System.out.println(x * 6);
        
        double y = UserInput.getDoubleDialog();
        
        System.out.println(y);
        System.out.println(y * 6);
        
        String s = UserInput.getStringDialog();
        System.out.println(s + s.length() );
    }
        
}

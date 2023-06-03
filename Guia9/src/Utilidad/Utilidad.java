package Utilidad;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author beniccio
 */
public class Utilidad {
    
    
    public static void clearScreen() throws InterruptedException{
    try{
        //System.out.println("Presione enter para continuar");
        //new java.util.Scanner(System.in).nextLine();
        
        Robot pressbot = new Robot();
        
        
        
        pressbot.keyPress(KeyEvent.VK_CONTROL);
        pressbot.keyPress(KeyEvent.VK_L);
        pressbot.keyRelease(KeyEvent.VK_CONTROL);
        pressbot.keyRelease(KeyEvent.VK_L);
//        System.out.println("pasara");
        Thread.sleep(10);
    }catch (AWTException ex){
        System.out.println(""+ex.getMessage());
    }

}
    
    
}
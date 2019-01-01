/*
 * OpenNotepad program 
 */
package multithreading;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Marian Platonov
 */
public class OpenNotepad {

    /**
     * @param args the command line arguments 
     * Launches three instances of Notepad
     */
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe");
            
            Process p1 = pb.start();
            System.out.println("First instance of Notepad was created at: " + new Date());
            TimeUnit.SECONDS.sleep(1);

            Process p2 = pb.start();
            System.out.println("Second instance of Notepad was created at: " + new Date());
            TimeUnit.SECONDS.sleep(1);

            Process p3 = pb.start();
            System.out.println("Third instance of Notepad was created at: " + new Date());

        } catch (IOException ex) {
            System.out.println("An IO exception is here!" + ex);
        } catch (InterruptedException ex) {
            System.out.println("An InterruptedException exception is here!" + ex);
        }
    }
}

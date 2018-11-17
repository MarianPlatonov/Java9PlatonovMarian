/*
 * App for opening Notepad
 */
package multiprocess;

import java.io.IOException;

/**
 *
 * @author Marian Platonov
 */
public class OpenMultipleProcesses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe");
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
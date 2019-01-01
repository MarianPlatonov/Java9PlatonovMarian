/*
 * OpenNotepadAndDestroy program 
 */
package multithreading;

import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author Marian Platonov
 */
public class OpenNotepadAndDestroy {

    /**
     * @param args the command line arguments 
     * Launches three instances of Notepad
     *
     */
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe");
            LinkedList<Process> list = new LinkedList();
            int numberOfInstances = 3;

            for (int i = 0; i < numberOfInstances; i++) {
                list.add(pb.start());
                System.out.println("Instance " + (i + 1) + " was opeened.");
                TimeUnit.SECONDS.sleep(1);
            }

            System.out.println("Wait 5 seconds before start closing all instances of Notepad one by one at every second.");
            TimeUnit.SECONDS.sleep(5);

            int i = 0;

            for (Process process : list) {
                process.destroy();
                i++;
                System.out.println("Instance with index: " + i + " was destroyed");              
                if (i < numberOfInstances) {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException ex) {
                        System.out.println("An InterruptedException exception is here!" + ex);
                    }
                }
            }

        } catch (IOException ex) {
            System.out.println("An IO exception is here!" + ex);
        } catch (InterruptedException ex) {
            System.out.println("An InterruptedException exception is here!" + ex);
        }
    }
}

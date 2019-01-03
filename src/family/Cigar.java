/*
 * Clasa tigara
 */
package family;

import static family.Colors.*;
/**
 *
 * @author Marian Platonov
 */
public class Cigar extends Thread {

    //Atribute
    private int length = 10;

    @Override
    public void run() {
        burn();
    }

    /**
     * Every second, the method sets the length of the cigarette by -1.
     */
    public void burn() {
        synchronized (this) {
            System.out.println(ANSI_RED + getName() + "Look, I started burning!");
        }
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Exceptions at sleep cigar: " + ex.getMessage());
            }
            length = length - 1;
        }
        System.out.println(ANSI_RED + getName() +  "I was burned.");
    }

}

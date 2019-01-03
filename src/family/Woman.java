/*
 * Clasa femeie
 */
package family;

import static family.Colors.*;

/**
 *
 * @author Marian Platonov
 */
public class Woman extends Thread {

    //Atribute
    private final Men men;
    private final Cigar cigar;
    private final Tv tv;
    private boolean awake;

    //Constructor
    public Woman(Men men, Cigar cigar, Tv tv) {
        this.cigar = cigar;
        this.tv = tv;
        this.men = men;
    }

    @Override
    public void run() {
        smoking();
        watchTheTv();
    }

    /**
     * How long does not run my favorite show I call fallsAsleep().
     */
    public synchronized void watchTheTv() {

        System.out.println(ANSI_GREEN + getName() + "I'm watching tv.");
        while (!tv.isFavoriteShow()) {
            fallsAsleep();
            break;
        }
    }

    /**
     * Changes the woman's awaking state with false and awaits notification of
     * the man. When it receives the notification, call the method wakesUp().
     */
    public void fallsAsleep() {
        System.out.println(ANSI_GREEN + getName() + "Because of the bad shows, I fall asleep.");
        awake = false;
        synchronized (men) {
            try {
                System.out.println(ANSI_GREEN + getName() + "I wait for the husband notification.");
                men.wait();
            } catch (InterruptedException ex) {
                System.out.println("Exceptions at wait fallsAsleep(): " + ex.getMessage());
            }
            System.out.println(ANSI_GREEN + getName() + "I received my husband's notification.");
            wakesUp();
        }
    }

    /**
     * Change the woman's waking state to true and wait for the cigarette thread
     * to finish.
     */
    public synchronized void wakesUp() {
        System.out.println(ANSI_GREEN + getName() + "I'm awake.");
        awake = true;
        while (tv.isFavoriteShow()) {
            System.out.println(ANSI_GREEN + getName() + "I'm watching my favorite show.");
            break;
        }
        try {
            cigar.join();
        } catch (InterruptedException ex) {
            System.out.println("Exception at cigar join: " + ex.getMessage());
        }
        System.out.println(ANSI_GREEN + getName() + "Throw the cigar.");
    }

    /**
     * The method launches the cigarette thread and rename the thread.
     */
    public synchronized void smoking() {
        System.out.println(ANSI_GREEN + getName() + "I'm smoking a cigar.");
        cigar.setName("Thread cigar: ");
        cigar.start();
        System.out.println(ANSI_GREEN + getName() + "When the cigarette is consumed I throw it.");
    }
}
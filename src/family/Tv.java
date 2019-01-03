/*
 * Clasa televizor
 */
package family;

import static family.Colors.*;

/**
 *
 * @author Marian Platonov
 */
public class Tv extends Thread {

    //Attributes
    private boolean favoriteShow;

    //getters and setters
    public boolean isFavoriteShow() {
        return favoriteShow;
    }

    @Override
    public void run() {
        runningBadShows();
    }

    /**
     * The method sets the Tv attribute with false and after 8 seconds
 the method calls the runningFavoriteShow() method.
     */
    public void runningBadShows() {
        synchronized (this) {
            System.out.println(ANSI_BLUE + getName() + "I run boring shows.");
            favoriteShow = false;
        }
        try {
            Thread.sleep(8000);
        } catch (InterruptedException ex) {
            System.out.println("Exceptions at sleep runningBadShows() : " + ex.getMessage());
        }
        runningFavoriteShow();
    }

    /**
     * The method sets the Tv attribute with true and sends a
 notification.
     */
    public synchronized void runningFavoriteShow() {
        System.out.println(ANSI_BLUE + getName() + "I run the woman's favorite show.");
        favoriteShow = true;
        System.out.println(ANSI_BLUE + getName() + "I'm sending notice that I started to run the woman's favorite show.");
        notify();
    }
}
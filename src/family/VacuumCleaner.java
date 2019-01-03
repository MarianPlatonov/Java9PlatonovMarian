/*
 * Clasa aspirator
 */
package family;

import static family.Colors.*;

/**
 *
 * @author Marian Platonov
 */
public class VacuumCleaner extends Thread {

    //Attributes
    private final Room room;
    private boolean on;

    //Constructor
    public VacuumCleaner(Room room) {
        this.room = room;
    }

    /**
     * Returns if the vacuum cleaner is on.
     *
     * @return on
     */
    public boolean isOn() {
        return on;
    }

    @Override
    public void run() {
        isStarting();
    }

    /**
     * The method starts the vacuum cleaner and call aspire().
     */
    public synchronized void isStarting() {
        System.out.println(ANSI_CYAN + getName() + "I started.");
        on = true;
        apire();
    }

    /**
     * The method stops the vacuum cleaner.
     */
    public synchronized void isStops() {
        System.out.println(ANSI_CYAN + getName() + "I stopped.");
        on = false;
    }

    /**
     * The method reduces the dirty surface of the room by 1mp / s and finally
     * call isStops().
     */
    public void apire() {
        synchronized (room) {
            System.out.println(ANSI_CYAN + getName() + "I clean the mess.");
        }
        while (room.getDirtySurface() > 0) {
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ANSI_CYAN + getName() + "Exceptions at sleep aspire: " + ex.getMessage());
            }
            room.setDirtySurface(room.getDirtySurface() - 1);
        }
        synchronized (room) {
            System.out.println(ANSI_CYAN + getName() + "Now the room is clean.");
            isStops();
            on = false;
        }
    }

}
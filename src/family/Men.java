/*
 * Clasa Men
 */
package family;

import static family.Colors.*;

/**
 *
 * @author Marian Platonov
 */
public class Men extends Thread {

    //Atribute
    private final VacuumCleaner vacuumCleaner;
    private final Tv tv;

    //Constructor
    public Men(VacuumCleaner vacuumCleaner, Tv tv) {
        this.vacuumCleaner = vacuumCleaner;
        this.tv = tv;
    }

    @Override
    public void run() {

        aspire();
        watchTheTv();

    }

    /**
     * The method starts the vacuumCleaner thread and sets another name.
     */
    public void aspire() {
        synchronized (tv) {
            System.out.println(ANSI_PURPLE + getName() + "I start the vacuum cleaner and start aspiring.");
            vacuumCleaner.setName("Thread vacuumCleaner: ");
            vacuumCleaner.start();
        }

    }

    /**
     * When the method see the tv notification, call wakeupWomen() .
     */
    public void watchTheTv() {
        synchronized (tv) {
            System.out.println(ANSI_PURPLE + getName() + "I'm waiting favorite woman show to start.");
            try {
                tv.wait();
            } catch (InterruptedException ex) {
                System.out.println("Exception at tv wait: " + ex.getMessage());
            }
            System.out.println(ANSI_PURPLE + getName() + "I saw the TV notification.");
            wakeupWomen();
        }
    }

    /**
     * The method send a notification.
     */
    public synchronized void wakeupWomen() {
        System.out.println(ANSI_PURPLE + getName() + "I'm sending notification.");
        System.out.println(ANSI_PURPLE + getName() + "My dear, your favorite show started ... Wake up please!");
        notify();
    }
}

/*
 * Clasa camera
 */
package family;

/**
 *
 * @author Marian Platonov
 */
public class Room {

    //Attributs
    private boolean stateOfCleanliness = false;
    private int dirtySurface = 18;

    //getters and setters
    public int getDirtySurface() {
        return dirtySurface;
    }

    public void setDirtySurface(int dirtySurface) {
        this.dirtySurface = dirtySurface;
    }

    public boolean isStateOfCleanliness() {
        return stateOfCleanliness;
    }

    public void setStateOfCleanliness(boolean stateOfCleanliness) {
        this.stateOfCleanliness = stateOfCleanliness;
    }

}
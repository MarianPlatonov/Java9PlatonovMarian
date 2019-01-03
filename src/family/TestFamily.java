/*
 * Happy family program
 */
package family;

/**
 *
 * @author Marian Platonov
 */
public class TestFamily {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Room room = new Room();
        VacuumCleaner vacuumCleaner = new VacuumCleaner(room);
        Cigar cigar = new Cigar();
        Tv tv = new Tv();
        Men men = new Men(vacuumCleaner, tv);
        Woman woman = new Woman(men, cigar, tv);    
        
        tv.setName("Thread tv: ");
        woman.setName("Thread woman: ");
        men.setName("Thread men: ");
 
        tv.start();
        woman.start();
        men.start();   
        
        
    } 
}
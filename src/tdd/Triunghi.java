/*
 * Class Triunghi
 */
package tdd;

/**
 *
 * @author gheor
 */
public class Triunghi extends Plana{
    
    public static final String TRIANGLE_BEGIN = "TRIANGLE:";
    public static final String TRIANGLE = "with three straight sides and three angles.";
    
    @Override
    public String getDefinition(){
        String definition = TRIANGLE_BEGIN + super.getDefinition()+TRIANGLE;
        return definition;
    }
    
}

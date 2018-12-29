/*
 * Class Plana
 */
package tdd;

/**
 *
 * @author gheor
 */
public class Plana extends FiguraGeometrica{
    
    public static final String PLANA = " plane";
    
    /**
     *
     * @return "a plane figure"
     */
    @Override
    public String getDefinition(){
        String definition = super.O + PLANA + super.FIGURA; 
        return definition;
    }
    
}

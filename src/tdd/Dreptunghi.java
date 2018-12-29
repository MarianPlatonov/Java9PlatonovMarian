/*
 * Class Rectangle
 */
package tdd;

/**
 *
 * @author gheor
 */
public class Dreptunghi extends PatrulaterDreptunghic{
    

    public static final String DREPTUNGHI= " especially one with unequal adjacent sides, in contrast to a square.";
    public static final String DREPTUNGHI_BEGIN= "RECTANGLE:";

    
    @Override
    public String getDefinition(){
        String definition = DREPTUNGHI_BEGIN+super.getDefinition()+DREPTUNGHI;
        return definition;
        
    }
    
}

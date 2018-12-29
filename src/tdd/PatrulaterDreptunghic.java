/*
 * Patrulater dreptunghic
 */
package tdd;

/**
 *
 * @author gheor
 */
public class PatrulaterDreptunghic extends Patrulater{
    
    public static final String DREPTUNGHIC = " and four right angles.";
    
    @Override
    public String getDefinition(){
    
        String definition = super.getDefinition() + DREPTUNGHIC;
        return definition;
    }
    
    
}

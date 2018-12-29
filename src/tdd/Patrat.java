/*
 * Class Rectangle
 */
package tdd;

/**
 *
 * @author gheor
 */
public class Patrat extends PatrulaterDreptunghic{
    
    public static final String PATRAT= " equal ";
    public static final String PATRAT_BEGIN= "SQUARE:";
    
    public String getDefinition(){
    
        String definition = PATRAT_BEGIN+super.getDefinition().substring(0, 25)+PATRAT+super.getDefinition().substring(26);
        return definition;
        //return "";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsandannotations;

/**
 *
 * @author Marian Platonov
 */
public interface House {
 
    /*
    *@Deprecated use of open is not recommended. We sugst you to use
    *openFrontDoor or openBackDoor instead
     */
    @Deprecated
    void open();

    void openFrontDoor();

    void openBackDoor();
}

/*
Answer: @Deprecated annotation indicates that the marked element is deprecated
and should no longer be used. Also it must be specified what method to use instead.
 */

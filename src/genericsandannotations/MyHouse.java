/*
 * Class MyHouse implements Interface House
 */
package genericsandannotations;

/**
 *
 * @author Marian Platonov
 */
public class MyHouse implements House {

    @Override
    public void open() {

    }

    @Override
    public void openFrontDoor() {

    }

    @Override
    public void openBackDoor() {

    }

}

/*
Answer : In this case my compiler don’t complain, but on java documentation
I see it is possible to complain that open has been deprecated in interface.
In this situation we have two possibilities:
First: We can deprecate the implementation of open…
public class MyHouse implements House {
//In this case documentation are inherited from interface.
@Deprecated
    public void open() {}
    public void openFrontDoor() {}
    public void openBackDoor() {}
}
Second: Exist a possibility to suppress the warning.
public class MyHouse implements House {
@SuppressWarnings("deprecation")
    public void open() {}
    public void openFrontDoor() {}
    public void openBackDoor() {}
}
*/

/*
 * Singleton class
 */
package genericsandannotations;

/**
 *
 * @author Marian Platonov
* @param <T> generic parameter T
 */
public class Singleton<T> {
    /*
    public static T getInstance() {
        if (instance == null)
        instance = new Singleton<T>();
        return instance;
    }
    private static T instance = null;
     */
}
/*
Answer: The Singletone class will not compile because:
-Cannot Declare Static Fields Whose Types are Type Parameters!
-Non-static type variable T cannot be referenced from a static context.
*/
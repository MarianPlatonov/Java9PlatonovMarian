/*
 * Class PrintClass
 */
package genericsandannotations;

import java.util.List;

/**
 *
 * @author Marian Platonov
 */
public class PairClass {

    public static void print(List<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
//Answer: After import java.util.List the method compile.

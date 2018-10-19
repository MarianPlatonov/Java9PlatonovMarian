/*
 * Class Node
 */
package genericsandannotations;

/**
 *
 * @author Marian Platonov
 */
class Node<T> implements Comparable<T> {

    @Override
    public int compareTo(T obj) {
        return 0;
        /* ... */ }
// ...

    public static void main(String[] args) {
        Node<String> node = new Node<>();
        Comparable<String> comp = node;
    }
}

//Answer:  The code will compile.
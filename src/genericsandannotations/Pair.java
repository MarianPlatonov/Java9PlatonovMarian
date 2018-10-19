/*
 * Class Pair
 */
package genericsandannotations;

/**
 *
 * @author Marian Platonov
 * @param <K> K type parameter
 * @param <V> V type parameter
 */
public class Pair<K, V> {

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;

    }
    // public K getKey(); { return key; }
    // public V getValue(); { return value; }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
    private K key;
    private V value;
}
/*
Answer: Because we dont have bounds specified, the compiler will replace all
(K,V) type parameters with Object type parameter.
public class Pair {
public Pair(Object key, Object value) {
this.key = key;
this.value = value;
}
public Object getKey() { return key; }
public Object getValue() { return value; }
public void setKey(Object key)     { this.key = key; }
public void setValue(Object value) { this.value = value; }
private Object key;
private Object value;
}
*/
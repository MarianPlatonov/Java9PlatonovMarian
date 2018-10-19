/*
 * Class RandomClasses
 */
package genericsandannotations;

public class RandomClasses {

    class Shape {
        /* ... */ }

    class Circle extends Shape {
        /* ... */ }

    class Rectangle extends Shape {
        /* ... */ }

    class Node<T> {
        /* ... */ }

    Node<Circle> nc = new Node<>();
//Node<Shape>  ns = nc;
}

/*
Answer: Te code will not compile because Node<Circle> are not subtypes of Node<Shape>.
Undefined inheritance between Node<Circle> and Node<Shape>!
 */

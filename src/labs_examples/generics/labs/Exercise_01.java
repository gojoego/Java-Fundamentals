package labs_examples.generics.labs;

import com.sun.tools.javah.Gen;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with:
 *          at least two instance variables,
 *          a constructor,
 *          and getter and setter methods.
 *      2.) Create a few objects of your
 *          generic class with different
 *          data types to demonstrate it's
 *          dynamic usage.
 */

class Exercise_01{

    public static void main(String[] args) {
        Generic<String, Integer> joe = new Generic("hello", new Integer(7));
        System.out.println(joe.getObject1());
        System.out.println(joe.getObject2());
    }

}

class Generic<J,G> {

    J object1;
    G object2;

    public Generic(J object1, G object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public J getObject1() {
        return object1;
    }

    public void setObject1(J object1) {
        this.object1 = object1;
    }

    public G getObject2() {
        return object2;
    }

    public void setObject2(G object2) {
        this.object2 = object2;
    }
}
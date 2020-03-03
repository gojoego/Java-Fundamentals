package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables,
 *      a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different
 *      data types to demonstrate it's
 *          dynamic usage.
 */

class Exercise_01{}

class Generic<J> {
    J object;


    public Generic(J object) {
        this.object = object;
    }

    // Return ob.
    J getobject() {
        return object;
    }

    // Show type of T.
    void showType() {
        System.out.println("Type of J is " +
                object.getClass().getName());
    }
}

// Demonstrate the generic class.
class GenericDemo {
    public static void main(String args[]) {

        labs_examples.generics.labs.Generic<Integer> iOb;

        // Create a Gen<Integer> object and assign its
        // reference to iOb.  Notice the use of autoboxing
        // to encapsulate the value 88 within an Integer object.

        iOb = new labs_examples.generics.labs.Generic<Integer>(100);

        // Show the type of data used by iOb.
        iOb.showType();

        // Get the value in iOb. Notice that
        // no cast is needed.
        int v = iOb.getobject();
        System.out.println("value: " + v);

        System.out.println();

        // Create a Gen object for Strings.
        labs_examples.generics.labs.Generic<String> strOb = new labs_examples.generics.labs.Generic<String>("Generics Test");

        // Show the type of data used by strOb.
        strOb.showType();

        // Get the value of strOb. Again, notice
        // that no cast is needed.
        String str = strOb.getobject();
        System.out.println("value: " + str);
    }
}
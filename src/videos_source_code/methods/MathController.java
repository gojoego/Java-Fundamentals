package videos_source_code.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class MathController {

    // main method
    public static void main(String[] args) {

        // declaring two ints
        int a = 2;
        int b = 3;

        // declaring two doubles
        double x = 12.34;
        double y = 45.67;

        // NOTE: when declaring a variable and setting it to a
        // return from a method, the data types must match.

        int c = CustomMath.multiply(a, b);
        // Here we are calling the multiply() method and
        // declaring it as an integer. The method takes on
        // two parameters (2 and 3 in this case)
        // which have been declared and assigned
        // and returns a value of 6. We don't need to say
        // a = 2 and b = 3 in the parameters because they
        // are already defined
        // CRITICAL: must define data type

        double z = CustomMath.multiply(x, y);
        // Here, we declare a variable z as a double data type
        // and set it equal to the return from calling the multiply() method


        int d = CustomMath.divide(4, 2);
        // calling this method from the CustomMath class
        // if you are calling a method from WITHIN the same
        // class, it isn't necessary to denote the object
        // or class from which you are calling this method
        // dot notation

        System.out.println(c);
        System.out.println(z);

    }

}

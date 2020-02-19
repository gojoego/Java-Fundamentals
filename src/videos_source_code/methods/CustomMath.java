package videos_source_code.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class CustomMath {

    public static int multiply(int a, int b){
        return a * b;
    }
    // This method is public, static, returns an integer and is called
    // "multiply." The parameters will take an int a and int b and multiply them.

    public static double multiply(double a, double b){
        return a * b;
    }
    // in IntelliJ, you can hover over method and CMD click and
    // it'll take you to class or object where method lives
    // method signature: what declares and defines a method
    // overloading multiply method
    // must have different arguments or parameters
    // signature is the same but parameters are different


    public static int divide(int a, int b){
        return a / b;
    }

    // if method is non-static and you need to call from this method,
    // you can create an object of that class
    // use object name then method name

    // use name of class for static
    // use object for non static
    // (when calling methods)

}


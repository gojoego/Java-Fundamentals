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

        //
        double x = 12.34;
        double y = 45.67;

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

        int d = CustomMath.divide(4, 2);

        System.out.println(x);
        System.out.println(z);

    }

}

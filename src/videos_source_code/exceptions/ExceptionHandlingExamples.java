package videos_source_code.exceptions;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class ExceptionHandlingExamples {

    public static void main(String[] args) {

        int[] nums = {34, 65, 78, 0};

        SomeClass.someMethod(nums);
        // you will get ArrayIndexOutOfBoundsException error if you
        // try to access index that doesn't exist
        // try/catch

        System.out.println("super complete");
    }
}

// exception hierarchy
// inheritance hierarchy
// demonstrates that ArrayIndexOutOfBoundsException
// is child class of Exception class
// subclasses of Exception cannot be before subclass exceptions
// must start from lowest to highest on hierarchy
//

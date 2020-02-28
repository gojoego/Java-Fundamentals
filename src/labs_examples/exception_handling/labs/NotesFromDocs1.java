package labs_examples.exception_handling.labs;

public class NotesFromDocs1 {

    public static void main(String[] args){
        try {
            // we can see that the divide() method below "throws" an exception (potentially - based on input)
            // so we need to use a try catch here to catch the exception that may be thrown
            int x = divide(4, 0);
        } catch(ArithmeticException exc){
            System.out.println("an exception was thrown from the divide() method.");
        }
        System.out.println("all done");
    }


    // the divide() method will throw any exception that occurs back to the method
// that called it - in this case that's the main() method above
    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }
}

/*
If the method divide generates an ArithmeticException exception,
it will throw it back to the method that called it, in the case the main() method.
If the method that called divide does not handle the exception, it will be thrown
to the JVM, thus terminating the program with a disgraceful exception.
 */

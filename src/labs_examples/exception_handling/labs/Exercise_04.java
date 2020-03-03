package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 * <p>
 * Demonstrate a nested try/catch.
 */

public class Exercise_04 {

    public static void main(String args[]) {

        int j = 2;
        int[] superTuesday = {415, 228, 110, 99, 91, 75, 67, 64, 52, 37, 31, 29, 24, 16};

        try { // outer try
            for (int i = 0; i < superTuesday.length; i++) {
                try {
                    System.out.println(superTuesday[j]);

                    System.out.println(superTuesday[j] / j);
                } catch (ArithmeticException exc) {
                    // catch the exception
                    System.out.println("Can't divide by Zero!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("No matching element found.");
        }
    }
}
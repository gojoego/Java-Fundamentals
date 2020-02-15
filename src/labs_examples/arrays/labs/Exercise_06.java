package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 *
 */
import java.util.Arrays;

public class Exercise_06 {

    public static void main(String[] args) {

        // create a simple array
        int[] arrayToReverse = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // print this array out for comparison
        System.out.println("array before reverse: " + Arrays.toString(arrayToReverse));

        // reverse array using one extra variable
        // use for loop
        for (int outer = 0; outer < arrayToReverse.length/2; outer++){
            int count = arrayToReverse[outer];
            arrayToReverse[outer] = arrayToReverse[arrayToReverse.length - outer - 1];
            arrayToReverse[arrayToReverse.length - outer - 1] = count;

        }
        System.out.println("array after reverse: " + Arrays.toString(arrayToReverse));
    }
}

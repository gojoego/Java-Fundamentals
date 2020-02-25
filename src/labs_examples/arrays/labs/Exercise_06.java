package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse the nums[] array in place using only one extra variable. Please note,
 *      you cannot use a second array and you cannot instantiate any new variables in the class below.
 *
 *      Hint: you have two index
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

    /* public static void main(String[] args){
        int[] nums = {45, 87, 62, 99, 1, 42, 12};

        int temp;

        // Question: in the for loop below, why do we divide "nums.length" by 2?
        for(int i = 0; i < nums.length / 2; i++){
            // swap elements at indexes in array
            // you have two indices readily available for you to use "i" (which increments) and "nums.length"
            // you've also got this "temp" variable you can use to hold a value temporarily
        }
        System.out.print("Contents of array after for loop - ");
        // print each element of the array to verify reverse order
        for(int i : nums){
            System.out.print(i + " ");
        }

     */
    }




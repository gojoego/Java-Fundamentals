package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here

        // create scanner
        // Scanner: class in java.util package used for obtaining input
        // of primitive types like int, double, etc
        Scanner scanner = new Scanner(System.in);

        // prompt user input for number from 1 to 10
        System.out.println("Enter a number from 1 to 10: ");

        // assign input to variable as userInput
        int userInput = scanner.nextInt();

        // print the corresponding index to user input
        System.out.println("corresponding index value: " + array[userInput]);


    }
}
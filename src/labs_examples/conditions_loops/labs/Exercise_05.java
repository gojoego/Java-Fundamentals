package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter first number
        System.out.println("Enter lower number: ");

        // assign input to variable as lower number
        double lower = scanner.nextDouble();

        // prompt user to enter second number
        System.out.println("Enter higher number: ");

        // assign input to variable as upper number
        double upper = scanner.nextDouble();

        int sum = 0;
        // for loop calculating sum of numbers from lower bound to upper bound
        for(double count = lower; count <= upper; count += 1){
            sum += count;
        }

        System.out.println();

        // equation calculating average of two numbers
        // average = lower + upper / 2

        double avg = (upper + lower) / 2;

        // sum
        System.out.println("sum: " + sum);
        System.out.println("average: " + avg);


    }

}

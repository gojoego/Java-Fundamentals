package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 1: Even or Odd
 *
 *      Write a program that gets a number between 1 and 1,000,000
 *      from the user and determines whether it is odd
 *      or even using an if statement. Print the result.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user
        System.out.print("Enter a number between 1 and 1,000,000,000 to determine whether it is odd or even: ");

        // assign input to variable as int
        int number = scanner.nextInt();
        // Here we are assigning

        // write completed code here
        if(number % 2 == 0) {
            System.out.println("The given number " + number + " is Even ");
            // IF a number divided by 2 returns a modulus of 0, it means
            // that the number was divided by 2 and there was no remainder.
            // This means that this number is an even number. Only even numbers return
            // a modulus of zero. By reason, everything else is odd.
        } else {
            System.out.println("The given number " + number + " is Odd ");
            // For all the other numbers with modulus values of 1, we print the above statement
            // this is an if-else statement
        }
    }
}

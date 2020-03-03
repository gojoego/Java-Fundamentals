package labs_examples.exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 5:
 * <p>
 * Demonstrate how to throw an exception.
 */

public class Exercise_05 {

    public static void main(String[] args) {

        System.out.println("Welcome to the 2020 Democratic Primary race!");

        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user
        System.out.print("How many delegates did Bernie Sanders win?");

        // assign input to variable as int
        int delegates = scanner.nextInt();

        enoughDelegates(delegates);

        System.out.println("Thank you for voting.");

    }


    static void enoughDelegates(int delegates) {

        if (delegates < 1991) {
            throw new ArithmeticException("Bernie Sanders does not have enough " +
                    "delegates to win the Democratic nomination.");
        } else {
            System.out.println("We now have a brokered election which will most " +
                    "likely result in a loss for the Democrats if Bernie is refused " +
                    "after winning the most votes.");
        }

    }

}


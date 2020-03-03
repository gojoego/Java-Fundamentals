package labs_examples.exception_handling.labs;


import java.io.IOException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it
 *      in another method.
 *
 */

public class Exercise_06 {


    static void enoughDelegates() throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many delegates did Bernie Sanders win?");

        int delegates = scanner.nextInt();

        System.out.println("Thank you for voting.");
        if (delegates < 1991) {
            System.out.println("Bernie wins.");
        } else {
            System.out.println("We now have a brokered election which will most " +
                    "likely result in a loss for the Democrats if Bernie is refused " +
                    "after winning the most votes.");
        }

    }
    public static void main(String[] args) {

        System.out.println("Welcome to the 2020 Democratic Primary race!");

        try {
            enoughDelegates();
        }catch (IOException exc){
            System.out.println("Bernie Sanders does not have enough " +
                    "delegates to win the Democratic nomination.");
        }

    }
}


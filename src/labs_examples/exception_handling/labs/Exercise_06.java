package labs_examples.exception_handling.labs;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it
 *      in another method.
 *
 */

public class Exercise_06 {


    static void enoughDelegates() throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many delegates did Bernie Sanders win?");

        int delegates = scanner.nextInt();

        System.out.println("Thank you for voting.");
        if (delegates > 1991) {
            System.out.println("Bernie wins.");
        } else {
            System.out.println("Bernie loses.");
        }

    }
    public static void main(String[] args) {

        System.out.println("Welcome to the 2020 Democratic Primary race!");

        try {
            enoughDelegates();
        }catch (InputMismatchException exc){
            System.out.println("You did not input a number.");
        }

    }
}


package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {

        // create a for loop
        for (int i = 1; i <= 100; i++){

            if (i > 60  && i < 90) {
                continue;
            }
            System.out.println(i);
        }
    }
}

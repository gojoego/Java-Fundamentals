package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {

        // for loop
        // count starts at 1, increments by 1 until less than or equal to 100
        for (int i = 1; i <= 100; i++){

            // continue statement
            // using an if statement
            // if 'i' is more than 60
            // AND 'i' is less than 90
            // the code instructs to print out 'i'
            // meaning 1 to 60 are printed
            // then 90 to 100 are printed
            // 61 to 89 are NOT printed 
            if (i > 60  && i < 90) {
                continue;
            }
            System.out.println(i);
        }
    }
}

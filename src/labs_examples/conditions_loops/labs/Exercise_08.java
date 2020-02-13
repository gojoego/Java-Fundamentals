package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {

    public static void main(String[] args) {

        // declare x as an int starting at 1000
        int x = 1000;

        do{
            // print out x
            System.out.println(x);

            // calculate x - 3 in the loop
            x -= 3;

          // make sure this only runs to 1
        } while(x > 0);

    }

}

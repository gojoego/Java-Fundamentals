package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // while loop will run loop until boolean condition in ()
        // is found to be false
        // while loop format: while(true){code}

        // declare 100 as an int
        int highNum = 100;
        // declare 1 as an int
        int lowNum = 1;
        // declare sum as an int
        int sum = 0;

        while(lowNum <= highNum){
            // sum = sum + lowNum
            sum += lowNum;
            // lowNum = lowNum + 1
            lowNum++;
        }
        // print out sum
        System.out.println(sum);
    }
}

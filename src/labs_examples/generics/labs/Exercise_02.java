package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList
 *      of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

public class Exercise_02{

}

class SumArray{

    public <T> void printArray(T[] array){
        for (T element: array){
            // add code for sum of array values
            System.out.println(element);
        }
    }

}
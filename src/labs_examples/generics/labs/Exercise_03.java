package labs_examples.generics.labs;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments.
 *         This generic method should only accept arguments which are
 *         subclasses of Number.
 *         -extends Number
 *         The generic method must return the sum
 *         (as a double) of whatever two numbers were passed in
 *         regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a
 *         collection of Strings that are palindromes
 *
 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {


    }



}

class numberOne {

    public <T extends Number> double sum (T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

}

class numberTwo {

    public <T> boolean palindrome(T[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1){
            if (word[i1] != word[i2]){
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

}

class numberThree {}

class numberFour {}

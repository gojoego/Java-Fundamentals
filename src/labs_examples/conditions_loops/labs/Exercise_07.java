package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt user to enter word
        System.out.println("enter word: ");

        String inputtedWord = scanner.next();
        final String VOWELS = "aeiou";
        int currentIdx = 0;

        while(currentIdx < inputtedWord.length()){

            char currentLetter = inputtedWord.charAt(currentIdx);

            if (VOWELS.indexOf(currentLetter) >= 0){

                System.out.println("first vowel in " + inputtedWord + " is " + currentLetter);
                break;
            }
            currentIdx++;
        }
    }
}

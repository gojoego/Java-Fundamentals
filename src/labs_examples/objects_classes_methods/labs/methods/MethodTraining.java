package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {

    public static void main(String[] args) {

        int largest = largestFour(1, 2, 3, 4);

        System.out.println("The largest of the given numbers is " + largest);

        int numberConsonants = countConsonants("Turducken");

        System.out.println("The number of consonants is " + numberConsonants);

        SlashFigure(20);

        checkPrime(5);

        highLow(1,2,3,4);

    }

    // 3. creating a method that will return the largest of 4 numbers
    // (all of which are passed in as arguments or parameters
    public static int largestFour(int a, int b, int c, int d) {
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;
        return max;
    }

    // 4. write method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String stringToCount) {

        String line = stringToCount;
        int vowels = 0, consonants = 0;

        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            }
        }
        return consonants;
    }
    // 5. method that will print some kind of ascii art to the console
    public static void SlashFigure(int size) {
        System.out.println();
        int n = 6;
        int i, j, k, l;
        for(i=0;i<n;i++) {
            for(k=0;k<i;k++) {
                System.out.print("\\\\");
            }
            for(l=0;l<2*n-1-2*i;l++) {
                System.out.print("!!");
            }
            for(k=0;k<i;k++) {
                System.out.print("\\\\");
            }
            System.out.println();
        }
    }

    // 6. method that will determine whether or not a number is prime
    public static void checkPrime(int num) {

        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {

            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    // 7. method that will return a small array containing the highest and lowest numbers
    // in a given numeric array, which is passed in as an argument

    public static void highLow (int a, int b, int c, int d){

        int[] array = new int[2];
        array[0] = a;
        array[1] = d;

        System.out.println("[" + array[0] + "][" + array[1] + "]");

        // array at index 0 needs to equal first number
        // array at index [last] needs to equal last number
    }
    

    // initialize an empty ArrayList of type String
    // ArrayList<String> words = new ArrayList();

    // 9) Write a method that will reverse an array in place use
    // only one extra temp variable. For this exercise you cannot
    //instantiate a second array. You must reverse the array in
    // place using only one extra temp variable. Hint: this
    // variable is used to temporarily store
    // individual values in the array

    public static void arrayReverser(int a, int b, int c, int d, int e) {

        // create a simple array
        int[] arrayToReverse = {a, b, c, d, e};

        // print this array out for comparison
        System.out.println("array before reverse: " + Arrays.toString(arrayToReverse));

        // reverse array using one extra variable
        // use for loop
        for (int outer = 0; outer < arrayToReverse.length/2; outer++){
            int count = arrayToReverse[outer];
            arrayToReverse[outer] = arrayToReverse[arrayToReverse.length - outer - 1];
            arrayToReverse[arrayToReverse.length - outer - 1] = count;

        }
        System.out.println("array after reverse: " + Arrays.toString(arrayToReverse));
    }


}


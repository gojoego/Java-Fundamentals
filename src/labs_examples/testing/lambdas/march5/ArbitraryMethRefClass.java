package labs_examples.testing.lambdas.march5;

import java.util.Arrays;

public class ArbitraryMethRefClass {

    public static void main(String[] args) {
        // string array of names
        String[] stringArray = {"Steve", "Rick", "Ryan", "Cameron", "Lucy", "Kim", "Jon"};

        // calling sort method in Arrays class and filling in the parameters
        // from stringArray
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}

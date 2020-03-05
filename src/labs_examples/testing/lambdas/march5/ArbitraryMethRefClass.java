package labs_examples.testing.lambdas.march5;

import java.util.Arrays;

public class ArbitraryMethRefClass {

    public void main(String[] args) {
        // string array of names
        String[] stringArray = {"Steve", "Rick", "Ryan", "Cameron", "Lucy", "Kim", "Jon"};

        // calling sort method in Arrays class
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}

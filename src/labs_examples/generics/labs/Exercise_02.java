package labs_examples.generics.labs;

import com.sun.tools.javah.Gen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList
 *      of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

public class Exercise_02 {

    public static void main(String[] args) {

        ArrayList<Integer> newArray = new ArrayList<>();

        newArray.add(1);
        newArray.add(2);
        newArray.add(3);

        GenSum gen = new GenSum();
        double x = gen.GenSum(newArray);
        System.out.println(x);

    }

}

class GenSum {

    public <T extends Number> double GenSum(ArrayList<T> numbers){

        double sum = 0;
        for (T t : numbers){
            sum += t.doubleValue();
        }

        return sum;
    }

}




/*
    double sum = 0;
for(Double d : m)
        sum += d;
        return sum;

 */


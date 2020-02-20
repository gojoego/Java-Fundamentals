package labs_examples.objects_classes_methods.labs.methods;

//    8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2)
//    and returns an Integer Arraylist. In this method create an Integer ArrayList and
//    populate it with each number between zero and maxNum that is divisible by both
//    divisor1 and divisor2. Then return this ArrayList. After calling this method, print
//    out then length of the returned list

import java.util.ArrayList;

public class Exercise3_8 {

    public static void main(String[] args) {

        modArray(13, 3, 2);
    }

    public static int modArray(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> finArray = new ArrayList<>();

        int arraySize = finArray.size();

        for (int i = 0; i < maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                finArray.add(i);
            }
        }
        System.out.println(finArray);
        return arraySize;
    }
}


package labs_examples.objects_classes_methods.labs.methods;

//    8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2)
//    and returns an Integer Arraylist. In this method create an Integer ArrayList and
//    populate it with each number between zero and maxNum that is divisible by both
//    divisor1 and divisor2. Then return this ArrayList. After calling this method, print
//    out then length of the returned list


/*

1. write method with parameters
2. create an Integer ArrayList
3. take numbers between 0 and maxNum
4. determine which of these numbers can be divided by divisor1 and divisor2, if any
4. remove all numbers that can be divided by divisor1 and divisor2
5. use a for loop

int [] finalNum = {

for (int i = 0, i < finalNum.length; i++){
    for (int b = 0,
    }
for(int x :  ) {
        if ( maxNum % divisor1 || maxNum % divisor2){
                continue;
            }

*/

import java.util.ArrayList;

public class Exercise3_8 {

    public static void main(String[] args) {

        modArray(1,2,3);

    }

    public static void modArray(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> finArray = new ArrayList<>();

        for(int i = 0; i < maxNum; i++){
            if (maxNum % divisor1 == 0 || maxNum % divisor2 == 0 ){
                continue;
            }
            else{
                for (Integer s: finArray){
                    finArray.add(s);
                }

            }
        }
    }

}
/*
    public static void main(String[] args) {
        int[] vals = {456, 234, 987, 876, 123};
        for (int i = 0; i < vals.length; i++){
            // here, we'll use the counter variable "i" from the for loop to access an element in the array
            System.out.println(vals[i]);
        }
    }

 */
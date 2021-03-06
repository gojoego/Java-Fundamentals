package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // create scanner
        // Scanner: class in java.util package used for obtaining input
        // of primitive types like int, double, etc
        /* Scanner scanner = new Scanner(System.in);

        // prompt first number
        System.out.println("Enter first number: ");

        // assign input to variable as first number
        double first = scanner.nextDouble();

        // prompt second number
        System.out.println("Enter second number: ");

        // assign input to variable as second number
        double second = scanner.nextDouble();

        // prompt third number
        System.out.println("Enter third number: ");

        // assign input to variable as third number
        double third = scanner.nextDouble();

        // prompt fourth number
        System.out.println("Enter fourth number: ");

        // assign input to variable as fourth number
        double fourth = scanner.nextDouble();

        // prompt fifth number
        System.out.println("Enter fifth number: ");

        // assign input to variable as fifth number
        double fifth = scanner.nextDouble();

        // prompt sixth number
        System.out.println("Enter sixth number: ");

        // assign input to variable as sixth number
        double sixth = scanner.nextDouble();

        // prompt seventh number
        System.out.println("Enter seventh number: ");

        // assign input to variable as seventh number
        double seventh = scanner.nextDouble();

        // prompt eighth number
        System.out.println("Enter eighth number: ");

        // assign input to variable as eighth number
        double eighth = scanner.nextDouble();

        // prompt ninth number
        System.out.println("Enter ninth number: ");

        // assign input to variable as ninth number
        double ninth = scanner.nextDouble();

        // prompt tenth number
        System.out.println("Enter tenth number: ");

        // assign input to variable as tenth number
        double tenth = scanner.nextDouble();

        // ten numbers received from input
        // place numbers in array
        // format for declaring 1d array: type[] array_name = new type[size];
        double [] tenInputArray = new double[10];

        tenInputArray[0] = first;
        tenInputArray[1] = second;
        tenInputArray[2] = third;
        tenInputArray[3] = fourth;
        tenInputArray[4] = fifth;
        tenInputArray[5] = sixth;
        tenInputArray[6] = seventh;
        tenInputArray[7] = eighth;
        tenInputArray[8] = ninth;
        tenInputArray[9] = tenth;
        */

        // you can use a for loop to simplify the above process

        double [] tenInputArray = new double[10];
        // Here I am declaring an array of the double data type called
        // tenInputArray. This new array has 10 indexes. I can say that this
        // array has a length of 10. The brackets next to double indicate that
        // I am creating an array. The "new" is needed for creating the new
        // array. Array length is fixed. Arrays are NOT dynamically sized.
        // You can access array via indexes. If I see tenInputArray[4] =
        // 1000, I would say: the tenInputArray at the index of four equals
        // one thousand.


        Scanner scanner = new Scanner(System.in);

        /*for (double num: tenInputArray){
            System.out.println(num);
            System.out.println("please enter a number: ");
            num = scanner.nextDouble();
            System.out.println(num);

        }
*/

        for (int a = 0; a < tenInputArray.length; a++) {
            System.out.println("please enter a number: ");
            double b = scanner.nextDouble();
            tenInputArray[a] = b;
            System.out.println(tenInputArray[a]);
        }


        // use for loop to print out Array
        for (int printArray = 0; printArray < tenInputArray.length; printArray++){
            System.out.println(tenInputArray[printArray]);
        }

        // using a loop, calculate the sum
        // use for loop

        double sumTenArray = 0;
        for (int array = 0; array < tenInputArray.length; array++ ) {
            sumTenArray = sumTenArray + tenInputArray[array];
        }

        // print the sum
        System.out.println("sum: " + sumTenArray);

        // calculate the average
        double avgTenArray = sumTenArray / 10;

        // print the average
        System.out.println("average: " + avgTenArray);

    }

}
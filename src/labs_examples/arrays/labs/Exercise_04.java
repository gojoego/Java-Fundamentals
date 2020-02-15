package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // always use int[][] for irregular arrays? cube, vertical,
        // initialize irregular array the way we would a regular 2d array
        // format: type[] array_name = new type[size];
        int[][] irregularArray = {
                {86, 87, 87, 87, 89},
                {81, 83, 85},
                {2009, 2016}
        };

        // use nested for-each loop to iterate and print out each element of array
        // nested for-each loop: for(Data_Type variable : array or collection)

        for (int[] outer : irregularArray){

            // System.out.println(inner);
            for (int num : outer) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }

}

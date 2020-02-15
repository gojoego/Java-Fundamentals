package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create array
        // format for declaring array: type[] array_name = new type[size];
        // creating String array of Asian countries I would
        // to visit in the next few years

        String[] countries = new String[10];

        // populate array
        countries[0] = "Indonesia";
        countries[1] = "Vietnam";
        countries[2] = "Cambodia";
        countries[3] = "Singapore";
        countries[4] = "Malaysia";
        countries[5] = "Philippines";
        countries[6] = "Taiwan";
        countries[7] = "Japan";
        countries[8] = "South Korea";
        countries[9] = "Laos";


        // print out every other element in array in reverse order
        // use for loop to print out every other item in array
        for (int i = 0; i < countries.length; i += 2){
            System.out.println(countries[i]);
        }

        // do this but the opposite using a for loop for reverse order
        for (int j = 9; j >= 0; j = j - 2){
            System.out.println(countries[j]);
        }

    }

}

package videos_source_code.arrays;

public class array_length_ex {

    public static void main(String[] args) {

        // initiate new int array with length of 5
        int[] vals = new int[5];

        // print out the length of the array
        System.out.println("the length of the array is: " + vals.length);

        // loop through the array
        for(int i = 0; i < vals.length; i++){

            // populate each index of the array with the value of "i"
            vals[i] = i;

        }

        // for each int in "vals"
        for (int i : vals){

            // print out the value of "i"
            System.out.println(i);
        }
    }
}

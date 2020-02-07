package videos_source_code.arrays;

import java.util.ArrayList;

public class arraylist_ex1 {

    public static void main(String[] args) {

        // create new ArrayList of String
        ArrayList<String> list = new ArrayList();

            // add values to ArrayList
            list.add("Hello");
            list.add("World");
            list.add("!");

            // if the list is not empty
            if (!list.isEmpty()) {

                // iterate over ever element in the ArrayList and print it
                for (String s : list) {
                    System.out.println(s + "");

                }

            }

    }
}

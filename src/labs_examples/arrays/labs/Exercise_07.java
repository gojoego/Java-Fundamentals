package labs_examples.arrays.labs;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        // ArrayList format: ArrayList<type> arrayListName = new ArrayList();
        // ArrayList: no fixed size, resizable


        // create ArrayList
        ArrayList<String> countriesAfrica = new ArrayList<>();

        // populate ArrayList
        countriesAfrica.add("Nigeria");
        countriesAfrica.add("Libya");
        countriesAfrica.add("Tanzania");
        countriesAfrica.add("Zimbabwe");
        countriesAfrica.add("Kenya");
        countriesAfrica.add("Zambia");
        countriesAfrica.add("South Africa");
        countriesAfrica.add("Morocco");
        countriesAfrica.add("Egypt");

        // access elements within ArrayList
        System.out.println("These are the countries in Africa " +
                "I want to visit first:");
        System.out.println(countriesAfrica);

        System.out.println();

        System.out.println("I want to climb Mt. Kilimanjaro in " + countriesAfrica.get(2));

        // explore different methods
        countriesAfrica.remove(6);
        System.out.println(countriesAfrica);

        System.out.println();

        System.out.println("Egypt is at index " + countriesAfrica.indexOf("Egypt"));

    }
}

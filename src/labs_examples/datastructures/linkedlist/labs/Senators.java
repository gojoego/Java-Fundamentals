package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Senators {

    public static void main(String[] args) {

        LinkedList<String> senators = new LinkedList();

        senators.add("Elizabeth Warren");
        senators.add("Kamala Harris");
        senators.add("Diane Feinstein");
        senators.add("Tammy Duckworth");
        senators.add("Kirsten Gillibrand");
        senators.add("Amy Klobuchar");

        System.out.println("original: " + senators);

        Collection<String> others = new ArrayList<>();
        others.add("Patty Murray");
        others.add("Debbie Stabenow");
        others.add("Maria Cantwell");
        others.add("Jeanne Shaheen");
        others.add("Mazie Hirono");
        others.add("Tammy Baldwin");

        System.out.println("to add " + others);

        senators.addAll(others);

        System.out.println(senators);

        senators.addFirst("Catherine Cortez Mosto");

        System.out.println(senators);


    }
}

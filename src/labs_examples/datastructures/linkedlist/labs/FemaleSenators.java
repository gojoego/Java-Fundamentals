package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class FemaleSenators {

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

        senators.addLast("Kyrsten Simena");

        System.out.println(senators);

        System.out.println();

        System.out.println("first on the list is " + senators.getFirst());

        System.out.println("last on the list is " + senators.getLast());

        System.out.println(senators.get(6));

        System.out.println(senators.size());

        senators.set(6,"Jacky Rosen");

        System.out.println(senators);

        senators.push("Elizabeth Warren");

        System.out.println(senators);

        senators.pop();

        System.out.println();

        System.out.println(senators);

        senators.remove();

        System.out.println();

        System.out.println(senators);

        System.out.println(senators.contains("Kamala Harris"));

        senators.listIterator(5);

        senators.clear();

        System.out.println(senators);

    }
}

package labs_examples.testing.data_structures;

public class LinkedListCountries {

    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList();

        countries.add("Denmark");
        countries.add("Sweden");

        countries.push("Hong Kong");
        countries.push("Macau");

        System.out.println(countries.get());

    }

}

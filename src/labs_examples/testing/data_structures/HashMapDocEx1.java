package labs_examples.testing.data_structures;

// hashmap tells us where index is
// requires HashMapNode class with generics
// create CustomHashMap
    // create HashMapNode array
    // put (insert), hash get, delete, contains,


// HashMap, Iterator, Map, and Set all need to be imported

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// under covers of Hashmap, use object called "Entry" or "Node"
class Entry<K, V> {

    K key;
    V value;
    Entry<K, V> next; // this is capable of being a LinkedList (for collisions)

    // underlying array inside the Hashmap
    private Entry<K, V>[] entryTable;
}

class Person {
    private String firstName;
    private String lastName;
    private String email;


    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class HashMapDocEx1 {
    public static void main(String[] args){
        // create the hashmap "key" will be the email, a String
        // and the "value" will the Person object
        HashMap<String, Person> peopleMap = new HashMap();


        // create a few Person objects
        Person ryan = new Person("Ryan", "Desmond", "ryan@codingnomads.co");
        Person kim = new Person("Kim", "Desmond", "kim@codingnomads.co");
        Person martin = new Person("Martin", "Breuss", "martin@codingnomads.co");
        Person caden = new Person("Caden", "Mackenzie", "caden@codingnomads.co");


        // "put" the Person objects into the HashMap
        peopleMap.put(ryan.getEmail(), ryan);
        peopleMap.put(kim.getEmail(), kim);
        peopleMap.put(martin.getEmail(), martin);
        peopleMap.put(caden.getEmail(), caden);


        // demonstrate "getting" an element out of the HashMap
        Person example = peopleMap.get("caden@codingnomads.co");
        System.out.println(example.toString());


        // demonstrate iterating through the entries of a HashMap
        Set entries = peopleMap.entrySet();
        Iterator iterator = entries.iterator();
        // loop through the entries
        while(iterator.hasNext()) {
            // get each Entry individually
            Map.Entry person = (Map.Entry)iterator.next();
            // print out the entry's key and value
            System.out.print("The key is: "+ person.getKey()
                    + " and the value is: " + person.getValue().toString());
        }
    }
}
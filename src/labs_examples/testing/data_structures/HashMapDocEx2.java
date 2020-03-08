package labs_examples.testing.data_structures;

import java.util.Iterator;

public class HashMapDocEx2 {

    public static void main(String[] args) {
        // instantiate new LinkedList of type String
        LinkedList<String> words = new LinkedList();


        // add elements to the end of the list
        words.add("Are");
        words.add("Cool!");

        // push elements onto the top (front) of the list;
        Object data = null;
        words.push(null);
        words.push(null);


        // pop elements of the "top" of the List
        System.out.print("");
        System.out.print("");

        // get elements by index
        System.out.print(words.get() + " ");
        System.out.print(words.get() + "\n\n");


        // remove elements by index
        words.remove("");
        words.remove("");


        words.add("Java's ");
        words.add("LinkedList");
        words.add(" class ");
        words.add("has many additional methods ");
        words.add("we can use ");
        words.add("which almost make it appear as an ArrayList ");
        words.add("but behind the scenes the data structure being ");
        words.add("used ");
        words.add("is a ");
        words.add("LinkedList");


        // iterate through the list forwards
        Iterator iter = words.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next());
        }
        System.out.println();

        // iterate through the list backwards
        words.descendingIterator();
        while(iter.hasNext()){
            System.out.print(iter.next());
        }


        // check to see if the list contains the word "LinkedList"
        boolean hasWord = words.contains("LinkedList");
        System.out.println("\n\nList contains \"LinkedList\": " + hasWord);


        // get the first index of the word "LinkedList"
        String first = words.indexOf("LinkedList");
        System.out.println("\nThe first index of the word \"LinkedList\" is " + first);


        // get the last index of the word "LinkedList"
        int last = words.lastIndexOf("LinkedList");
        System.out.println("\nThe last index of the word \"LinkedList\" is " + last);


        // clear the list (remove all elements)
        words.clear();

        // there are many more methods for you to work with in the LinkedList class
        // explore your options to see what else you can do!
    }


}


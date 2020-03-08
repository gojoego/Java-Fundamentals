package labs_examples.datastructures.linkedlist.labs;

public class CustomLinkedList<T> {

    // "head" variable will always keep track of first Node in list
    private Node head;

    // this constructor uses VarArgs
    // can pass in zero or more data elements to add to list
    public CustomLinkedList(T... data) {

        // if no data elements passed will instantiate empty LinkedList
        if (data.length < 1) {
            head = null;
        } else {
            // if passing 1 or more elements, each element added to LinkedLis
            // by calling add ()
            for (int i = 0; i < data.length; i++) {
               // add(data(i));
            }
        }


    }


    // adds new Node given data to end of list
    public void add(T data){

        // call insert() method, pass in data and current LinkedList size
        // by calling

    }

}

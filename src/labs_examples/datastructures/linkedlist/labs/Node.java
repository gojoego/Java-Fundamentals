package labs_examples.datastructures.linkedlist.labs;

public class Node<T> {

    // generic variable to hold data we want to store in list
    T data;

    // "link" to "next" Node in LinkedList
    Node next;

    // simple constructor that takes in data
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // overloaded constructor used to add Nodes to front of LinkedList
    public Node(T data, Node node){
        this.data = data;
        this.next = node;
    }

}

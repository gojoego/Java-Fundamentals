package labs_examples.testing.linkedlists;

import java.util.EmptyStackException;

public class LinkedListClassEx1 {
    /*
    public<T> void remove(Node<T> data){
        if (head == null){
            throw new EmptyListException("The list is empty");
    }
        Node<T> iterator = head;
        while(iterator.next != data){
            if(null == iterator.next.next){
                throw new NotInListException();
            }
            iterator = iterator.next;
        }


    }*/
}

class Node<T> {

    Node head;
    T data;


    GeeksForGeeksEx.Node next;

    // Constructor
    Node(int d) {

        next = null;
    }
}
package labs_examples.testing.data_structures;

// LINKED LIST NODE

public class Node<T> {

    T data;
    Node next;
    private Node previous;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public <T> Node(T data) {
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

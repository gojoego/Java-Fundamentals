package labs_examples.testing;

// LINKED LIST NODE

public class Node<T> {

    private T data;
    private Node next;
    private Node previous;

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}

package labs_examples.testing;

// LINKED LIST NODE

public class Node<T> {

    protected T data;
    protected Node next;
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

package labs_examples.testing;


public class LinkedList<T> {

    Node<T> head;

    public LinkedList(){}

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    // ADD Method
    public void add(T data){
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    // GET (PEEK) Method
    public T get(){
        return head.getData();
    }

    // REMOVE
    public void remove(T data){

        Node cursor = head;
        if (cursor.getData() == data){
            head = cursor.next;
        }
        while(cursor.next != null){
            if (cursor.next.getData()==data){
            }
        }

        }


    }




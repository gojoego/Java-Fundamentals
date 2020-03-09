package labs_examples.datastructures.linkedlist.labs;

public class CustLinkedList<T> {

    // "head" variable will always keep track of first Node in list
    // always make private
    private Node head;

    // this constructor uses VarArgs
    // can pass in zero or more data elements to add to list
    public CustLinkedList(T... data) {

        // if no data elements passed will instantiate empty LinkedList
        if (data.length < 1) {
            head = null;
        } else {
            // if passing 1 or more elements, each element added to LinkedLis
            // by calling add ()
            for (T datum : data) {
                add(datum);
            }
        }


    }

    public void set(int index, T data) {
        try {
            int count = 0;
            Node iterator = head;
            while (count != index) {
                iterator = iterator.next;
                count++;
            }
            iterator.data = data;
        } catch (NullPointerException exc) {
            System.out.println("invalid index");
        }
    }

    public T get(int index) {
        try {
            int count = 0;
            Node iterator = head;
            while (count != index) {
                iterator = iterator.next;
                count++;
            }
            return (T) iterator.data;
        } catch (NullPointerException ex) {
            System.out.println("invalid");
        }
        return null;
    }


    // adds new Node given data to end of list
    public void add(T data) {

        // call insert() method, pass in data and current LinkedList size
        // by calling size() returns length of LinkedList
        insert(data, size());

    }

    public void insert(T data, int index) {
        // if "head" null, create new root node
        if (head == null) {
            head = new Node(data);
        } else {
            Node iterator = head;
            Node previous = null;
            if (index == 0) {
                head = new Node(data, head);
            } else if (index < size()) {
                int count = 0;
                while (count != index) {
                    previous = iterator;
                    iterator = iterator.next;
                    count++;

                }
                previous.next = new Node(data, iterator);
            } else {
                while (iterator.next != null) {
                    iterator = iterator.next;
                }
                iterator.next = new Node(data);

            }
        }
    }

    // public void remove (K key)
    // 1. call the hash() to get index for "key"
    // 2. check to see if array at index is null
        // return if so
    // 3. if array at index is not a linkedlist (aka ".next" is null)
        //
        // and array at index .getkey is equal to key
        // set array at index to null
        // return
    // 4. else create an iterator containing the node object at array[index]
    // 5. while iterator.next is not null and iterator.next.key != key(to remove)
        // iterate (iterator = iterator.next)
    // 6. after while loop completes we're either at the
        // end of the list if last node is one to delete
        // set next to null
        // if last node is not the same key, we didn't find
        // it in the list, return
    // 7. if found key in next and next.next does not equal
    // null then set node.next = node.next.next



    // hash (K key)
    // int hash = key.hashcode();
    // int index = hash% array.length;
    // return index;


    public void remove(int index) {

        if (index == 0) {
            head = head.next;
        } else if (index < size()) {
            try {
                int count = 0;
                Node previous = null;
                Node iterator = head;
                while (count != index) {
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }
                previous.next = iterator.next;
            } catch (NullPointerException ex) {
                System.out.println("invalid index");
            }
        } else {
            Node iterator = head;
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = null;
        }
    }

    @Override
    public String toString() {
        Node iterator = head;
        String output = "";
        while (iterator != null) {
            output += iterator.data + " ";
            iterator = iterator.next;
        }

        return output;
    }

    public int size() {
        int count = 0;
        Node iterator = head;

        // iterate through list
        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

}



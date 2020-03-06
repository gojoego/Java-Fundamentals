package labs_examples.testing.data_structures;

public class LinkedListController {
    public static void main(String[] args) {
        AnotherLinkedList<String> myLinkedList = new AnotherLinkedList<>();
        System.out.println(myLinkedList.isEmpty());
        myLinkedList.addToFront("Ryan");
        myLinkedList.addToFront("Joe");
        myLinkedList.addToFront("Mimi");
        myLinkedList.printList();
        System.out.println(myLinkedList.contains("Joe"));
        myLinkedList.remove("Mimi");
        System.out.println("after remove");
        myLinkedList.printList();
        myLinkedList.remove("Ryan");
        myLinkedList.clear();
        System.out.println("after clear");
        myLinkedList.printList();
    }
}
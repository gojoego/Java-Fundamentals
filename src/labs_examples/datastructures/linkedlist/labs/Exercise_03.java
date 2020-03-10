package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_03
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 *
 *      Algorithm
 * Define a Node class which represents a node in the list. It will have three properties: data, previous which will point to the previous node and next which will point to the next node.
 * Define another class for creating a doubly linked list, and it has two nodes: head and tail. Initially, head and tail will point to null.
 * addNode() will add node to the list:
 * It first checks whether the head is null, then it will insert the node as the head.
 * Both head and tail will point to a newly added node.
 * Head's previous pointer will point to null and tail's next pointer will point to null.
 * If the head is not null, the new node will be inserted at the end of the list such that new node's previous pointer will point to tail.
 * The new node will become the new tail. Tail's next pointer will point to null.
 * a. display() will show all the nodes present in the list.
 *
 * Define a new node 'current' that will point to the head.
 * Print current.data till current points to null.
 * Current will point to the next node in the list in each iteration.
 */

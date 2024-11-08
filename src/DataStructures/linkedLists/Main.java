package DataStructures.linkedLists;

import java.util.LinkedList;

public class Main {

    /*
     * What is LinkedList?
     *
     * - LinkedList stores Nodes in 2 parts (data + address).
     * - Nodes are in non-consecutive memory location.
     * - Elements are linked using pointers:
     *
     *                                      Singly Linked List
     *                      Node                 Node                 Node
     *                  [data | address] --> [data | address] --> [data | address]
     *
     *                                      Doubly Linked List
     *               Node                           Node                           Node
     *    [address | data | address] <-> [address | data | address] <-> [address | data | address]
     *
     * Advantages:
     * - Dynamic Data Structure: Allocates needed memory while running.
     * - Insertion and Deletion of Nodes is easy. O(1)
     * - No/Low memory waste.
     *
     * Disadvantages:
     * - Greater memory usage: Additional pointer.
     * - No random access of elements: No index [i]
     * - Accessing/searching elements is more time-consuming. O(n)
     */

    /*
     * Methods of LinkedList:
     *
     * .add(Object x): void --> Adds an item to LinkedList
     * .add(int index, Object x): void --> Adds an item to given index of LinkedList.
     *   *** Throws IndexOutOfBoundsException if the index is out of range.
     * .remove(Object x): boolean --> Removes the given item from LinkedList and returns true if successful.
     * .indexOf(Object x): int --> Returns the index of given object in LinkedList or -1 if there is no such index.
     * .peekFirst(): Object --> Returns the head of LinkedList or null if LinkedList is empty.
     * .peekLast(): Object --> Returns the tail of LinkedList or null if LinkedList is empty.
     * .addFirst(Object x): void --> Adds element to head of LinkedList.
     * .addLast(Object x): void --> Adds element to tail of LinkedList.
     * .removeFirst(): Object --> Removes the head of the LinkedList.
     *   *** Throws NoSuchElementException if this list is empty.
     * .removeLast(): Object --> Removes the tail of the LinkedList.
     *   *** Throws NoSuchElementException if this list is empty.
     *
     * Can Fake Queue:
     * .offer(Object x): boolean --> Adds an item to the end (tail) of the queue. // Enqueue
     * .peek(): Object --> Returns the head of the queue WITHOUT removing it. // Peek
     *   *** Does not cause an exception if the queue is empty!
     * .poll(): Object --> Returns and removes the head of the queue. // Dequeue
     *   *** Does not cause an exception if the queue is empty!
     *
     * Can Fake Stack:
     * .push(Object x): void --> adds an element to the stack
     * .pop(): Object --> returns the topmost element of the stack and removes it
     *     *** throws "NoSuchElementException" if the stack is empty
     * .peek(): Object --> returns the topmost element without removing it or null if it is empty.
     *
     * Collection Class Methods can be used:
     * .isEmpty(): boolean --> Checks if the queue is empty.
     * .size(): int --> Returns the number of elements in the queue.
     * .contains(Object x): boolean --> Checks if the queue contains a specific element.
     */

    /*
     * Uses of Queue:
     *
     * - Implement Stack/Queue
     * - GPS Navigation
     * - Music Playlist
     */

    public static void main(String[] args) {
        // Creating LinkedList --> It is a doubly LinkedList
        LinkedList<String> likeStack = new LinkedList<>();

        System.out.println(" --- STACK --- ");

        // LinkedList can be treated like Stack -> push(), pop(), peek()
        likeStack.push("A");
        likeStack.push("B");
        likeStack.push("C");
        likeStack.push("D");
        likeStack.push("F");

        // Removing top most item like its Stack
        String f = likeStack.pop(); // F
        System.out.println("Popped Item: " + f);

        // Displaying LinkedList
        System.out.println(likeStack);

        System.out.println(" --- QUEUE --- ");

        // LinkedList can be also treated as Queue
        LinkedList<String> likeQueue = new LinkedList<>();

        // LinkedList can be treated like Queue -> offer(), poll(), peek()
        likeQueue.offer("A");
        likeQueue.offer("B");
        likeQueue.offer("C");
        likeQueue.offer("D");
        likeQueue.offer("F");

        // Removing the first-in item like it is a queue
        String a = likeQueue.poll(); // A
        System.out.println("First Item: " + a);

        // Displaying LinkedList
        System.out.println(likeQueue);

        // Adding item to LinkedList using .add()
        likeQueue.add(3, "E");
        System.out.println("After Adding 'E' to 3rd index: " + likeQueue);

        // Removing item in LinkedList using .remove()
        likeQueue.remove("E");
        System.out.println("After Deleting 'E': " + likeQueue);

        // Searching an item in LinkedList using .indexOf()
        int d = likeQueue.indexOf("D");
        System.out.println("Index of D: " + d);

        // Getting the head of LinkedList using .peekFirst()
        System.out.println("Head of LinkedList: " + likeQueue.peekFirst());

        // Getting the tail of LinkedList using .peekLast()
        System.out.println("Tail of LinkedList: " + likeQueue.peekLast());

        // Adding new item to head using .addFirst()
        likeQueue.addFirst("0");
        System.out.println("LinkedList with new head: " + likeQueue);

        // Adding new item to tail using .addLast()
        likeQueue.addLast("G");
        System.out.println("LinkedList with new tail: " + likeQueue);

        // Removing head of LinkedList using .removeFirst()
        String head = likeQueue.removeFirst();
        // Removing tail of LinkedList using .removeLast()
        String tail = likeQueue.removeLast();
        System.out.println("Head: " + head + " / Tail: " + tail);
        System.out.println(likeQueue);
    }
}

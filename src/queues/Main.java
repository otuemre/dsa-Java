package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    /*
     * What is Queue?
     *
     * - Queue is a FIFO (First-In First-Out) data structure.
     * - Queue is designed to hold elements before processing.
     * - Queue is a Linear Data Structure, often used for ordering tasks or events.
     */

    /*
     * Methods of Queue:
     *
     * Recommended:
     * .offer(Object x): boolean --> Adds an item to the end (tail) of the queue. // Enqueue
     * .peek(): Object --> Returns the head of the queue WITHOUT removing it. // Peek
     *   *** Does not cause an exception if the queue is empty!
     * .poll(): Object --> Returns and removes the head of the queue. // Dequeue
     *   *** Does not cause an exception if the queue is empty!
     *
     * Not Recommended:
     * .add(Object x): boolean --> Similar to .offer()
     * .remove(): Object --> Similar to .poll()
     *   *** Throws NoSuchElementException if the queue is empty.
     * .element(): Object --> Similar to .peek()
     *   *** Throws NoSuchElementException if the queue is empty.
     *
     * Collection Class Methods can be used:
     * .isEmpty(): boolean --> Checks if the queue is empty.
     * .size(): int --> Returns the number of elements in the queue.
     * .contains(Object x): boolean --> Checks if the queue contains a specific element.
     */

    /*
     * Uses of Queue:
     *
     * - Keyboard buffer (letters appear in the order they are pressed).
     * - Printer queue (print jobs complete in order).
     * - Common in LinkedList, PriorityQueue, and breadth-first search algorithms.
     */

    public static void main(String[] args) {
        // We cannot create an instance of Queue directly as it is an interface.
        // Instead, we can instantiate it using a class that implements Queue, like LinkedList or PriorityQueue.
        // Here, we use LinkedList to implement the Queue interface.
        Queue<String> queue = new LinkedList<>();

        // Adding items to the queue using .offer()
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Herold");

        // Displaying the queue
        System.out.println(queue);

        // Getting the head of the queue using .peek()
        String head = queue.peek();
        System.out.println("Head of the Queue: " + head);

        System.out.println();

        // Removing the head of the queue using .poll() (new head will be the next item)
        String karen = queue.poll();
        System.out.println("Dequeue: " + karen);
        System.out.println(queue);

        System.out.println();

        String chad = queue.poll();
        System.out.println("Dequeue: " + chad);
        System.out.println(queue);

        System.out.println();

        // Using Collection class methods:
        // Checking if the queue is empty
        System.out.println("Is Queue empty? " + queue.isEmpty());

        System.out.println();

        // Checking the size of the queue
        System.out.println("Size of the Queue: " + queue.size());

        System.out.println();

        // Checking if the queue contains a specific object
        System.out.println("Queue contains 'Steve'? " + queue.contains("Steve"));
    }

}

package DataStructures.priorityQueues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    /*
     * What is PriorityQueue?
     *
     * - PriorityQueue is a FIFO (First-In First-Out) data structure.
     * - It serves elements with the highest priority first before elements with lower priority.
     */

    /*
     * Methods of Queue:
     *
     * *** PriorityQueue orders the elements in their natural order (e.g., ascending order for numbers).
     * *** You can also pass Collections.reverseOrder() to order in descending order.
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
     * - Task Scheduling: Organizing tasks based on priority for processing.
     * - Dijkstra's Algorithm: Finding the shortest path in a weighted graph.
     * - Merge Sorted Arrays: Efficiently merging multiple sorted data sources into a single sorted output.
     */

    public static void main(String[] args) {
        // Creating a LinkedList as Queue (FIFO)
        Queue<Double> queue = new LinkedList<>();

        // Adding elements to queue (e.g., GPA Scores)
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        // Displaying elements of the queue (FIFO)
        System.out.println("Queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        System.out.println();

        // Creating PriorityQueue (Ordered by natural order)
        Queue<Double> pQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        pQueue.offer(3.0);
        pQueue.offer(2.5);
        pQueue.offer(4.0);
        pQueue.offer(1.5);
        pQueue.offer(2.0);

        // Displaying elements of the PriorityQueue (Ordered by ascending GPA)
        System.out.println("PriorityQueue: ");
        while (!pQueue.isEmpty()) {
            System.out.print(pQueue.poll() + " ");
        }
    }
}

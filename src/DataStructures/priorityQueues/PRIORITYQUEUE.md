# PriorityQueue:
**PriorityQueue**: A data structure where elements are served based on their priority rather than the order they were added. Elements with higher priority are dequeued first. It is typically used for processing tasks in the order of priority. Common operations include:

## Methods of PriorityQueue:
- `.offer(Object x): boolean` - Adds an element to the priority queue. Returns `true` if the element was added successfully.
- `.peek(): Object` - Returns the highest-priority element without removing it. Returns `null` if the queue is empty.
- `.poll(): Object` - Removes and returns the highest-priority element. Returns `null` if the queue is empty.

## Additional Methods (Not Recommended for General Use):
- `.add(Object x): boolean` - Similar to `.offer()`, but throws an exception if the queue is full.
- `.remove(): Object` - Similar to `.poll()`, but throws an exception if the queue is empty.
- `.element(): Object` - Similar to `.peek()`, but throws an exception if the queue is empty.

## Collection Class Methods
Since `PriorityQueue` is part of the `Queue` interface, it also supports methods inherited from the `Collection` interface:
- `.isEmpty(): boolean` - Checks if the priority queue is empty.
- `.size(): int` - Returns the number of elements in the priority queue.
- `.contains(Object x): boolean` - Checks if a specific element exists in the priority queue.

## Common Uses of PriorityQueue:
- **Task Scheduling** - Assigns and processes tasks in the order of their priority.
- **Dijkstra’s Algorithm** - Used for finding the shortest path in weighted graphs, where the queue processes nodes based on their priority (shortest distance).
- **Merge Sorted Arrays** - Efficiently merges multiple sorted arrays into one sorted array.
- **Real-Time Event Scheduling** - Manages events based on priority, where high-priority events are processed first.

## Code Example:

**Code Example**:
```java
package DataStructures.priorityQueues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

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
```

**Output**:
```
Queue: 
3.0 2.5 4.0 1.5 2.0 
PriorityQueue: 
1.5 2.0 2.5 3.0 4.0 
```
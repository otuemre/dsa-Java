# Queue:
**Queue**: A First-In-First-Out (FIFO) data structure where elements are added at the back and removed from the front, like a line of people waiting. It is useful for processing items in the order they arrive. Common operations include:

## Methods of Queue:
- `.offer(Object x): boolean` - Adds an element to the back of the queue. Returns `true` if the element was added successfully.
- `.peek(): Object` - Returns the front element without removing it. Returns `null` if the queue is empty.
- `.poll(): Object` - Removes and returns the front element. Returns `null` if the queue is empty.

## Additional Methods (Not Recommended for General Use):
- `.add(Object x): boolean` - Similar to `.offer()`, but throws an exception if the queue is full.
- `.remove(): Object` - Similar to `.poll()`, but throws an exception if the queue is empty.
- `.element(): Object` - Similar to `.peek()`, but throws an exception if the queue is empty.

## Collection Class Methods
Since `Queue` is part of the `Collection` framework, it also supports methods inherited from the `Collection` interface:
- `.isEmpty(): boolean` - Checks if the queue is empty.
- `.size(): int` - Returns the number of elements in the queue.
- `.contains(Object x): boolean` - Checks if a specific element exists in the queue.

## Common Uses of Queue:
- **Keyboard Buffering** - Ensures keystrokes are processed in the order they are typed.
- **Printer Task Scheduling** - Manages print jobs so they are printed in the order they were received.
- **Breadth-First Search (BFS)** - Used in graph traversal algorithms.
- **Task Processing** - Manages events or tasks that need to be processed in the order they were added.

## Code Example:
```
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
```

**Output**:
```
[Karen, Chad, Steve, Herold]
Head of the Queue: Karen

Dequeue: Karen
[Chad, Steve, Herold]

Dequeue: Chad
[Steve, Herold]

Is Queue empty? false

Size of the Queue: 2

Queue contains 'Steve'? true
```
# Data Structures & Algorithm in Java

**Note**: This project will follow "Bro Code - Data Structures and Algorithms" playlist!

## Project Content
- Basic Data Structures
- Big O Notation
- Searching Algorithms
- Sorting Algorithms
- Graphs
- Trees

## What is Data Structure
**Data Structure**: A named location used to store and organize data. For example, a family tree represents a hierarchy of family relationships.

## What is an Algorithm

**Algorithm**: A collection of steps to solve a problem. For example, baking a pizza:
- Heat the oven to 550&deg;F
- Knead the dough
- Add toppings
- ...

## Why to Learn DS & A?
1. `Time` and `Memory` efficient code can be written.
2. `DS & A` is involved in commonly asked questions in job interviews. 

## Basic Data Structures

### Stack:
**Stack**: A Last-In-First-Out (LIFO) data structure where elements are added and removed from the top, similar to a stack of books. Common operations include:

Methods of Stack:
- `.empty(): boolean`: Checks if the stack is empty or not.
- `.push(Object x): void`: Adds an element to the top of the stack.
- `.pop(): Object`: Removes and returns the topmost element.
- `.peek(): Object`: Returns the topmost element without removing it.
- `.search(Object x): int`: Returns the index of given element.

Stacks are commonly used for:
- Undo/Redo functionality in text editors
- Browser history navigation
- Backtracking algorithms (e.g., solving mazes)
- Managing function calls in programming (Call Stack)

### Queue:
**Queue**: A First-In-First-Out (FIFO) data structure where elements are added at the back and removed from the front, like a line of people waiting. It is useful for processing items in the order they arrive. Common operations include:

Methods of Queue:
- `.offer(Object x): boolean` - Adds an element to the back of the queue. Returns `true` if the element was added successfully.
- `.peek(): Object` - Returns the front element without removing it. Returns `null` if the queue is empty.
- `.poll(): Object` - Removes and returns the front element. Returns `null` if the queue is empty.

Additional Methods (Not Recommended for General Use):
- `.add(Object x): boolean` - Similar to `.offer()`, but throws an exception if the queue is full.
- `.remove(): Object` - Similar to `.poll()`, but throws an exception if the queue is empty.
- `.element(): Object` - Similar to `.peek()`, but throws an exception if the queue is empty.

Collection Class Methods
Since `Queue` is part of the `Collection` framework, it also supports methods inherited from the `Collection` interface:
- `.isEmpty(): boolean` - Checks if the queue is empty.
- `.size(): int` - Returns the number of elements in the queue.
- `.contains(Object x): boolean` - Checks if a specific element exists in the queue.

Common Uses of Queue:
- **Keyboard Buffering** - Ensures keystrokes are processed in the order they are typed.
- **Printer Task Scheduling** - Manages print jobs so they are printed in the order they were received.
- **Breadth-First Search (BFS)** - Used in graph traversal algorithms.
- **Task Processing** - Manages events or tasks that need to be processed in the order they were added.


### PriorityQueue:
**PriorityQueue**: A data structure where elements are served based on their priority rather than the order they were added. Elements with higher priority are dequeued first. It is typically used for processing tasks in the order of priority. Common operations include:

Methods of PriorityQueue:
- `.offer(Object x): boolean` - Adds an element to the priority queue. Returns `true` if the element was added successfully.
- `.peek(): Object` - Returns the highest-priority element without removing it. Returns `null` if the queue is empty.
- `.poll(): Object` - Removes and returns the highest-priority element. Returns `null` if the queue is empty.

Additional Methods (Not Recommended for General Use):
- `.add(Object x): boolean` - Similar to `.offer()`, but throws an exception if the queue is full.
- `.remove(): Object` - Similar to `.poll()`, but throws an exception if the queue is empty.
- `.element(): Object` - Similar to `.peek()`, but throws an exception if the queue is empty.

Collection Class Methods
Since `PriorityQueue` is part of the `Queue` interface, it also supports methods inherited from the `Collection` interface:
- `.isEmpty(): boolean` - Checks if the priority queue is empty.
- `.size(): int` - Returns the number of elements in the priority queue.
- `.contains(Object x): boolean` - Checks if a specific element exists in the priority queue.

Common Uses of PriorityQueue:
- **Task Scheduling** - Assigns and processes tasks in the order of their priority.
- **Dijkstra’s Algorithm** - Used for finding the shortest path in weighted graphs, where the queue processes nodes based on their priority (shortest distance).
- **Merge Sorted Arrays** - Efficiently merges multiple sorted arrays into one sorted array.
- **Real-Time Event Scheduling** - Manages events based on priority, where high-priority events are processed first.

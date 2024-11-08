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

- **Stack**: A Last-In-First-Out (LIFO) data structure where elements are added and removed from the top, similar to a stack of books. [See more](./src/stacks/STACK.md)
- **Queue**: A First-In-First-Out (FIFO) data structure where elements are added at the back and removed from the front, like a line of people waiting. It is useful for processing items in the order they arrive. [See More](./src/queues/QUEUE.md)
- **PriorityQueue**: A data structure where elements are served based on their priority rather than the order they were added. Elements with higher priority are dequeued first. It is typically used for processing tasks in the order of priority. [See More](./src/priorityQueues/PRIORITYQUEUE.md)
- **LinkedList**: A data structure that stores elements as nodes in two parts: **data** and **address**. Nodes in a linked list are stored in non-contiguous memory locations and are connected via pointers. [See More](./src/linkedLists/LINKEDLIST.md)
- **DynamicArray**: A resizable array that can grow or shrink at runtime. This implementation creates a custom dynamic array, similar in functionality to Java’s ArrayList. [See More](./src/dynamicArrays/DYNAMICARRAY.md)
- **ArrayList vs LinkedList**: Both classes are part of the Java Collections Framework and implement the List interface, but they are optimized for different use cases. This code tests various operations and highlights the performance characteristics of each data structure. [See More](./src/arraylistVsLinkedlist/COMPARISON.md)

## Big O Notation

- Big O notation is a mathematical concept that describes how an algorithm's runtime or space requirements grow as the input size increases. Big O focuses on the **number of operations** or **steps** an algorithm needs to complete rather than exact execution time, making it machine-independent. [See More](./src/bigO/BIGO.md)
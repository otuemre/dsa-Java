# Data Structures & Algorithm in Java

**Note**: This project will follow "[Bro Code](https://www.youtube.com/@BroCodez) - Data Structures and Algorithms" playlist!

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

- **Stack**: A Last-In-First-Out (LIFO) data structure where elements are added and removed from the top, similar to a stack of books. [See more](./src/DataStructures/stacks/STACK.md)
- **Queue**: A First-In-First-Out (FIFO) data structure where elements are added at the back and removed from the front, like a line of people waiting. It is useful for processing items in the order they arrive. [See More](./src/DataStructures/queues/QUEUE.md)
- **PriorityQueue**: A data structure where elements are served based on their priority rather than the order they were added. Elements with higher priority are dequeued first. It is typically used for processing tasks in the order of priority. [See More](./src/DataStructures/priorityQueues/PRIORITYQUEUE.md)
- **LinkedList**: A data structure that stores elements as nodes in two parts: **data** and **address**. Nodes in a linked list are stored in non-contiguous memory locations and are connected via pointers. [See More](./src/DataStructures/linkedLists/LINKEDLIST.md)
- **DynamicArray**: A resizable array that can grow or shrink at runtime. This implementation creates a custom dynamic array, similar in functionality to Java’s ArrayList. [See More](./src/DataStructures/dynamicArrays/DYNAMICARRAY.md)
- **ArrayList vs LinkedList**: An `ArrayList` in Java stores elements in a dynamic array, providing fast access by index but slower insertions and deletions, especially in large lists. A `LinkedList` stores elements in nodes linked by pointers, allowing fast insertions and deletions but slower access by index. [See More](./src/DataStructures/arraylistVsLinkedlist/COMPARISON.md)
- **Hashtable**: A data structure that maps unique keys to values. It uses hashing to compute the storage index for fast insertion, lookup, and deletion of key-value pairs. [See More](./src/DataStructures/hashTables/HASHTABLE.md)

## Big O Notation

- Big O notation is a mathematical concept that describes how an algorithm's runtime or space requirements grow as the input size increases. Big O focuses on the **number of operations** or **steps** an algorithm needs to complete rather than exact execution time, making it machine-independent. [See More](./src/bigO/BIGO.md)

**Big-O Time Complexity Comparison**:
![Big-O Time Complexity Comparison](./images/Big-O-Complexity-Comparison.jpeg)

### Big O Cheatsheet

![Big-O Complexity Cheatsheet](./images/big-o-cheat-sheet-poster.png)

## Searching Algorithms

- **LinearSearch**: Iterates through a collection one element at a time, comparing each element to the target. If it finds a match, it returns the index of that element; otherwise, it returns `-1`, indicating that the element is not present in the collection. The time complexity of binary search is `O(n)`. [See More](./src/SearchAlgorithms/linearSearch/LINEARSEARCH.md)
- **BinarySearch**: Works by eliminating half of the search space with each step, making it significantly faster than linear search for large, sorted arrays. The time complexity of binary search is `O(log n)`. [See More](./src/SearchAlgorithms/binarySearch/BINARYSEARCH.md)
- **InterpolationSearch**: Finds the position of a target value within a sorted array by calculating a position estimate (probe) based on the values of the target and the current bounds. It is most efficient with uniformly distributed data `O(log(log(n)))`. [See More](./src/SearchAlgorithms/interpolationSearch/INTERPOLATION.md)

## Sorting Algorithms

- **Bubble Sort**: Repeatedly compares and swaps adjacent elements if they are out of order. After each full pass through the array, the largest unsorted element is moved to its correct position at the end, creating a "bubble" effect as the largest elements accumulate at the end of the array. [See More](./src/SortAlgorithms/bubbleSort/BUBBLESORT.md)
- **Selection Sort**: Repeatedly finds the minimum element from the unsorted part of the array and swaps it with the element at the beginning of the unsorted section. This process continues until the entire array is sorted. [See More](./src/SortAlgorithms/selectionSort/SELECTIONSORT.md)
- **Insertion Sort**: Builds the sorted portion of the array one element at a time. For each iteration, it compares the current element to its left and shifts larger elements to the right to make room for the current element. [See More](./src/SortAlgorithms/insertionSort/INSERTIONSORT.md)
- **Merge Sort**: Divide-and-conquer algorithm that recursively divides an array into two halves, sorts each half, and merges them back together in sorted order. This process continues until the entire array is sorted. [See More](./src/SortAlgorithms/mergeSort/MERGESORT.md)
- **Quick Sort**: Divide-and-conquer algorithm that partitions an array around a pivot element, recursively sorts the left and right partitions, and combines them to produce a sorted array. [See More](./src/SortAlgorithms/quickSort/QUICKSORT.md)

## Recursion

- **Recursion**: is a process where a method calls itself to solve a problem by breaking it into smaller sub-problems. It is a powerful technique often used in mathematical computations, advanced sorting algorithms, and navigating data structures like trees. [See More](./src/Recursion/RECURSION.md)

## Graphs
- **Graphs**: A powerful and flexible data structure for representing relationships between objects. Graphs consist of **vertices (nodes)** and **edges**, which can be **directed** (one-way relationships) or **undirected** (two-way relationships).
- **Applications**: Graphs are widely used in domains like **network routing**, **social media connections**, **navigation systems**, **dependency resolution**, and more.
- **Key Representations**:
  - **Adjacency Matrix**: A 2D array suitable for dense graphs, providing constant-time edge checks.
  - **Adjacency List**: A more space-efficient structure for sparse graphs.
    - **Depth First Search (DFS)**: A traversal algorithm that explores depth before breadth, often used for pathfinding, cycle detection, and topological sorting. [See More](./src/Graphs/DepthFirstSearch/DFS.md)
- **Common Algorithms**: Graph traversal (DFS, BFS), shortest paths (Dijkstra's, Bellman-Ford), and spanning trees (Prim's, Kruskal's).
- [Learn More and See Examples](./src/Graphs/GRAPHS.md)

## Acknowledgments

- Data Structures & Algorithm Playlist by [Bro Code](https://www.youtube.com/@BroCodez)
- Big-O Time Complexity Comparison by [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)
- Big-O Complexity Cheat Sheet from [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)

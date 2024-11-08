# LinkedList

**LinkedList** is a data structure that stores elements as nodes in two parts: **data** and **address**. Nodes in a linked list are stored in non-contiguous memory locations and are connected via pointers.

## Types of Linked Lists

1. **Singly Linked List:** Each node contains data and a reference to the next node.
2. **Doubly Linked List:** Each node contains data, a reference to the next node, and a reference to the previous node.

## Advantages
- **Dynamic structure:** Memory is allocated as needed.
- **Efficient insertion/deletion:** Operations like adding or removing nodes can be done in constant time, O(1), if the node reference is known.

## Disadvantages
- **Memory usage:** Additional pointers increase memory usage.
- **No random access:** Elements cannot be accessed directly by index.
- **Linear search time:** Searching elements takes O(n) time.

## Using `LinkedList` as Stack and Queue

Java's `LinkedList` class can function as both a **stack** and a **queue**, using methods adapted for each use case.

### Stack Methods
- `.push(Object x): void`: Adds an element to the stack.
- `.pop(): Object`: Removes and returns the top element.
- `.peek(): Object`: Returns the top element without removing it.

### Queue Methods
- `.offer(Object x): boolean`: Adds an item to the end of the queue.
- `.poll(): Object`: Removes and returns the head of the queue.
- `.peek(): Object`: Returns the head of the queue without removing it.

## Commonly Used Methods in `LinkedList`

| Method                            | Description                                            |
|-----------------------------------|--------------------------------------------------------|
| `.add(Object x): void`            | Adds an item to the end of the list.                   |
| `.add(int index, Object x): void` | Inserts an item at the specified index.                |
| `.remove(Object x): boolean`      | Removes the first occurrence of the specified item.    |
| `.indexOf(Object x): int`         | Returns the index of the first occurrence of the item. |
| `.peekFirst(): Object`            | Returns the head of the list without removing it.      |
| `.peekLast(): Object`             | Returns the tail of the list without removing it.      |
| `.addFirst(Object x): void`       | Adds an item to the start of the list.                 |
| `.addLast(Object x): void`        | Adds an item to the end of the list.                   |
| `.removeFirst(): Object`          | Removes and returns the head of the list.              |
| `.removeLast(): Object`           | Removes and returns the tail of the list.              |

## Code Example:
**Imports**:
```
import java.util.LinkedList;
```

**Code**:
```
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
```

**Output**:
```
--- STACK --- 
Popped Item: F
[D, C, B, A]
--- QUEUE --- 
First Item: A
[B, C, D, F]
After Adding 'E' to 3rd index: [B, C, D, E, F]
After Deleting 'E': [B, C, D, F]
Index of D: 2
Head of LinkedList: B
Tail of LinkedList: F
LinkedList with new head: [0, B, C, D, F]
LinkedList with new tail: [0, B, C, D, F, G]
Head: 0 / Tail: G
[B, C, D, F]
```
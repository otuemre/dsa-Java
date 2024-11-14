# LinkedList vs ArrayList Performance Comparison

This project demonstrates a performance comparison between `LinkedList` and `ArrayList` in Java. Both classes are part of the Java Collections Framework and implement the `List` interface, but they are optimized for different use cases. This code tests various operations and highlights the performance characteristics of each data structure.

## Overview

- **ArrayList**: Backed by a dynamic array. Provides fast element access by index (`O(1)`), but adding or removing elements at the beginning or middle is slower (`O(n)`) because elements need to be shifted.
- **LinkedList**: Backed by a doubly linked list. Provides constant time (`O(1)`) for adding or removing elements at the beginning or end but is slower (`O(n)`) for accessing elements by index because it requires traversing the list.

### Operations Compared
1. **Adding Elements**: Inserting 1,000,000 elements into each list.
2. **Accessing Elements by Index**: Testing access times for the first, middle, and last elements.
3. **Removing Elements**: Testing removal times for the first, middle, and last elements.

## Code Example

**Example Usage**:
```java
package DataStructures.arraylistVsLinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        // Adding 1,000,000 elements to both lists
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // ------------------ LinkedList ------------------
        startTime = System.nanoTime();

        // Getting First Element - Constant time (O(1))
        // linkedList.get(0); --> 15600ns (requires traversing the list in LinkedList)

        // Getting Element in the Middle - Linear time (O(n))
        // linkedList.get(500000); --> 4440300ns (LinkedList must traverse to the middle)

        // Getting the Last Element - Constant time (O(1)) because LinkedList maintains both head and tail pointers
        // linkedList.get(999999); --> 16800ns

        // Removing the First Element - Constant time (O(1)) in LinkedList
        // linkedList.remove(0); --> 24300ns

        // Removing Element in the Middle - Linear time (O(n)) because LinkedList must traverse to find the element
        // linkedList.remove(500000); --> 4560600ns

        // Removing the Last Element - Constant time (O(1)) for LinkedList
        linkedList.remove(999999); // --> 19800ns

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        // ------------------ ArrayList -------------------
        startTime = System.nanoTime();

        // Getting First Element - Constant time (O(1)) for ArrayList
        // arrayList.get(0); --> 3800ns

        // Getting Element in the Middle - Constant time (O(1)) for ArrayList (since it's backed by an array)
        // arrayList.get(500000); --> 4500ns

        // Getting the Last Element - Constant time (O(1))
        // arrayList.get(999999); --> 3300ns

        // Removing the First Element - Linear time (O(n)) for ArrayList because all elements need to be shifted
        // arrayList.remove(0); --> 476600ns

        // Removing Element in the Middle - Linear time (O(n)) for ArrayList, needs to shift the remaining elements
        // arrayList.remove(500000); --> 242800ns

        // Removing the Last Element - Constant time (O(1)) for ArrayList, no shifting needed
        arrayList.remove(999999); // --> 7200ns

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}
```

**Output**:
```
LinkedList:	19800 ns
ArrayList:	7200 ns
```

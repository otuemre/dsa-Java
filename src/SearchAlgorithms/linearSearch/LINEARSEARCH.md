# Linear Search

This project demonstrates the **linear search** algorithm in Java, which involves searching through each element in a collection to find a target value. This approach is straightforward but may be inefficient for large datasets.

## Overview of Linear Search

**Linear Search** iterates through a collection one element at a time, comparing each element to the target. If it finds a match, it returns the index of that element; otherwise, it returns `-1`, indicating that the element is not present in the collection.

### Time Complexity

- **Worst-case Time Complexity**: `O(n)`, where `n` is the number of elements in the array.
- **Best-case Time Complexity**: `O(1)`, when the target element is the first item.
- **Space Complexity**: `O(1)` as it requires a constant amount of extra space.

## Advantages and Disadvantages

### Advantages

- **Simple Implementation**: Linear search is easy to implement and understand.
- **Unsorted Data**: It works on both sorted and unsorted collections.
- **No Random Access Requirement**: Suitable for data structures that do not support random access (e.g., LinkedList).

### Disadvantages

- **Inefficient for Large Datasets**: Linear search is slow for large collections due to its `O(n)` time complexity.
- **Not Optimal for Repeated Searches**: More efficient algorithms, such as binary search, are better suited when repeatedly searching sorted data.

## Code Example

**LinearSearch Function**:
```java
// Linear Search Method with Linear Time Complexity --> O(n)
public static int linearSearch(int[] arr, int element) {
    // Traverse each element in the array
    for (int i = 0; i < arr.length; i++) {
        // If the target element is found, return its index
        if (element == arr[i]) {
            return i;
        }
    }

    // Return -1 if the element is not found in the array
    return -1;
}
```

**Example Usage**:
```java
package SearchAlgorithms.interpolationSearch;

public class Main {

    public static void main(String[] args) {
        // Creating an array of integers for the best-case scenario (uniformly distributed)
        int[] bestCaseArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Finding the index of a specific element in the best-case scenario
        int bestCaseIndex = interpolationSearch(bestCaseArray, 8);

        if (bestCaseIndex != -1) {
            System.out.println("Target found at index: " + bestCaseIndex);
        } else {
            System.out.println("Target not found!");
        }

        System.out.println();

        // Creating an array of integers for the worst-case scenario (non-uniform distribution)
        int[] worstCaseArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        // Finding the index of a specific element in the worst-case scenario
        int worstCaseIndex = interpolationSearch(worstCaseArray, 256);

        if (worstCaseIndex != -1) {
            System.out.println("Target found at index: " + worstCaseIndex);
        } else {
            System.out.println("Target not found!");
        }
    }
}
```

**Output**:
```
Element found at index: 1
```
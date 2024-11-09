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
```
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

**Code**:
```
// Creating an array of integers (unsorted)
int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};

// Finding the index of an element (e.g., 1)
int index = linearSearch(arr, 1);

if (index != -1) {
    System.out.println("Element found at index: " + index);
} else {
    System.out.println("Element not found!");
}
```

**Output**:
```
Element found at index: 1
```
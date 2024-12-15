# Quick Sort in Java

**Quick Sort** is a divide-and-conquer algorithm that partitions an array around a pivot element, recursively sorts the left and right partitions, and combines them to produce a sorted array.

---

### Key Points

- **Efficient for Large Datasets**: Quick Sort is faster than many other sorting algorithms for large datasets, especially with randomized pivot selection.
- **Unstable Sorting**: Quick Sort does not preserve the relative order of equal elements.
- **Divide and Conquer**: Partitions the array and recursively sorts the partitions.

---

### Time Complexity

- **Best Case**: `O(n log n)` - When the pivot divides the array into two roughly equal parts.
- **Average Case**: `O(n log n)` - Most random inputs lead to this performance.
- **Worst Case**: `O(n^2)` - Happens when the pivot consistently results in highly unbalanced partitions (e.g., already sorted arrays).

### Space Complexity

- **O(log n)** - Due to the recursion stack.

---

## Java Code

**Quick Sort Algorithm**:
```java
private static void quickSort(int[] array, int start, int end) {
    if (end <= start) return; // Base Case: Single element or invalid range

    int pivot = partition(array, start, end); // Partition around the pivot
    quickSort(array, start, pivot - 1); // Sort left partition
    quickSort(array, pivot + 1, end);  // Sort right partition
}

private static int partition(int[] array, int start, int end) {
    int pivot = array[end]; // Choose the last element as the pivot
    int partitionIndex = start - 1; // Track the smaller elements

    for (int currentIndex = start; currentIndex <= end - 1; currentIndex++) {
        if (array[currentIndex] < pivot) {
            partitionIndex++;
            swap(array, partitionIndex, currentIndex);
        }
    }

    // Swap the pivot element to its correct position
    swap(array, partitionIndex + 1, end);
    return partitionIndex + 1;
}

private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}
```

**Code Example**:
```java
public class Main {

    public static void main(String[] args) {
        // Create an array of integers
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        // Quick Sort the array
        quickSort(array, 0, array.length - 1);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Add a newline for cleaner output
    }
}
```

**Output**:
```
Sorted Array:
1 2 3 4 5 6 7 8 9 
```
# Bubble Sort in Java

**Bubble Sort** repeatedly compares and swaps adjacent elements if they are out of order. After each full pass through the array, the largest unsorted element is moved to its correct position at the end, creating a "bubble" effect as the largest elements accumulate at the end of the array.

### Key Points

- **Best for Small Datasets**: Bubble Sort is simple and can be useful for small datasets.
- **Inefficient for Large Datasets**: Due to its `O(n^2)` time complexity, Bubble Sort is slow on large datasets.
- **Ascending/Descending Order**: By default, this implementation sorts in ascending order. Changing the comparison operator (`>`) to `<` will sort in descending order.

### Time Complexity

- **Average Case**: `O(n^2)`
- **Worst Case**: `O(n^2)` due to nested loops iterating over the array.
- **Best Case**: `O(n)` if the array is already sorted, though this implementation doesn't have an optimization to stop early.

## Java Code

**Bubble Sort Algorithm**:
```java
private static void bubbleSort(int[] array) {

    // Outer loop for each pass
    for (int i = 0; i < array.length; i++) {

        // Inner loop for comparing adjacent elements
        for (int j = 0; j < array.length - i - 1; j++) {
            
            // Change > to < for descending order sorting
            if (array[j] > array[j + 1]) {
                // Swapping elements if they are in the wrong order
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}
```

**Example Usage**:
```java
package SortAlgorithms.bubbleSort;

public class Main {

    public static void main(String[] args) {
        // Creating an array of integers
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        // Sorting the array with bubbleSort() --> O(n^2)
        bubbleSort(array);

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
```

**Output**:
```
Sorted Array:
1 2 3 4 5 6 7 8 9 
```
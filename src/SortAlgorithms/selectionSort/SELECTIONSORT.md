# Selection Sort in Java

**Selection Sort** repeatedly finds the minimum element from the unsorted part of the array and swaps it with the element at the beginning of the unsorted section. This process continues until the entire array is sorted.

### Key Points

- **Best for Small Datasets**: Selection Sort is simple and works well on small datasets.
- **Inefficient for Large Datasets**: Due to its `O(n^2)` time complexity, Selection Sort is generally too slow for large arrays.
- **Ascending/Descending Order**: This implementation sorts in ascending order by default. Changing the comparison operator (`>`) to `<` will sort in descending order.

### Time Complexity

- **Average Case**: `O(n^2)`
- **Worst Case**: `O(n^2)` due to the nested loops, making it inefficient for larger datasets.
- **Best Case**: `O(n^2)` as Selection Sort does not optimize for already sorted arrays.

## Java Code

**Selection Sort Algorithm**:
```java
private static void selectionSort(int[] array) {

    for (int i = 0; i < array.length - 1; i++) {
        int min = i;

        // Finding the minimum element in the unsorted part of the array
        for (int j = i + 1; j < array.length; j++) {
            // Change > to < for descending order sorting
            if (array[min] > array[j]) {
                min = j;
            }
        }

        // Swapping the minimum element with the first unsorted element
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}
```

**Code Example**:
```java
package SortAlgorithms.selectionSort;

public class Main {
    
    public static void main(String[] args) {

        // Initializing an array of integers
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        // Sorting the array using selectionSort()
        selectionSort(array);

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int x : array) {
            System.out.print(x + " ");
        }
        
    }
}
```

**Output**:
```
Array:
1 2 3 4 5 6 7 8 9 
```
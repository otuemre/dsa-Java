# Insertion Sort in Java

**Insertion Sort** builds the sorted portion of the array one element at a time. For each iteration, it compares the current element to its left and shifts larger elements to the right to make room for the current element.

### Key Points

- **Best for Small Datasets**: Insertion Sort is simple and efficient for small or nearly sorted datasets.
- **Inefficient for Large Datasets**: Due to its `O(n^2)` time complexity in the average and worst cases, it is not suitable for large arrays.
- **Best Case Scenario**: Performs in `O(n)` when the array is already sorted, making it faster than Selection Sort in such cases.
- **Ascending/Descending Order**: This implementation sorts in ascending order by default. Changing the comparison operator (`>`) to `<` will sort in descending order.

### Time Complexity

- **Average Case**: `O(n^2)`
- **Worst Case**: `O(n^2)` due to nested operations when the array is sorted in reverse order.
- **Best Case**: `O(n)` when the array is already sorted.

## Java Code

**Insertion Sort Algorithm**:
```java
private static void insertionSort(int[] array) {

    for (int i = 1; i < array.length; i++) {
        int temp = array[i];
        int j = i - 1;

        // Shifting elements to the right to make room for the current element
        while (j >= 0 && array[j] > temp) {
            array[j + 1] = array[j];
            j--;
        }

        // Inserting the current element in its correct position
        array[j + 1] = temp;
    }
}
```

**Code Example**:
```java
public class Main {

    public static void main(String[] args) {

        // Initializing an array of integers
        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        // Sorting the array using insertionSort()
        insertionSort(array);

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
Sorted Array:
1 2 3 4 5 6 7 8 9
```
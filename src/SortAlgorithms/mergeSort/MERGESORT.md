# Merge Sort in Java

**Merge Sort** is a divide-and-conquer algorithm that recursively divides an array into two halves, sorts each half, and merges them back together in sorted order. This process continues until the entire array is sorted.

### Key Points

- **Efficient Sorting**: Merge Sort consistently performs better than algorithms like Selection Sort for large datasets due to its `O(n log n)` time complexity.
- **Stable Sorting**: Maintains the relative order of equal elements.
- **Divide and Conquer**: Splits the array recursively until single-element arrays are reached, then merges them in sorted order.

### Time Complexity

- **Average Case**: `O(n log n)`
- **Worst Case**: `O(n log n)` due to the recursive nature of dividing and merging.
- **Best Case**: `O(n log n)` as Merge Sort processes all elements regardless of their initial order.

### Space Complexity

- **Linear Space**: `O(n)` due to the temporary arrays used during the merge process.

## Java Code

**Merge Sort Algorithm**:
```java
private static void mergeSort(int[] array) {
    int length = array.length;
    if (length <= 1) return;

    int middle = length / 2;
    int[] leftArray = new int[middle];
    int[] rightArray = new int[length - middle];

    for (int i = 0; i < length; i++) {
        if (i < middle) {
            leftArray[i] = array[i];
        } else {
            rightArray[i - middle] = array[i];
        }
    }

    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, array);
}

private static void merge(int[] leftArray, int[] rightArray, int[] array) {
    int leftSize = leftArray.length;
    int rightSize = rightArray.length;

    int i = 0, leftIndex = 0, rightIndex = 0;

    while (leftIndex < leftSize && rightIndex < rightSize) {
        if (leftArray[leftIndex] <= rightArray[rightIndex]) {
            array[i++] = leftArray[leftIndex++];
        } else {
            array[i++] = rightArray[rightIndex++];
        }
    }

    while (leftIndex < leftSize) {
        array[i++] = leftArray[leftIndex++];
    }

    while (rightIndex < rightSize) {
        array[i++] = rightArray[rightIndex++];
    }
}
```

**Code Example**:
```java
public class Main {

    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

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
1 2 3 4 5 6 7 8 
```
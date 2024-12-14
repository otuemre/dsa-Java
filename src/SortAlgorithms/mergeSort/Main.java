package SortAlgorithms.mergeSort;

public class Main {

    /*
     * Merge Sort
     *
     * - Merge Sort is a divide-and-conquer algorithm that recursively divides an array into two halves,
     *   sorts each half, and then merges them back together in sorted order.
     *
     * - Time Complexity: O(n log n)
     *   - Merge Sort consistently has quasilinear time complexity, making it efficient for large datasets.
     * - Space Complexity: O(n)
     *   - Requires additional space for temporary arrays during the merge step.
     */

    public static void main(String[] args) {
        // Create an array of integers
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        // Merge sort the array
        mergeSort(array);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Recursive merge sort function
    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; // Base case: already sorted

        // Split array into two halves
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        // Populate the left and right arrays
        for (int i = 0; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[i - middle] = array[i];
            }
        }

        // Recursively sort both halves
        mergeSort(leftArray);
        mergeSort(rightArray);

        // Merge the sorted halves back into the original array
        merge(leftArray, rightArray, array);
    }

    // Merge two sorted arrays into one
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0, leftIndex = 0, rightIndex = 0;

        // Merge elements from both arrays in sorted order
        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[i++] = leftArray[leftIndex++];
            } else {
                array[i++] = rightArray[rightIndex++];
            }
        }

        // Append any remaining elements from the left array
        while (leftIndex < leftSize) {
            array[i++] = leftArray[leftIndex++];
        }

        // Append any remaining elements from the right array
        while (rightIndex < rightSize) {
            array[i++] = rightArray[rightIndex++];
        }
    }
}
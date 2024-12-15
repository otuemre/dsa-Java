package SortAlgorithms.quickSort;

public class Main {

    /*
     * Quick Sort
     *
     * - Moves smaller elements to the left of a pivot
     * - Recursively divides the array into two partitions
     *
     * Run Time Complexity:
     * - Best Case: O(n log(n)) when the pivot divides the array evenly
     * - Average Case: O(n log(n)) for most random inputs
     * - Worst Case: O(n^2) if the pivot consistently results in highly unbalanced partitions (e.g., already sorted arrays)
     *
     * Space Complexity:
     * - O(log(n)) due to recursion stack usage
     *
     * Note:
     * - Quick Sort is an **unstable** sorting algorithm.
     * - Randomizing the pivot or using median-of-three pivot selection reduces the likelihood of the worst case.
     */

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

    // Helper method for swapping elements
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
package SortAlgorithms.insertionSort;

public class Main {

    /*
     * Insertion Sort
     *
     * - Insertion Sort iterates through an array, comparing each element with those on its left.
     * - It shifts larger elements one position to the right to make room for the current element.
     * - The algorithm builds a sorted section of the array incrementally from left to right.
     *
     * - Time complexity: O(n^2) due to nested operations, making it inefficient for large datasets.
     * - Best case time complexity is O(n) when the array is already sorted.
     * - It performs better than Selection Sort in the best case scenario.
     */

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
}
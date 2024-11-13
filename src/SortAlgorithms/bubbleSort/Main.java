package SortAlgorithms.bubbleSort;

public class Main {

    /*
     * Bubble Sort --> O(n^2)
     *
     * - Bubble Sort repeatedly compares and swaps adjacent elements if they are in the wrong order.
     * - Each iteration "bubbles" the largest unsorted element to the right end of the array.
     * - Time Complexity: O(n^2) due to nested loops, making it inefficient for large datasets.
     *
     * Pros:
     * - Simple to implement and understand.
     * - Useful for small datasets.
     *
     * Cons:
     * - Very slow for large datasets.
     * - Generally considered inefficient.
     */

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
}

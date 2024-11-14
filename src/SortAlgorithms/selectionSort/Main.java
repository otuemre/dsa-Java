package SortAlgorithms.selectionSort;

public class Main {

    /*
     * Selection Sort
     *
     * - Selection Sort searches through an array and keeps track of the minimum value in each iteration.
     * - At the end of each iteration, it swaps the minimum element found with the first unsorted element.
     * - The algorithm gradually builds up the sorted section of the array from left to right.
     *
     * - Time complexity: O(n^2) due to nested loops, making it inefficient for large datasets.
     * - It performs well for small datasets but is slow for larger ones.
     */

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
}
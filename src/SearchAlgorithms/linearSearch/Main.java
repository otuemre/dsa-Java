package SearchAlgorithms.linearSearch;

public class Main {

    /*
     * Linear Search
     *
     * - Linear search involves iterating through a collection one element at a time until the target element is found.
     * - Time Complexity: O(n), where n is the number of elements in the array.
     *
     * Advantages:
     * - Fast for searches in small to medium datasets.
     * - Does not require a sorted collection.
     * - Suitable for data structures without random access (e.g., LinkedList).
     *
     * Disadvantages:
     * - Inefficient for large datasets due to linear time complexity.
     *
     */

    public static void main(String[] args) {

        // Creating an array of integers (unsorted)
        int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        // Finding the index of an element (e.g., 1)
        int index = linearSearch(arr, 1);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found!");
        }
    }

    // Linear Search Method with Linear Time Complexity --> O(n)
    public static int linearSearch(int[] arr, int element) {
        // Traverse each element in the array
        for (int i = 0; i < arr.length; i++) {
            // If the target element is found, return its index
            if (element == arr[i]) {
                return i;
            }
        }

        // Return -1 if the element is not found in the array
        return -1;
    }
}

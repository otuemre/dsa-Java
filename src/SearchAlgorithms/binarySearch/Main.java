package SearchAlgorithms.binarySearch;

// import java.util.Arrays;

public class Main {

    /*
     * Binary Search
     *
     * - It finds the position of a target value within a sorted array.
     * - Half of the array is eliminated during each "step".
     * - Run Time Complexity of O(log n)
     * - Binary search performs better for big arrays
     *
     * NOTE: Binary Search only works on SORTED ARRAYS.
     */

    public static void main(String[] args) {

        // Creating the array
        int[] array = new int[1000000]; //20

        // Creating the target value
        int target = 1;

        // Initializing values for array
        for(int i=0; i<array.length; i++) {
            array[i] = i;
        }

        // There is a built-in Binary Search algorithm --> Arrays.binarySearch()
        // int index = Arrays.binarySearch(array, target);

        // Using our Binary Search algorithm --> O(log n)
        int index = binarySearch(array, target); // 20 steps --> 2**20 = 1048576

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found!");
        }

    }

    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            // Getting the middle value
            int middle = low + (high - low) / 2;
            int val = arr[middle];

            System.out.println("Middle: " + val);

            // Checking if middle element is the target
            if (target == val) {
                return middle; // Target found
            }
            // If target is greater, ignore the left half
            else if (target > val) {
                low = middle + 1;
            }
            // If target is smaller, ignore the right half
            else {
                high = middle - 1;
            }

        }

        return -1; // If target not found
    }
}

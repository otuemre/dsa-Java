package SearchAlgorithms.interpolationSearch;

public class Main {

    /*
     * Interpolation Search
     *
     * - An improvement over Binary Search, best used for "uniformly" distributed data.
     * - "Guesses" the position of the target based on calculated probe result.
     * - If the probe is incorrect, the search area is narrowed, and a new probe is calculated.
     *
     * Time Complexity:
     * - Average Case: O(log(log(n))) for uniformly distributed data
     * - Worst Case: O(n), particularly when data is non-uniform (e.g., exponential growth)
     *
     * NOTE: It only works on SORTED array!
     */

    public static void main(String[] args) {
        // Creating an array of integers for the best-case scenario (uniformly distributed)
        int[] bestCaseArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Finding the index of a specific element in the best-case scenario
        int bestCaseIndex = interpolationSearch(bestCaseArray, 8);

        if (bestCaseIndex != -1) {
            System.out.println("Target found at index: " + bestCaseIndex);
        } else {
            System.out.println("Target not found!");
        }

        System.out.println();

        // Creating an array of integers for the worst-case scenario (non-uniform distribution)
        int[] worstCaseArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        // Finding the index of a specific element in the worst-case scenario
        int worstCaseIndex = interpolationSearch(worstCaseArray, 256);

        if (worstCaseIndex != -1) {
            System.out.println("Target found at index: " + worstCaseIndex);
        } else {
            System.out.println("Target not found!");
        }
    }

    public static int interpolationSearch(int[] array, int target) {

        int high = array.length - 1;
        int low = 0;

        while (target >= array[low] && target <= array[high] && low <= high) {

            // Calculate the "probe" position based on the position of the target relative to low and high
            int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);
            System.out.println("Probe: " + probe);

            // Check if the target is found
            if (array[probe] == target) {
                return probe;
            }
            // If target is larger, search the upper half
            else if (array[probe] < target) {
                low = probe + 1;
            }
            // If target is smaller, search the lower half
            else {
                high = probe - 1;
            }
        }

        return -1; // Target not found
    }
}

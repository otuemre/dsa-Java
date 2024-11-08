package bigO;

public class Main {

    /*
     * Big O Notation:
     *
     * - "How code slows as data grows"
     * 1. Describes the performance of an algorithm as the amount of data increases.
     * 2. Machine-independent (focuses on the number of steps to completion, not execution time).
     * 3. Ignore constants in Big O (e.g., O(n + 1) becomes O(n)).
     *
     * - n = Amount of data (used as a variable).
     *
     * - Common Time Complexities:
     *   - O(1) --> Constant Time
     *        * Example: Accessing an element in an array by index.
     *        * Example: Inserting at the beginning of a LinkedList.
     *
     *   - O(log n) --> Logarithmic Time
     *        * Example: Binary Search.
     *
     *   - O(n) --> Linear Time
     *        * Example: Looping through elements in an array.
     *        * Example: Searching through a LinkedList.
     *
     *   - O(n log n) --> Quasilinear Time
     *        * Example: Quicksort, Mergesort, Heapsort.
     *
     *   - O(n^2) --> Quadratic Time
     *        * Example: Bubble Sort, Insertion Sort, Selection Sort.
     *
     *   - O(n!) --> Factorial Time
     *        * Example: Brute-force solution for the Traveling Salesman Problem.
     */

    public static void main(String[] args) {
        long startTime, endTime, elapsedTime;

        // O(n) - Linear Time
        startTime = System.nanoTime();
        int linear = addUp(100000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Linear Time (O(n)): \tResult = " + linear + ", Time = " + elapsedTime + " ns");

        // O(1) - Constant Time
        startTime = System.nanoTime();
        int constant = addUp2(100000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Constant Time (O(1)): \tResult = " + constant + ", Time = " + elapsedTime + " ns");
    }

    // O(n) --> Linear Time
    public static int addUp(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    // O(1) --> Constant Time
    public static int addUp2(int n) {
        return n * (n + 1) / 2;
    }
}

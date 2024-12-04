package Recursion;

public class Main {

    /*
     * Recursion
     *
     * - Recursion occurs when a method calls itself to solve smaller instances of a problem.
     * - It is a common technique for solving problems by breaking them down into simpler sub-problems.
     * - Often used for mathematical problems, advanced sorting algorithms, and navigating data structures like trees.
     *
     * Advantages:
     * - Code is simpler and easier to read for certain problems.
     * - Can replace loops in many cases for elegance.
     *
     * Disadvantages:
     * - Recursive solutions can be slower due to overhead from function calls.
     * - Consumes more memory due to the call stack.
     * - Risk of `StackOverflowError` if recursion depth exceeds the stack limit.
     */

    public static void main(String[] args) {

        // Factorial Example
        int factorialResult = factorial(7); // Calculates 7!
        System.out.println("Factorial of 7: " + factorialResult);

        // Power Example
        int powerResult = power(2, 8); // Calculates 2^8
        System.out.println("2 raised to the power of 8: " + powerResult);
    }

    public static int factorial(int num) {
        if (num < 1) return 1; // Base case: factorial(0) = 1
        return num * factorial(num - 1); // Recursive call
    }

    public static int power(int base, int exponent) {
        if (exponent < 1) return 1; // Base case: base^0 = 1
        return base * power(base, exponent - 1); // Recursive call
    }
}
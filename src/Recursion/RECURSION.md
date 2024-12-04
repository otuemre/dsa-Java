# Recursion in Java

**Recursion** is a process where a method calls itself to solve a problem by breaking it into smaller sub-problems. It is a powerful technique often used in mathematical computations, advanced sorting algorithms, and navigating data structures like trees.

### Key Points

- **Definition**: Recursion involves a method that calls itself to solve smaller instances of the same problem.
- **Use Cases**:
    - Factorial calculations
    - Exponentiation (power)
    - Sorting algorithms (e.g., Merge Sort, Quick Sort)
    - Tree traversal
- **Advantages**:
    - Simplifies code for problems that have a recursive structure.
    - Easy to understand and write for many mathematical problems.
- **Disadvantages**:
    - Can lead to `StackOverflowError` if recursion depth is too high.
    - Slower than iteration due to function call overhead.
    - Consumes more memory because of the call stack.

### Time Complexity

- **Factorial**: `O(n)` for `factorial(n)` since it makes `n` recursive calls.
- **Power**: `O(n)` for `power(base, exponent)` since it makes `exponent` recursive calls.

## Java Code

**Recursion Algorithm**:
```java
public static int factorial(int num) {
    if (num < 1) return 1; // Base case: factorial(0) = 1
    return num * factorial(num - 1); // Recursive call
}

public static int power(int base, int exponent) {
    if (exponent < 1) return 1; // Base case: base^0 = 1
    return base * power(base, exponent - 1); // Recursive call
}
```

**Code Example**:
```java
public class Main {

    public static void main(String[] args) {

        // Factorial Example
        int factorialResult = factorial(7); // Calculates 7!
        System.out.println("Factorial of 7: " + factorialResult);

        // Power Example
        int powerResult = power(2, 8); // Calculates 2^8
        System.out.println("2 raised to the power of 8: " + powerResult);
    }
}
```

**Output**:
```
Factorial of 7: 5040
2 raised to the power of 8: 256
```
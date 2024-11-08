# Big O Notation in Java

This project demonstrates the concept of Big O notation, which is used to analyze and describe the efficiency of algorithms as the input size increases. Understanding Big O helps to optimize code performance, making it crucial for software development, especially as data sizes grow.

## What is Big O Notation?

Big O notation is a mathematical concept that describes how an algorithm's runtime or space requirements grow as the input size increases. Big O focuses on the **number of operations** or **steps** an algorithm needs to complete rather than exact execution time, making it machine-independent.

### Key Principles of Big O Notation

1. **Describes Algorithm Performance**: Big O tells us how the performance of an algorithm changes as the data size (usually denoted as `n`) grows.
2. **Focuses on Steps, Not Time**: Rather than measuring actual execution time, Big O counts the number of operations needed to complete an algorithm.
3. **Ignores Constants**: In Big O, constants and smaller terms are ignored to focus on the dominant factor affecting performance. For instance, `O(n + 1)` simplifies to `O(n)` because `n` is the primary factor affecting growth.

## Common Big O Complexities and Examples

### 1. **O(1) - Constant Time**
- **Description**: The runtime does not change with input size. Constant time operations occur in a single step, regardless of how large `n` is.
- **Example**: Accessing an element in an array by index or inserting at the beginning of a `LinkedList`.
- **Real-Life Analogy**: Looking up a word in a dictionary with a direct reference to its page number.

### 2. **O(log n) - Logarithmic Time**
- **Description**: As the input size `n` grows, the number of operations grows logarithmically, meaning each operation significantly reduces the remaining work.
- **Example**: Binary search, where each comparison cuts the dataset in half.
- **Real-Life Analogy**: Finding a word in a dictionary by repeatedly dividing the pages in half.

### 3. **O(n) - Linear Time**
- **Description**: The runtime increases linearly with the size of the input. For `n` elements, the algorithm performs `n` operations.
- **Example**: Iterating through an array or searching an unsorted `LinkedList`.
- **Real-Life Analogy**: Reading every page in a book from start to finish.

### 4. **O(n log n) - Quasilinear Time**
- **Description**: Often found in efficient sorting algorithms, `O(n log n)` grows faster than linear time but slower than quadratic time. It indicates that the algorithm repeatedly divides the dataset while performing linear work.
- **Example**: Sorting algorithms like Quicksort, Mergesort, or Heapsort.
- **Real-Life Analogy**: Sorting a deck of cards by repeatedly dividing it and sorting each section individually.

### 5. **O(n^2) - Quadratic Time**
- **Description**: The runtime grows proportionally to the square of the input size. This typically occurs with nested loops where each element is compared with every other element.
- **Example**: Simple sorting algorithms like Bubble Sort, Selection Sort, and Insertion Sort.
- **Real-Life Analogy**: Comparing each item on a to-do list with every other item to check for duplicates.

### 6. **O(n!) - Factorial Time**
- **Description**: The runtime grows factorial, meaning it becomes extremely slow as `n` increases. Factorial complexity is typically associated with algorithms that evaluate every possible permutation.
- **Example**: Brute-force solutions for the Traveling Salesman Problem.
- **Real-Life Analogy**: Trying every possible arrangement of guests at a dinner table to find the "best" seating arrangement.

| Complexity     | Big O        | Description                              | Example                     |
|----------------|--------------|------------------------------------------|-----------------------------|
| Constant Time  | `O(1)`       | Independent of input size                | Array access by index       |
| Logarithmic    | `O(log n)`   | Reduces data set by a fraction each step | Binary Search               |
| Linear Time    | `O(n)`       | Grows proportionally with input size     | Iterating through a list    |
| Quasilinear    | `O(n log n)` | Common in efficient sorting algorithms   | Quicksort, Mergesort        |
| Quadratic Time | `O(n^2)`     | Grows with the square of input size      | Bubble Sort, Selection Sort |
| Factorial Time | `O(n!)`      | Grows factorial, very slow for large `n` | Traveling Salesman Problem  |

## Code Example:

**Linear Time Function**:
```
// O(n) --> Linear Time
public static int addUp(int n) {
    int sum = 0;
    for(int i = 0; i < n; i++) {
        sum += i;
    }
    return sum;
}
```

**Constant Time Function**:
```
// O(1) --> Constant Time
public static int addUp2(int n) {
    return n * (n + 1) / 2;
}
```

**Code**:
```
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
```

**Output**:
```
Linear Time (O(n)): 	Result = 704982704, Time = 976600 ns
Constant Time (O(1)): 	Result = 705082704, Time = 1800 ns
```
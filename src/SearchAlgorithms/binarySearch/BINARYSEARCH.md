# Binary Search
**Binary Search** works by eliminating half of the search space with each step, making it significantly faster than linear search for large, sorted arrays. The time complexity of binary search is `O(log n)`.

### Key Points

- **Binary Search Only Works on Sorted Arrays**: Binary search assumes the array is sorted. It will not work on unsorted arrays.
- **Efficient for Large Arrays**: Binary search performs well on large datasets due to its logarithmic time complexity.
- **Steps to Execute Binary Search**:
    1. Find the middle element of the array.
    2. If the middle element matches the target, return its index.
    3. If the target is greater than the middle element, repeat the search on the right half.
    4. If the target is less than the middle element, repeat the search on the left half.

## Time Complexity

- **Worst-case Time Complexity**: `O(log n)` where `n` is the number of elements in the array.
- **Best-case Time Complexity**: `O(1)` if the middle element is the target.

## Code Example

**Binary Search Algorithm**:
```
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
```

**Code**:
```
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
```

**Output**:
```
Middle: 499999
Middle: 249999
Middle: 124999
Middle: 62499
Middle: 31249
Middle: 15624
Middle: 7811
Middle: 3905
Middle: 1952
Middle: 975
Middle: 487
Middle: 243
Middle: 121
Middle: 60
Middle: 29
Middle: 14
Middle: 6
Middle: 2
Middle: 0
Middle: 1
Target found at index: 1
```
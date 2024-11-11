# Interpolation Search in Java

**Interpolation Search** is an algorithm that finds the position of a target value within a sorted array by calculating a position estimate (probe) based on the values of the target and the current bounds. It is most efficient with uniformly distributed data.

### Key Points

- **Best for Uniformly Distributed Data**: Interpolation search performs well on data where values are uniformly spaced.
- **Sorted Array Requirement**: This algorithm requires a sorted array, as the probe calculation assumes an order among elements.
- **Probe Calculation**: The probe position is calculated based on the relative value of the target to the low and high bounds.

### Time Complexity

- **Average Case**: `O(log(log(n)))` for uniformly distributed data.
- **Worst Case**: `O(n)` for non-uniform data distributions, such as exponential growth.

## Code Example

**Interpolation Search Algorithm**:
```
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
```

**Code**:
```
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
```

**Output**:
```
Probe: 7
Target found at index: 7

Probe: 2
Probe: 4
Probe: 6
Probe: 7
Probe: 8
Target found at index: 8
```
package DataStructures.dynamicArrays;

public class Main {

    /*
     * Static Array vs Dynamic Array
     *
     * Static Array:
     * A fixed-size array that cannot change in size once created.
     *
     * Advantages:
     * - Accessing elements is quick because the size is fixed, allowing direct memory allocation.
     * - No extra memory overhead for resizing since the size is predefined.
     *
     * Disadvantages:
     * - The size cannot be changed at runtime, leading to wasted space or insufficient capacity.
     * - Not suitable for scenarios where the number of elements varies dynamically.
     *
     * Dynamic Array:
     * A resizable array that can grow or shrink at runtime, typically implemented with structures like ArrayList in Java.
     *   ** However, we created our own dynamic array.
     *
     * Advantages:
     * - Random access of elements O(1).
     * - Good locality of reference and data cache utilization.
     * - Easy to insert/delete at the end.
     *
     * Disadvantages:
     * - Wastes more memory.
     * - Shifting elements is time-consuming O(n).
     * - Expanding/Shrinking the array is time-consuming O(n).
     */

    /*
     * Methods of our dynamic array:
     *
     * .isEmpty(): boolean --> Returns if the array is empty or not.
     * .getSize(): int --> Returns the size of the array.
     * .getCapacity(): int --> Returns the capacity of the array.
     * .add(Object x): void --> Adds an element to the array.
     * .insert(int index, Object x): void --> Inserts the element at the given index of the array.
     * .delete(Object x): void --> Deletes the specified element from the array.
     * .search(Object x): int --> Returns the index of the specified element.
     * private .grow(): void --> Expands the array's capacity when size is greater than or equal to capacity.
     * private .shrink(): void --> Shrinks the array's capacity when size is one-third of capacity.
     */

    public static void main(String[] args) {
        // Creating an instance of our DynamicArray
        DynamicArray dynamicArray = new DynamicArray(5);

        // Adding elements to the dynamic array using .add()
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        // Checking if the array is empty or not using .isEmpty()
        System.out.println("Is Empty? " + dynamicArray.isEmpty()); // Expected output: false

        // Checking the size and the capacity of the array using .getSize() and .getCapacity()
        System.out.println("Size: " + dynamicArray.getSize() + " - Capacity: " + dynamicArray.getCapacity()); // Expected output: 3 - 5

        // Printing the array - .toString()
        System.out.println("Printing the dynamic array: " + dynamicArray); // Expected output: [A, B, C]

        // Inserting an element at the given index using .insert()
        dynamicArray.insert(0, "X");
        System.out.println("After inserting an element at index 0: " + dynamicArray); // Expected output: [X, A, B, C]

        // Deleting an element from the array using .delete()
        dynamicArray.delete("A");
        System.out.println("After deleting 'A': " + dynamicArray); // Expected output: [X, B, C]

        // Searching for an element inside the array using .search()
        int index = dynamicArray.search("C");
        System.out.println("Index of 'C': " + index); // Expected output: 2
        System.out.println("Index of a non-existing element 'Z': " + dynamicArray.search("Z")); // Expected output: -1

        // Expanding the array to grow capacity. It will grow when the size >= capacity!
        System.out.println("Size: " + dynamicArray.getSize() + " - Capacity: " + dynamicArray.getCapacity()); // Expected output: 3 - 5
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        System.out.println("Size: " + dynamicArray.getSize() +
                " - Capacity: " + dynamicArray.getCapacity()); // Expected output: 6 - 10

        // Deleting items to potentially shrink the capacity. It will shrink when size <= capacity / 3!
        dynamicArray.delete("F"); // Expected size and capacity: 5 - 10
        dynamicArray.delete("E"); // Expected size and capacity: 4 - 10
        dynamicArray.delete("D");
        System.out.println("Size: " + dynamicArray.getSize() +
                " - Capacity: " + dynamicArray.getCapacity()); // Expected output: 3 - 5
    }
}
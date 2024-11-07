# Dynamic Array Implementation in Java

This project implements a **Dynamic Array** in Java from scratch, demonstrating the differences between static and dynamic arrays, and providing methods to manage and interact with dynamic array elements.

## Static Array vs. Dynamic Array

### Static Array
A fixed-size array that cannot change in size once created.

**Advantages:**
- Quick element access due to fixed size, allowing direct memory allocation.
- No extra memory overhead for resizing since the size is predefined.

**Disadvantages:**
- The size cannot be changed at runtime, leading to wasted space or insufficient capacity.
- Not suitable for scenarios where the number of elements varies dynamically.

### Dynamic Array
A resizable array that can grow or shrink at runtime. This implementation creates a custom dynamic array, similar in functionality to Java’s `ArrayList`.

**Advantages:**
- Random access of elements with O(1) complexity.
- Good locality of reference and data cache utilization.
- Easy to insert/delete at the end.

**Disadvantages:**
- Wastes more memory due to over-allocation.
- Shifting elements is time-consuming, with O(n) complexity.
- Expanding/shrinking the array is also time-consuming, with O(n) complexity.

## Dynamic Array Methods

| Method                        | Return Type | Description                                                                                       |
|-------------------------------|-------------|---------------------------------------------------------------------------------------------------|
| `isEmpty()`                   | `boolean`   | Returns if the array is empty or not.                                                             |
| `getSize()`                   | `int`       | Returns the current size of the array.                                                            |
| `getCapacity()`               | `int`       | Returns the current capacity of the array.                                                        |
| `add(Object x)`               | `void`      | Adds an element to the end of the array.                                                          |
| `insert(int index, Object x)` | `void`      | Inserts an element at the specified index in the array.                                           |
| `delete(Object x)`            | `void`      | Deletes the specified element from the array.                                                     |
| `search(Object x)`            | `int`       | Returns the index of the specified element, or `-1` if not found.                                 |
| `grow()`                      | `void`      | Expands the array's capacity when the size exceeds the current capacity (private method).         |
| `shrink()`                    | `void`      | Shrinks the array's capacity when the size is one-third of the current capacity (private method). |

## Code Example

**DynamicArray Class**:
```
package dynamicArrays;

public class DynamicArray {
    private int size;
    private int capacity = 10;
    private Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data) {

        if(size >= capacity) {
            grow();
        }

        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {

        if(size >= capacity) {
            grow();
        }

        for(int i=size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = data;
        size++;

    }

    public void delete(Object data) {

        for(int i=0; i<size; i++) {
            if (array[i] == data) {
                for (int j=0; j < (size - i - 1); i++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;

                if (size <= (int) (capacity/3)) {
                    shrink();
                }

                break;
            }
        }
    }

    public int search(Object data) {

        for(int i=0; i<size; i++) {
            if(array[i] == data) {
                return i;
            }
        }

        return -1;
    }

    private void grow() {

        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];

        for(int i=0; i<size; i++) {
            newArray[i] = array[i];
        }

        capacity = newCapacity;
        array = newArray;

    }

    private void shrink() {

        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i=0; i<size; i++) {
            newArray[i] = array[i];
        }

        capacity = newCapacity;
        array = newArray;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {

        StringBuilder str = new StringBuilder();
        for(int i=0; i < size; i++) {
            str.append(array[i]).append(", ");
        }

        if (!str.isEmpty()) {
            str = new StringBuilder("[" + str.substring(0, str.length() - 2) + "]");
        } else {
            str = new StringBuilder("[]");
        }

        return str.toString();
    }
}
```

**Main Class**:
```
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
```

**Output**:
```
Is Empty? false
Size: 3 - Capacity: 5
Printing the dynamic array: [A, B, C]
After inserting an element at index 0: [X, A, B, C]
After deleting 'A': [X, B, C]
Index of 'C': 2
Index of a non-existing element 'Z': -1
Size: 3 - Capacity: 5
Size: 6 - Capacity: 10
Size: 3 - Capacity: 5
```
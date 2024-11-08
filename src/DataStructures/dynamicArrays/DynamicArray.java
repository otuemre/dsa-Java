package DataStructures.dynamicArrays;

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

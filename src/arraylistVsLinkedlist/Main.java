package arraylistVsLinkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    /*
     * LinkedList vs ArrayList
     *
     * LinkedList and ArrayList are both part of the Java Collections Framework and implement the List interface.
     * However, they have different internal structures and performance characteristics, making them suitable for different use cases.
     *
     * - ArrayList is backed by a dynamic array. It provides fast access to elements by index (O(1)) but is slower when it comes to adding or removing elements
     *   at the beginning or in the middle (O(n)) due to the need to shift elements.
     * - LinkedList, on the other hand, is backed by a doubly linked list. It offers constant time (O(1)) for adding or removing elements at the
     *   beginning or end of the list but is slower for accessing elements by index (O(n)), as it needs to traverse the list.
     *
     * In this code, we compare the performance of both List implementations when performing various operations:
     * - Adding elements
     * - Accessing elements by index (first, middle, last)
     * - Removing elements (first, middle, last)
     */

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        // Adding 1,000,000 elements to both lists
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // ------------------ LinkedList ------------------
        startTime = System.nanoTime();

        // Getting First Element - Constant time (O(1))
        // linkedList.get(0); --> 15600ns (requires traversing the list in LinkedList)

        // Getting Element in the Middle - Linear time (O(n))
        // linkedList.get(500000); --> 4440300ns (LinkedList must traverse to the middle)

        // Getting the Last Element - Constant time (O(1)) because LinkedList maintains both head and tail pointers
        // linkedList.get(999999); --> 16800ns

        // Removing the First Element - Constant time (O(1)) in LinkedList
        // linkedList.remove(0); --> 24300ns

        // Removing Element in the Middle - Linear time (O(n)) because LinkedList must traverse to find the element
        // linkedList.remove(500000); --> 4560600ns

        // Removing the Last Element - Constant time (O(1)) for LinkedList
        linkedList.remove(999999); // --> 19800ns

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        // ------------------ ArrayList -------------------
        startTime = System.nanoTime();

        // Getting First Element - Constant time (O(1)) for ArrayList
        // arrayList.get(0); --> 3800ns

        // Getting Element in the Middle - Constant time (O(1)) for ArrayList (since it's backed by an array)
        // arrayList.get(500000); --> 4500ns

        // Getting the Last Element - Constant time (O(1))
        // arrayList.get(999999); --> 3300ns

        // Removing the First Element - Linear time (O(n)) for ArrayList because all elements need to be shifted
        // arrayList.remove(0); --> 476600ns

        // Removing Element in the Middle - Linear time (O(n)) for ArrayList, needs to shift the remaining elements
        // arrayList.remove(500000); --> 242800ns

        // Removing the Last Element - Constant time (O(1)) for ArrayList, no shifting needed
        arrayList.remove(999999); // --> 7200ns

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + " ns");

    }
}

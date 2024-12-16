package DataStructures.hashTables;

import java.util.Hashtable;

public class Main {

    /*
     * What is a Hashtable?
     *
     * - A data structure that stores unique keys mapped to values. Example: <Integer, String>
     * - Each key/value pair is known as an Entry.
     * - FAST insertion, lookup, and deletion of key/value pairs.
     * - Ideal for large datasets but not efficient for small datasets.
     *
     * Hashing:
     * - A process that takes a key and computes an integer (hash).
     * - Hashtable calculates the index as: key.hashCode() % capacity.
     *
     * Bucket:
     * - An indexed storage location for one or more Entries.
     * - It stores multiple entries in case of collision (similar to a LinkedList).
     *
     * Collision:
     * - Occurs when two keys generate the same index.
     * - Fewer collisions = More efficient hashtable.
     *
     * Run Time Complexity:
     * - Best Case: O(1)
     * - Worst Case: O(n) in case of many collisions.
     *
     */

    /*
     * Methods of Hashtable:
     *
     * .put(Key, Value): void     --> Inserts a key/value pair into the hashtable.
     * .remove(Key): void         --> Removes the key/value pair associated with the key.
     * .get(Key): Value           --> Retrieves the value associated with the given key.
     * .containsKey(Key): boolean --> Checks if the key exists in the hashtable.
     * .containsValue(Value): boolean --> Checks if the value exists in the hashtable.
     * .keySet(): Set<Key>        --> Returns all the keys in the hashtable as a Set.
     *
     * *** Note: Hashtable does NOT allow null keys or null values.
     */

    public static void main(String[] args) {
        // Example 1: Hashtable with Integer keys and String values
        Hashtable<Integer, String> table = new Hashtable<>();

        // Adding entries to the hashtable using .put()
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Garry");

        // Removing an entry with .remove()
        table.remove(777);

        // Displaying the contents of the hashtable
        System.out.println("Integer-Key Hashtable:");
        for (Integer key : table.keySet()) {
            System.out.println("Index: " + (key.hashCode() % 10) + "\tKey: " + key + "\tValue: " + table.get(key));
        }
        System.out.println();

        // Example 2: Hashtable with String keys and String values
        Hashtable<String, String> table1 = new Hashtable<>();

        // Adding entries to the hashtable
        table1.put("100", "Spongebob");
        table1.put("123", "Patrick");
        table1.put("321", "Sandy");
        table1.put("555", "Squidward");
        table1.put("777", "Garry");

        // Removing an entry
        table1.remove("777");

        // Displaying the contents of the hashtable
        System.out.println("String-Key Hashtable:");
        for (String key : table1.keySet()) {
            System.out.println("Index: " + (key.hashCode() % 10) + "\tKey: " + key + "\tValue: " + table1.get(key));
        }
    }
}
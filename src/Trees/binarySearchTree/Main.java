package Trees.binarySearchTree;

public class Main {

    /*
     * Binary Search Tree (BST)
     *
     * - Binary Tree: A tree structure where each node has at most 2 child nodes (left and right).
     * - Binary Search Tree: A specialized binary tree where:
     *      - Left subtree contains values smaller than the parent node.
     *      - Right subtree contains values larger than the parent node.
     * - Properties of BST:
     *      - Efficient searching, insertion, and deletion (average case: O(log n)).
     *      - Traversal methods (in-order, pre-order, post-order) can be used to retrieve elements in a specific order.
     */

    public static void main(String[] args) {

        // Create an instance of BinarySearchTree
        BinarySearchTree tree = new BinarySearchTree();

        // Insert nodes into the BST
        System.out.println("Inserting nodes into the Binary Search Tree...");
        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        // Attempt to remove a non-existent value (0)
        System.out.println("\nAttempting to remove value 0 (non-existent)...");
        tree.remove(0);

        // Attempt to remove an existent value (1)
        System.out.println("\nAttempting to remove value 1...");
        tree.remove(1);

        // Display the BST in ascending order (in-order traversal)
        System.out.println("\nDisplaying the Binary Search Tree (In-Order Traversal):");
        tree.display();

        // Search for a value in the BST
        System.out.println("\nSearching for value 10 in the Binary Search Tree...");
        boolean isFound = tree.search(10);
        System.out.println("Is value 10 found? " + isFound);

        System.out.println("\nSearching for value 9 in the Binary Search Tree...");
        isFound = tree.search(9);
        System.out.println("Is value 9 found? " + isFound);
    }
}
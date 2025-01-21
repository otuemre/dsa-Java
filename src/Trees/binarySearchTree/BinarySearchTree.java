package Trees.binarySearchTree;

public class BinarySearchTree {

    Node root; // Root of the Binary Search Tree

    // Insert a node into the Binary Search Tree
    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    // Recursive helper method for inserting a node
    private Node insertHelper(Node root, Node node) {
        int data = node.data;

        // If the current root is null, place the node here
        if (root == null) {
            root = node;
            return root;
        }
        // Traverse the left subtree for smaller values
        else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        }
        // Traverse the right subtree for larger values
        else {
            root.right = insertHelper(root.right, node);
        }

        return root; // Return the updated root after insertion
    }

    // Display all nodes in ascending order
    public void display() {
        displayHelper(root);
    }

    // Recursive helper method to display the tree (in-order traversal)
    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left); // Visit left subtree
            System.out.println(root.data); // Print the node's data
            displayHelper(root.right); // Visit right subtree
        }
    }

    // Search for a value in the Binary Search Tree
    public boolean search(int data) {
        return searchHelper(root, data);
    }

    // Recursive helper method for searching a value
    private boolean searchHelper(Node root, int data) {
        // If root is null, the value is not found
        if (root == null) {
            return false;
        }
        // If the current node's data matches, return true
        else if (root.data == data) {
            return true;
        }
        // Traverse the left subtree for smaller values
        else if (data < root.data) {
            return searchHelper(root.left, data);
        }
        // Traverse the right subtree for larger values
        else {
            return searchHelper(root.right, data);
        }
    }

    // Remove a node with the specified value
    public void remove(int data) {
        if (search(data)) { // Only attempt removal if the value exists
            root = removeHelper(root, data);
        } else {
            System.out.println(data + " could not be found!");
        }
    }

    // Recursive helper method for removing a node
    private Node removeHelper(Node root, int data) {
        // If root is null, nothing to remove
        if (root == null) {
            return root;
        }
        // Traverse left for smaller values
        else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        // Traverse right for larger values
        else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        }
        // Node to be removed is found
        else {
            // Handle the case of a leaf node
            if (root.left == null && root.right == null) {
                root = null;
            }
            // Find the in-order successor if right subtree exists
            else if (root.right != null) {
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            // Find the in-order predecessor if left subtree exists
            else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }

        return root; // Return the updated root after removal
    }

    // Find the smallest value in the right subtree
    private int successor(Node root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Find the largest value in the left subtree
    private int predecessor(Node root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}
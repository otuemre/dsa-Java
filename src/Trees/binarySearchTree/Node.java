package Trees.binarySearchTree;

public class Node {

    int data; // The value stored in the node
    Node left; // Pointer to the left child node (smaller values)
    Node right; // Pointer to the right child node (larger values)

    public Node(int data) {
        this.data = data; // Assign the given value to the node's data field
    }
}
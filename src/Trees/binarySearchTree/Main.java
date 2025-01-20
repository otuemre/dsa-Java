package Trees.binarySearchTree;

public class Main {

    /*
     * Binary Search Tree
     *
     * - Binary Tree: It is a special type of tree where each node doesn't have more than 2 child nodes. (It can have 1 child note but not more than 3!)
     *
     * - Binary Search Tree: Starting from the root the next element is added to left if it is less than the root,
     *  and added to right if it is greater than the root. The same action continued for each node for each new element.
     */

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.remove(0);

        tree.display();

        System.out.println(tree.search(10));
    }
}

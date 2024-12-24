package Graphs.AdjacencyList;

public class AdjacencyList {

    /*
     * Adjacency List
     *
     * - A graph representation using an array/ArrayList of LinkedLists.
     * - Each LinkedList represents a node and its adjacency neighbors.
     * - The head of each LinkedList is a unique node, and the list contains its neighbors.
     *
     * Runtime Complexity:
     * - Checking an edge: O(v), where v is the number of vertices (sequential search).
     *
     * Space Complexity:
     * - O(v + e), where v is the number of vertices and e is the number of edges.
     * - Suitable for sparse graphs, where most nodes have few connections.
     */

    public static void main(String[] args) {
        // Initialize a graph
        Graph graph = new Graph();

        // Adding nodes (vertices) to the graph
        graph.addNode(new Node('A')); // Node 0
        graph.addNode(new Node('B')); // Node 1
        graph.addNode(new Node('C')); // Node 2
        graph.addNode(new Node('D')); // Node 3
        graph.addNode(new Node('E')); // Node 4

        // Adding edges between the nodes
        graph.addEdge(0, 1); // Edge: A -> B
        graph.addEdge(1, 2); // Edge: B -> C
        graph.addEdge(1, 4); // Edge: B -> E
        graph.addEdge(2, 3); // Edge: C -> D
        graph.addEdge(2, 4); // Edge: C -> E
        graph.addEdge(4, 0); // Edge: E -> A
        graph.addEdge(4, 2); // Edge: E -> C

        // Printing the adjacency list
        graph.print();

        // Checking if edges exist
        System.out.println();
        System.out.println("Checking if edge exists between 'A' and 'D': " + graph.checkEdge(0, 3)); // false
        System.out.println("Checking if edge exists between 'B' and 'E': " + graph.checkEdge(1, 4)); // true
    }
}
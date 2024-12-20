package Graphs;

public class AdjacencyMatrix {

    /*
     * Adjacency Matrix
     *
     * - A graph representation using a 2D array.
     * - Rows and columns represent unique nodes (vertices).
     * - Edges are stored as 1 (connected) or 0 (not connected).
     *
     * Runtime Complexity:
     * - Checking an edge: O(1) (direct array access).
     *
     * Space Complexity:
     * - O(v^2), where v is the number of vertices.
     * - Suitable for dense graphs, where most nodes are connected.
     * - Not memory-efficient for sparse graphs.
     */

    public static void main(String[] args) {
        // Initialize a graph with 5 nodes
        Graph graph = new Graph(5);

        // Adding nodes (vertices) to the graph
        graph.addNode(new Node('A')); // Node 0
        graph.addNode(new Node('B')); // Node 1
        graph.addNode(new Node('C')); // Node 2
        graph.addNode(new Node('D')); // Node 3
        graph.addNode(new Node('E')); // Node 4

        // Adding edges between the nodes
        graph.addEdge(0, 1); // Edge: A -> B
        graph.addEdge(1, 2); // Edge: B -> C
        graph.addEdge(2, 3); // Edge: C -> D
        graph.addEdge(2, 4); // Edge: C -> E
        graph.addEdge(4, 0); // Edge: E -> A
        graph.addEdge(4, 2); // Edge: E -> C

        // Printing the adjacency matrix
        graph.print();

        // Checking if edge exists
        System.out.println();
        System.out.println("Checking if edge exist between 'C' and 'E': " + graph.checkEdge(2, 4));
        System.out.println("Checking if edge exist between 'A' and 'E': " + graph.checkEdge(0, 4));
    }
}
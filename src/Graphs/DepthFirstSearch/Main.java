package Graphs.DepthFirstSearch;

public class Main {

    /*
     * Depth First Search (DFS)
     * - A search algorithm for traversing or searching tree or graph data structures.
     *
     * How DFS Works:
     * 1. Pick a starting node (vertex).
     * 2. Traverse as far as possible along one branch (path) until a dead end or a previously visited node is encountered.
     * 3. Backtrack to the last node that has unvisited neighbors and continue the traversal.
     *
     * Key Features:
     * - Explores depth before breadth.
     * - Uses recursion or a stack for traversal.
     * - Can be used for pathfinding, cycle detection, and topological sorting.
     */

    public static void main(String[] args) {
        // Initialize a graph with 5 nodes
        Graph graph = new Graph(5);

        // Adding nodes (vertices) to the graph
        System.out.println("Adding nodes to the graph...");
        graph.addNode(new Node('A')); // Node 0
        graph.addNode(new Node('B')); // Node 1
        graph.addNode(new Node('C')); // Node 2
        graph.addNode(new Node('D')); // Node 3
        graph.addNode(new Node('E')); // Node 4

        // Adding edges between the nodes
        System.out.println("\nAdding edges to the graph...");
        graph.addEdge(0, 1); // Edge: A -> B
        graph.addEdge(1, 2); // Edge: B -> C
        graph.addEdge(2, 3); // Edge: C -> D
        graph.addEdge(2, 4); // Edge: C -> E
        graph.addEdge(4, 0); // Edge: E -> A
        graph.addEdge(4, 2); // Edge: E -> C

        // Printing the adjacency matrix
        System.out.println("\nAdjacency Matrix:");
        graph.print();

        // Perform Depth First Search starting from node C
        System.out.println("\nPerforming Depth First Search from node 'C'...");
        graph.depthFirstSearch(2); // Start DFS from node C

        // Perform Depth First Search starting from node D
        System.out.println("\nPerforming Depth First Search from node 'D'...");
        graph.depthFirstSearch(3); // Start DFS from node D
    }
}
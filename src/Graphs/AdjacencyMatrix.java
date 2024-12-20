package Graphs;

public class AdjacencyMatrix {

    /*
     * Adjacency Matrix
     * - A 2D array to store 1's/0's to represent edges
     * - of Rows: Unique nodes
     * - of Columns: Unique nodes
     *
     * Runtime Complexity to Check an Edge: O(1)
     * Space Complexity: O(v^2)
     */

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
    }
}

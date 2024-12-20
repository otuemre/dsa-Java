package Graphs;

import java.util.ArrayList;

public class Graph {

    private final ArrayList<Node> nodes; // List of nodes (vertices) in the graph
    private final int[][] matrix; // Adjacency matrix to represent edges

    // Constructor to initialize the graph with a specified size
    public Graph(int size) {
        nodes = new ArrayList<>(size);
        matrix = new int[size][size];
    }

    // Add a node (vertex) to the graph
    public void addNode(Node node) {
        if (nodes.size() < matrix.length) {
            nodes.add(node);
        } else {
            System.out.println("Cannot add more nodes. Graph is at full capacity.");
        }
    }

    // Add a directed edge between two nodes (src -> dst)
    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    // Check if an edge exists between two nodes
    public boolean checkEdge(int src, int dst) {
        return matrix[src][dst] == 1;
    }

    // Print the adjacency matrix along with node labels
    public void print() {
        // Print the header row with node labels
        System.out.print("   ");
        for (Node node : nodes) {
            System.out.print(node.getData() + "  ");
        }
        System.out.println();

        // Print each row with node labels and corresponding edges
        for (int i = 0; i < nodes.size(); i++) {
            System.out.print(nodes.get(i).getData() + "  ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
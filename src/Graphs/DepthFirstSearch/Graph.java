package Graphs.DepthFirstSearch;

import java.util.ArrayList;

public class Graph {

    private final ArrayList<Node> nodes; // List of nodes (vertices) in the graph
    private final int[][] adjacencyMatrix; // Adjacency matrix to represent edges

    // Constructor to initialize the graph with a specified size
    public Graph(int size) {
        nodes = new ArrayList<>(size);
        adjacencyMatrix = new int[size][size];
    }

    // Add a node (vertex) to the graph
    public void addNode(Node node) {
        if (nodes.size() < adjacencyMatrix.length) {
            nodes.add(node);
        } else {
            System.out.println("Cannot add more nodes. Graph is at full capacity.");
        }
    }

    // Add a directed edge between two nodes (src -> dst)
    public void addEdge(int src, int dst) {
        if (isValidIndex(src) && isValidIndex(dst)) {
            adjacencyMatrix[src][dst] = 1;
        } else {
            System.out.println("Invalid node indices. Edge not added.");
        }
    }

    // Check if an edge exists between two nodes
    public boolean checkEdge(int src, int dst) {
        if (isValidIndex(src) && isValidIndex(dst)) {
            return adjacencyMatrix[src][dst] == 1;
        }
        System.out.println("Invalid node indices.");
        return false;
    }

    // Perform Depth First Search (DFS) starting from a given node index
    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[adjacencyMatrix.length]; // Track visited nodes
        System.out.println("Starting Depth First Search from node: " + nodes.get(src).getData());
        dfsHelper(src, visited);
    }

    // Recursive helper method for DFS
    private void dfsHelper(int src, boolean[] visited) {
        if (visited[src]) {
            return; // If already visited, return
        }

        visited[src] = true; // Mark the current node as visited
        System.out.println(nodes.get(src).getData() + " = visited");

        // Explore all neighbors of the current node
        for (int i = 0; i < adjacencyMatrix[src].length; i++) {
            if (adjacencyMatrix[src][i] == 1) {
                dfsHelper(i, visited);
            }
        }
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
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    // Helper method to validate node indices
    private boolean isValidIndex(int index) {
        return index >= 0 && index < nodes.size();
    }
}
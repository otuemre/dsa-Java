package Graphs.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {

    private final ArrayList<LinkedList<Node>> adjacencyList; // List of adjacency lists to represent edges

    // Constructor to initialize the graph
    public Graph() {
        adjacencyList = new ArrayList<>();
    }

    // Add a node (vertex) to the graph
    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node); // Each adjacency list starts with the node itself
        adjacencyList.add(currentList);
    }

    // Add a directed edge between two nodes (src -> dst)
    public void addEdge(int src, int dst) {
        if (src < adjacencyList.size() && dst < adjacencyList.size()) {
            LinkedList<Node> srcList = adjacencyList.get(src);
            Node dstNode = adjacencyList.get(dst).getFirst(); // Get the destination node
            srcList.add(dstNode); // Add the destination node to the source's adjacency list
        } else {
            System.out.println("Invalid node indices. Edge not added.");
        }
    }

    // Check if an edge exists between two nodes
    public boolean checkEdge(int src, int dst) {
        if (src < adjacencyList.size() && dst < adjacencyList.size()) {
            LinkedList<Node> srcList = adjacencyList.get(src);
            Node dstNode = adjacencyList.get(dst).getFirst();
            return srcList.contains(dstNode); // Check if the destination node exists in the source's adjacency list
        }
        return false;
    }

    // Print the adjacency list
    public void print() {
        for (LinkedList<Node> nodes : adjacencyList) {
            System.out.print(nodes.getFirst().getData() + " -> ");
            for (int j = 1; j < nodes.size(); j++) { // Skip the first node (itself)
                System.out.print(nodes.get(j).getData() + " ");
            }
            System.out.println();
        }
    }
}
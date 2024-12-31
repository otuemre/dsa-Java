package Graphs.DepthFirstSearch;

public class Node {

    private final char data; // Data stored in the node
    private boolean visited;

    // Constructor to initialize the node with data
    public Node(char data) {
        this.data = data;
    }

    // Getter to access the data
    public char getData() {
        return data;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}

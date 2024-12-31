# Depth First Search (DFS) in Java

A graph traversal algorithm that explores depth before breadth. It is widely used for solving problems in graph theory, including pathfinding, cycle detection, and topological sorting.

---

## What is Depth First Search (DFS)?

**Depth First Search** is a graph traversal algorithm that explores as far as possible along one branch (path) before backtracking to explore other branches.

### How DFS Works:
1. **Pick a Starting Node (Vertex)**: Choose the node from which traversal begins.
2. **Traverse as Far as Possible**: Follow one branch until you reach a dead end or revisit a node.
3. **Backtrack**: Return to the last node with unvisited neighbors and continue the traversal.

---

### Key Features:
- **Traversal Order**: Explores depth first before breadth.
- **Implementation**: Typically uses recursion or a stack.
- **Applications**:
    - Pathfinding in mazes or graphs.
    - Cycle detection in directed or undirected graphs.
    - Topological sorting in Directed Acyclic Graphs (DAGs).

---

## Code Examples

**Node Code**:
```java
public class Node {

   private final char data; // Data stored in the node

   // Constructor to initialize the node with data
   public Node(char data) {
      this.data = data;
   }

   // Getter to access the data
   public char getData() {
      return data;
   }
}
```

**Graph Code**:
```java
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
```

**Main Code**:
```java
public class Main {

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
        System.out.println("Adjacency Matrix:");
        graph.print();

        // Perform Depth First Search starting from node C
        System.out.println("\nPerforming Depth First Search from node 'C'...");
        graph.depthFirstSearch(2); // Start DFS from node C

        // Perform Depth First Search starting from node D
        System.out.println("\nPerforming Depth First Search from node 'D'...");
        graph.depthFirstSearch(3); // Start DFS from node D
    }
}
```

**Output**:
```text
Adjacency Matrix:
   A  B  C  D  E  
A  0  1  0  0  0  
B  0  0  1  0  0  
C  0  0  0  1  1  
D  0  0  0  0  0  
E  1  0  1  0  0  

Performing Depth First Search from node 'C'...
Starting Depth First Search from node: C
C = visited
D = visited
E = visited
A = visited
B = visited

Performing Depth First Search from node 'D'...
Starting Depth First Search from node: D
D = visited
```
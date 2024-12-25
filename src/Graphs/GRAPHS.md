# Graphs in Java

This section introduces **Graphs**, a versatile data structure used to model relationships between objects. Graphs are fundamental in solving problems across domains like computer networks, social networks, navigation systems, and more.

---

## What is a Graph?

A **Graph** is a data structure consisting of:
- **Vertices (Nodes)**: Represent the objects.
- **Edges**: Represent the relationships between vertices.

> Graphs can be **directed** (edges have direction) or **undirected** (edges are bidirectional). They may also be **weighted**, where edges have associated costs or weights.

---

### Types of Graphs

1. **Directed Graph**:
    - Edges have a specific direction.
    - Example: One-way roads in navigation.

2. **Undirected Graph**:
    - Edges are bidirectional.
    - Example: Two-way roads or social connections.

3. **Weighted Graph**:
    - Edges have weights representing costs, distances, or capacities.
    - Example: Transportation networks with travel times or costs.

4. **Unweighted Graph**:
    - Edges have no weights.
    - Example: Friendship networks.

5. **Cyclic Graph**:
    - Contains at least one cycle (path that starts and ends at the same vertex).

6. **Acyclic Graph**:
    - Does not contain any cycles.

---

## Representing Graphs in Java

### 1. **Adjacency Matrix**
- A 2D array where `matrix[i][j]` represents the edge between vertex `i` and vertex `j`.
- Suitable for dense graphs.

### 2. **Adjacency List**
- A list where each vertex has a list of adjacent vertices.
- Efficient for sparse graphs.

---

## Common Graph Operations and Algorithms

1. **Graph Traversal**:
    - **Depth First Search (DFS)**: Explores as far as possible along each branch before backtracking.
    - **Breadth First Search (BFS)**: Explores all neighbors of a vertex before moving to the next level.

2. **Shortest Path**:
    - **Dijkstra's Algorithm**: Finds the shortest path in weighted graphs.
    - **Bellman-Ford Algorithm**: Handles graphs with negative weights.
    - **Floyd-Warshall Algorithm**: Computes shortest paths between all pairs of vertices.

3. **Minimum Spanning Tree**:
    - **Prim's Algorithm**: Builds the tree incrementally by adding the smallest edge.
    - **Kruskal's Algorithm**: Adds edges in increasing weight order to avoid cycles.

4. **Cycle Detection**:
    - Detects cycles in directed or undirected graphs.

5. **Topological Sorting**:
    - Orders vertices in a directed acyclic graph (DAG) based on dependencies.

---

## Applications of Graphs

- **Navigation Systems**: Finding the shortest paths in maps.
- **Social Networks**: Modeling and analyzing relationships.
- **Computer Networks**: Routing and data flow optimization.
- **Dependency Resolution**: Task scheduling and dependency graphs.

---

## Code Example

### Adjacency Matrix Example

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
```

**Main Code**:
```java
import java.util.ArrayList;

public class AdjacencyMatrix {
    
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
```

**Output**:
```text
   A  B  C  D  E  
A  0  1  0  0  0  
B  0  0  1  0  0  
C  0  0  0  1  1  
D  0  0  0  0  0  
E  1  0  1  0  0  

Checking if edge exist between 'C' and 'E': true
Checking if edge exist between 'A' and 'E': false 
```

### Adjacency List Example

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
```

**Main Code**:
```java
public class AdjacencyList {
    
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
```

**Output**:
```text
A -> B 
B -> C E 
C -> D E 
D -> 
E -> A C 

Checking if edge exists between 'A' and 'D': false
Checking if edge exists between 'B' and 'E': true
```
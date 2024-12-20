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

**Node Code**:
```java
public class Node {

    char data;

    public Node(char data) {
        this.data = data;
    }
}
```

**Graph Code**:
```java
public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;

    public Graph(int size) {
        nodes = new ArrayList<>(size);
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return matrix[src][dst] == 1;
    }

    public void print() {

        // Print Nodes (Optional)
        for (Node node : nodes) {
            System.out.print("\t" + node.data);
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {

            System.out.print(nodes.get(i).data + "\t");

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}
```

**Main Code**:
```java
import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;
    int[][] matrix;

    public Graph(int size) {
        nodes = new ArrayList<>(size);
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return matrix[src][dst] == 1;
    }

    public void print() {

        // Print Nodes (Optional)
        System.out.print(" ");
        for (Node node: nodes) {
            System.out.print("  " + node.data);
        }
        System.out.println();

        for (int i=0; i< matrix.length; i++) {

            System.out.print(nodes.get(i).data + "  ");

            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
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
```
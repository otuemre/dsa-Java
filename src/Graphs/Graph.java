package Graphs;

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

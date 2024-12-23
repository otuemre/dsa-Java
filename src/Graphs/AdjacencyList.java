package Graphs;

public class AdjacencyList {

    /*
     * Adjacency List
     *
     * - An array/arraylist of LinkedList
     * - Each LinkedList has a unique node at the head.
     * - All adjacency neighbours to that node are added to that node's LinkedList
     *
     * Run Time Complexity to Check an Edge: O(v)
     * Space Complexity: O(v + e)
     *
     */

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println();
        System.out.println("Check if there is an edge between 'A' and 'D': " + graph.checkEdge(0, 3));
        System.out.println("Check if there is an edge between 'B' and 'E': " + graph.checkEdge(1, 4));
    }
}

package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> adjacencyList;

    public Graph() {
        adjacencyList = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> crrList = new LinkedList<>();
        crrList.add(node);

        adjacencyList.add(crrList);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node> crrList = adjacencyList.get(src);
        Node dstNode = adjacencyList.get(dst).getFirst();

        crrList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> crrList = adjacencyList.get(src);
        Node dstNode = adjacencyList.get(dst).getFirst();

        for (Node node:crrList) {
            if (node.data == dstNode.data) {
                return true;
            }
        }

        return false;
    }

    public void print() {

        for (LinkedList<Node> crrList : adjacencyList) {
            for (Node node : crrList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }

    }

}

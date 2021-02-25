package com.nonlineardatastructures;
import java.util.*;

public class WeightedGraph {
    private class Node{
        public Node(String label) {
            this.label = label;
        }

        private String label;

        @Override
        public String toString() {
            return label;
        }
    }

    private class Edge{
        private Node fromNode;
        private Node toNode;
        private int weight;

        public Edge(Node fromNode, Node toNode, int weight) {
            this.fromNode = fromNode;
            this.toNode = toNode;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return fromNode.label + " to " + toNode.label;
        }

    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Edge>> adjacencyList = new HashMap<>();

    public void addNode(String label){
        Node node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to, int weight){
        Node fromNode = nodes.get(from);
        if(fromNode == null)
            return;

        Node toNode = nodes.get(to);
        if(toNode == null)
            return;

        adjacencyList.get(fromNode).add(new Edge(fromNode, toNode, weight));
        adjacencyList.get(toNode).add(new Edge(toNode, fromNode, weight));
    }

    public void print(){
        for(Node source: adjacencyList.keySet()){
            List<Edge> targets = adjacencyList.get(source);
            if(!targets.isEmpty())
                System.out.println(source+" is connected to "+ targets);
        }
    }

}

package com.nonlineardatastructures;
import java.util.*;

public class WeightedGraph {
    private class Node{
        public Node(String label) {
            this.label = label;
        }
        private List<Edge> edges = new ArrayList<>();
        private String label;

        public void addEdge(Node to, int weight){
            edges.add(new Edge(this, to, weight));
        }

        public List<Edge> getEdges(){
            return edges;
        }

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

    public void addNode(String label){
        nodes.putIfAbsent(label, new Node(label));
    }

    public void addEdge(String from, String to, int weight){
        Node fromNode = nodes.get(from);
        if(fromNode == null)
            return;

        Node toNode = nodes.get(to);
        if(toNode == null)
            return;
        fromNode.addEdge(toNode, weight);
        toNode.addEdge(fromNode, weight);
    }

    public void print(){
        for(Node node: nodes.values()){
            List<Edge> edges = node.getEdges();
            if(!edges.isEmpty())
                System.out.println(node +" is connected to "+ edges);
        }
    }

    private class NodeEntry{
        private Node node;
        private int priority;

        public NodeEntry(Node node, int priority) {
            this.node = node;
            this.priority = priority;
        }
    }
    
    public int getShortestDistance(String from, String to){
        Node fromNode = nodes.get(from);
        Map<Node, Integer> distances = new HashMap<>();
        for(Node node: nodes.values())
            distances.put(node, Integer.MAX_VALUE);
        distances.replace(fromNode,0);
        Set<Node> visited = new HashSet<>();
        
        PriorityQueue<NodeEntry> queue = new PriorityQueue<>(Comparator.comparingInt(ne->ne.priority));
        
        queue.add(new NodeEntry(fromNode,0));

        while(!queue.isEmpty()){
            Node current = queue.remove().node;
            visited.add(current);

            for(Edge edge: current.getEdges()){
                if(visited.contains(edge.toNode))
                    continue;

                int newDistance = distances.get(current) + edge.weight;
                if(newDistance < distances.get(edge.toNode)){
                    distances.replace(edge.toNode, newDistance);
                    queue.add(new NodeEntry(edge.toNode, newDistance));
                }
            }
        }

        return distances.get(nodes.get(to));
    }





}

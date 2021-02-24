package com.nonlineardatastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Graph {
    private class Node{
        private String label;
        public Node(String label){
            this.label = label;
        }

        @Override
        public String toString(){
            return label;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(String label){
        Node node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to){
        Node fromNode = nodes.get(from);
        if(fromNode==null)
            throw new IllegalArgumentException();

        Node toNode = nodes.get(to);
        if(toNode == null)
            throw new IllegalStateException();

        adjacencyList.get(fromNode).add(toNode);
    }

    public void print(){
        for(Node source: adjacencyList.keySet()){
            List<Node> targets = adjacencyList.get(source);
            if(!targets.isEmpty()){
                System.out.println(source+" is connected to "+targets);
            }
        }
    }

    public void removeNode(String label){
        Node node = nodes.get(label);
        if(node == null)
            return;
        for(Node n: adjacencyList.keySet())
            adjacencyList.get(n).remove(node);

        adjacencyList.remove(node);
        nodes.remove(node);
    }

    public void removeEdge(String from, String to){
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);

        if(fromNode == null || toNode == null)
            return;

        adjacencyList.get(fromNode).remove(toNode);
    }

    public void dfsRecurvsive(String root){
        Node node = nodes.get(root);
        if(node == null)
            return;
        dfsRecurvsive(node, new HashSet<>());
    }

    private void dfsRecurvsive(Node root, Set<Node> visited){
        System.out.println(root.label);
        visited.add(root);
        for(Node node: adjacencyList.get(root)){
            if(!visited.contains(node))
                dfsRecurvsive(node, visited);
        }
    }

    public void dfsIterative(String root)
    {
        Node node = nodes.get(root);
        if(node == null)
            return;

        Set<Node> visited = new HashSet<>();
        Stack<Node> callStack = new Stack<>();
        callStack.push(node);

        while(!callStack.isEmpty()){
            Node current = callStack.pop();

            if(visited.contains(current))
                continue;

            System.out.println(current);
            visited.add(current);

            for(Node neighbor: adjacencyList.get(current)){
                if(!visited.contains(neighbor))
                    callStack.push(neighbor);
            }
        }
    }

}

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
            while(!targets.isEmpty()){
                System.out.println(source+"is connected to "+targets);
            }
        }
    }



}

package com.nonlineardatastructures;

import java.util.ArrayList;

public class Trees {

    private class Node {
        Node leftChild;
        int value;
        Node rightChild;

        Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }
        Node current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        Node current = root;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
        if (root == null)
            return;
        System.out.print(root.value + " ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node root) {
        if (root == null)
            return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + " ");
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    private void inOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + " ");
        inOrderTraversal(root.rightChild);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;
        if (isLeaf(root))
            return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    public int min() {
        Node current = root;
        Node last = null;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        assert last != null;
        return last.value;
        //        return min(root);
    }

    private int min(Node root) {

        if (isLeaf(root))
            return root.value;
        int left = min(root.leftChild);
        int right = min(root.rightChild);
        return Math.min(Math.min(left, right), root.value);
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public boolean isEquals(Trees other) {
        if(other == null)
            return false;
        return isEquals(root, other.root);
    }

    private boolean isEquals(Node first, Node second){
        if(first == null && second == null)
            return true;
        if(first!=null && second!=null)
            return first.value == second.value &&
                    isEquals(first.leftChild, second.leftChild)
                    && isEquals(first.rightChild, second.rightChild);
        return false;
    }

    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int min, int max){
        if(root == null)
            return true;
        if(root.value < min || root.value > max)
            return false;
        return isBinarySearchTree(root.leftChild, min, root.value-1)
                && isBinarySearchTree(root.rightChild, root.value+1,max);
    }

    public ArrayList<Integer> getNodesAtDistance(int distance){
        ArrayList<Integer> list = new ArrayList<Integer>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node root, int distance, ArrayList<Integer> list){
        if(root == null)
            return;
        if(distance == 0){
            list.add(root.value);
            return;
        }
        getNodesAtDistance(root.leftChild, distance-1, list);
        getNodesAtDistance(root.rightChild, distance-1, list);
    }

    public void levelOrderTraversal(){
        for(int i = 0; i <= height(); i++){
            for(int value: getNodesAtDistance(i))
                System.out.println(value);
        }
    }

}

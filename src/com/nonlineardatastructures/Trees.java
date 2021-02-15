package com.nonlineardatastructures;

public class Trees {

    private class Node{
        Node leftChild;
        int value;
        Node rightChild;
        Node(int value)
        {
            this.value = value;
        }
    }
    Node root;
    public void insert(int value){
        if(root == null){
            root = new Node(value);
            return;
        }
        Node current = root;
        while(true){
            if(value < current.value)
            {
                if(current.leftChild == null){
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;
            }
            else{
                if(current.rightChild == null){
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }
    }


}

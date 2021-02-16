package com.nonlineardatastructures;

public class AVLTree {
    private class AVLNode{
        private int height;
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;
        public AVLNode(int value){
            this.value = value;
        }

        public String toString(){
            return "Value " + this.value;
        }
    }
    private AVLNode root;

    public void insert(int value){
        root = insert(root, value);
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    private AVLNode insert(AVLNode root, int value){
        if(root == null)
            return new AVLNode(value);
        if(value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);

        setHeight(root);

        root = balance(root);

        return root;
    }

    private AVLNode balance(AVLNode root){
        if(isRightHeavy(root)){
            if(balanceFactor(root.rightChild) > 0)
                root.rightChild = rotateRight(root.rightChild);
            return rotateLeft(root);
        }

        else if(isLeftHeavy(root)){
            if(balanceFactor(root.leftChild) < 0)
                root.leftChild = rotateLeft(root.leftChild);
            return rotateRight(root);
        }
        return root;
    }

    private AVLNode rotateLeft(AVLNode root){
        AVLNode newRoot = root.rightChild;

        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private AVLNode rotateRight(AVLNode root){
        AVLNode newRoot = root.leftChild;

        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        setHeight(root);
        setHeight(newRoot);

         return newRoot;
    }

    private void setHeight(AVLNode node){
        node.height = Math.max(height(node.leftChild), height(node.rightChild)) + 1;
    }

    private boolean isLeftHeavy(AVLNode node){
        return balanceFactor(node) > 1;

    }

    private boolean isRightHeavy(AVLNode node){
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node){
        return node == null ? 0 : height(node.leftChild) - height(node.rightChild);
    }


    private void inOrderTraversal(AVLNode root){
        if(root == null)
            return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + " ");
        inOrderTraversal(root.rightChild);
    }

    private int height(AVLNode node){
        return node == null ? -1 : node.height;
    }


}

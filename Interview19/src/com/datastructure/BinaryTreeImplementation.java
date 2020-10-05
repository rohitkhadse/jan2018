package com.datastructure;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int value){
        this.data = value;
        left = right =null;
    }
}

class BinaryTree{
    Node root;

    public void addNode(int value){
        root = addRecursive(root,value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null){
            return new Node(value);
        }

        if (value < current.data){
            current.left = addRecursive(current.left,value);
        }
        else if (value > current.data){
            current.right = addRecursive(current.right,value);
        }
        else {
            return current;
        }

        return current;
    }

    public void inOrder(){
        inOrder(root);
    }

    public void preOrder(){
        preOrder(root);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void inOrder(Node root) {
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    private void preOrder(Node root) {
        if (root == null){
            return;
        }

        System.out.print(root.data+ " ");
        inOrder(root.left);
        inOrder(root.right);
    }

    private void postOrder(Node root) {
        if (root == null){
            return;
        }

        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data+ " ");
    }
}

public class BinaryTreeImplementation {
    public static void main(String[] args) {
        BinaryTree binaryTree =  new BinaryTree();
        binaryTree.addNode(10);
        binaryTree.addNode(5);
        binaryTree.addNode(15);

        System.out.println("------Printing Binary Tree with inOrder traversal------");
        binaryTree.inOrder();

        System.out.println("\n------Printing Binary Tree with preOrder traversal------");
        binaryTree.preOrder();

        System.out.println("\n------Printing Binary Tree with postOrder traversal------");
        binaryTree.postOrder();

    }
}

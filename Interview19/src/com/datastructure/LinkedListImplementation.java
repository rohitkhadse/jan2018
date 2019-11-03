package com.datastructure;

class LinkedList{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
        }
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList.Node head = new LinkedList.Node(5);
        LinkedList.Node nodeA = new LinkedList.Node(2);
        LinkedList.Node nodeB = new LinkedList.Node(11);
        LinkedList.Node nodeC = new LinkedList.Node(7);

        head.next = nodeA;
        nodeA.next = nodeB;
        nodeB.next = nodeC;

        printLinkedList(head);
        deleteNode(2,head);
        printLinkedList(head);


    }

    private static void deleteNode(int key, LinkedList.Node head) {

        System.out.println("Deleting key : "+key);
        LinkedList.Node temp = head, prev =null;

        while (temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
    }

    private static void printLinkedList(LinkedList.Node head) {
        System.out.println("--------------Printing Linked List----------------");
        LinkedList.Node current = head;
        do {
            System.out.print(current.data+" ");
            current = current.next;
            if (current.next == null){
                System.out.println(current.data);
            }
        }
        while (current.next !=null);
    }
}

package com.datastructure.LinkedList;

public class LinkedList {
    Node head;

    // Adds a new node to the begining of the list
    // O(1) time
    public void addNode(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = head;
        head = newNode;
    }
    // Adds a new node to the end of the list (last node always points to null in singly linked list)
    // O(n) time
    public void addNodeToEnd(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if(head == null){
            newNode = head;
        }else{
            Node lastNode = head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }

    // Find the given key - data and delete the node from list.
    // O(n) time
    public void deleteNode(int key){
        if(head.data == key){
            head = head.next;
        }else{
            Node temp = head;
            while (temp.next != null) {

                if(temp.next.data == key){
                    temp.next = temp.next.next;
                    break;
                }
                else{
                    temp = temp.next;
                }
            }
        }
    }
    // find if a node exist in linked list
    // O(n) time
    public boolean search(int key){
        Node temp = head;

        while (temp.next != null){
            if(temp.data == key){
                System.out.println(true);
                return true;
            }
            temp = temp.next;
        }
        System.out.println(false);
        return false;
    }

    public void print()
    {
        Node temp = this.head;
        while (temp != null){
            System.out.println(temp.data);
            temp =  temp.next;
        }
    }
}

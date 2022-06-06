package com.datastructure.LinkedList;

public class NodeTestClass {
    public static void main(String[] args) {
        Node head = new Node();
        head.data = 1;
        Node middle = new Node();
        middle.data = 2;
        Node last = new Node();
        last.data = 3;
        head.next = middle;
        middle.next = last;
        last.next = null;

        LinkedList linkedList = new LinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.print();


    }
}

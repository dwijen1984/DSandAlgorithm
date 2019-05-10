package com.dwijen.Revise.Practice;

public class CircularLinkedList {
    Node First;
    Node Last;

    public void addFirst(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = First;
        if(First == null){
            Last = newNode;
        }
        First = newNode;
    }

    public Node deleteFirstNode(){
        Node temp = First;
        First = First.next;
        return temp;
    }

    public void displayAllItems(){
        Node current = First;
        while(current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void inserLast(int value){
        Node newNode = new Node();
        newNode.value = value;
        Last.next = newNode;
        Last = newNode;

    }
}

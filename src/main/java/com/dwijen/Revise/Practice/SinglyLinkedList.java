package com.dwijen.Revise.Practice;

public class SinglyLinkedList {
    Node First;

    public void addFirst(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = First;
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
        Node current = First;
        while(current.next != null){
            current = current.next;
        }
        Node newNode = new Node();
        newNode.value = value;
        current.next = newNode;
    }
}

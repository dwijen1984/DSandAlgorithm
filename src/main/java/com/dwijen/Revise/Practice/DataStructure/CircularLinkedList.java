package com.dwijen.Revise.Practice.DataStructure;

public class CircularLinkedList {
    //This is advantageous over SinglyLinkedList as there is top and rear pointer
    // So. if you want to delete from the rear you don't have to iterate through the whole list

    private Node top;
    private Node rear;

    public boolean addTop(int value){
        Node newNode = new Node();
        newNode.value = value;

        if(top == null){
            newNode.next = top;
            top = newNode;
            rear = top;
            return true;
        }else{
            newNode.next = top;
            top = newNode;
            return true;
        }

    }

}

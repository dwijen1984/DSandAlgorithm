package com.dwijen.Revise.Practice.DataStructure;

import org.junit.Test;

public class LinkedList {
    int[] data;
    Node head;
    LinkedList(){
    }
    public void add(int value){
        if(head == null){
            head = new Node(value);
            head.next = null;
        }
        else{
            Node tmp = head;
            head = new Node(value);
            head.next = tmp;
        }
    }
    public boolean remove(int value){
        boolean retunVal = false;
        Node head1= head;
        if(head1 == null){
            return false;
        }
        if(head1.next == null && head1.value != value){
            return false;
        }
        while(head1.next != null){
            if(head1.next.value == value){
                head1.next = head1.next.next;
                return true;
            }
            head1 = head1.next;
        }
        return retunVal;
    }
    public void printAllNodes(){
        while (head != null){
            System.out.println(head.value+"  ");
            head = head.next;
        }
    }


    public static void main(String args[]){
        LinkedList  l = new LinkedList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        //l.printAllNodes();
        l.remove(2);
        l.printAllNodes();
    }
}

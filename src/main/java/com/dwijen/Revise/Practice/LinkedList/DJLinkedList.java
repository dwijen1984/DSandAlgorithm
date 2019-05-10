package com.dwijen.Revise.Practice.LinkedList;

import org.junit.Test;

public class DJLinkedList {
    Node head = null;

    int val ;

    public void add(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            head.next = null;
        }else{
            Node tmp = head;
            head = node;
            head.next = tmp;

        }
    }
    public void remove(int val){
        Node findNode = head;
        if(head.val == val ){
            head = head.next;
            return;
        }
        while(findNode.next!= null){
            if(findNode.next.val == val){
                if(findNode.next.next == null){
                    findNode.next = null;
                    break;
                }else {
                    findNode.next = findNode.next.next;
                }
            }
            findNode = findNode.next;
        }
    }
    public void printAllNode(){
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
    @Test
    public void test(){
     DJLinkedList dj = new DJLinkedList();
     dj.add(1);dj.add(2);dj.add(3);dj.add(4);
     dj.remove(3);
     dj.printAllNode();
    }
}

package com.dwijen.Revise.Practice;

import org.junit.Test;

public class TestRevise {
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.displayAllItems();
        System.out.println("--------");
        list.deleteFirstNode();
        list.inserLast(9999);
        list.displayAllItems();

    }

    @Test
    public void testCircularLinkedlist(){
        CircularLinkedList c =  new CircularLinkedList();
        c.addFirst(1);
        c.displayAllItems();
        System.out.println("----");
        c.inserLast(999);
        c.displayAllItems();
    }
}

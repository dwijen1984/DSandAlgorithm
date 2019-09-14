package com.dwijen.Revise.Practice.DataStructure;

public class SinglyLinkedList {

    // Few Tricks
    // 1. for Singly use  while(current!= null) // to iterate
    // 2. For singly want to delete last node then you have to iterate whole structure, so you can use circularLinkedList
    // 3. Thing this as a Train engine and boggy design, where top is the train engine and all next nodes are boggy

     private Node top; // This you can imagine as train engine

     public void addTop(int val){
         Node newNode = new Node();
         newNode.value = val;
         newNode.next = top;
         top = newNode;
     }

     public Node deleteTop(){
         if(!isEmpty(top)){
             Node tmp = top;
             top = top.next;
             return tmp;
         }else{
             return null;
         }
     }

     public boolean isEmpty(Node top){
         return top == null;
     }

     public void deleteNode(int value){
        //This will search and delete the node
         Node current = top ;
         if(current!= null && current.value == value){
             top = current.next;
             return;
         }
         while(current!= null){
             if(current.next.value == value){
                 current.next = current.next.next;
                 break;
             }
             current = current.next;
         }
     }

     public void printAllNodes(){
         Node current = top;
         while(current != null){
             System.out.println(current.value);
             current = current.next;
         }
     }

}

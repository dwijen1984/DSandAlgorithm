package com.dwijen.Revise.Practice.DataStructure;

public class SinglyLinkedList {

     private Node top;

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

     public void deleteNode(int val){
        //This will search and delete the node
     }

     public void printAllNodes(){
         Node current = top;
         while(current != null){
             System.out.println(current.value);
             current = current.next;
         }
     }

}

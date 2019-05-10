package com.dwijen.Revise.Practice;

import org.junit.Test;

public class Queue {
    int initialSize = 2;
    int[] queue = new int[initialSize];
    int top= -1;int rear= -1;
    int itemCount= 0;

    public Queue(int initialSize){
        this.initialSize = initialSize;
    }

    public void enqueue(int val){
        if(!isFull()){
            itemCount++;
            if(rear == -1 && top == -1){
                top++;
            }
            rear = (rear+1)%initialSize;
            queue[rear] = val;

        }else{
            System.out.println("Queue is full");
        }
    }

    public void dequeue(){
        if(!isEmpty()){
            itemCount--;
            int val = queue[top];
            top = (top +1)%initialSize;
            System.out.println(val);
        }else{
            System.out.println("Queue is Empty");
        }
    }
    public boolean isFull(){
        if(itemCount >= initialSize){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(itemCount <= 0 ){
            return true;
        }
        return false;
    }

        public static void main(String args[]){
            Queue q = new Queue(2);
            q.enqueue(1);q.enqueue(2);//q.enqueue(1);
            q.dequeue();
            q.dequeue();
            q.dequeue();
        }


}



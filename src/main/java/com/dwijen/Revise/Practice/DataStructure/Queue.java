package com.dwijen.Revise.Practice.DataStructure;

import org.junit.Test;

public class Queue {
    public int[] elements;
    int size = 10;
    int currentIndex = 0;
    int length = 0;
    int rear = -1;
    int top = -1;
    Queue(){
        elements = new int[10];
    }

    public boolean isFull(){
        if(length >= size)
            return true;
        return false;
    }
    public boolean isEmpty(){
        if(length <= 0)
            return true;
        return false;
    }


    public void add(int i){
        if(!isFull()){
            length++;
            top = (top+1)%size;
            elements[top] = i;
        }
    }
    public int remove(){
        int tmp = 0;
        if(!isEmpty()){
            length--;
            rear = (rear+1)%size;
            tmp =  elements[rear];
            elements[rear] = 0;
        }
        return tmp;
    }

    @Test
    public static void main (String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();q.remove();q.remove();q.remove();
        System.out.println(q.remove());
    }

}

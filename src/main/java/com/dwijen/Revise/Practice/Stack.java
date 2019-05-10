package com.dwijen.Revise.Practice;

public class Stack {
    public int initialSize ;
    int top = -1;
    int itemCount = 0;
    int[] arr;

    public Stack(int initialSize){
        this.initialSize = initialSize;
        arr = new int[initialSize];
    }

    public boolean isFull(){
        if(itemCount >= initialSize){
            return true;
        }return false;
    }
    public boolean isEmpty(){
        if(itemCount <= 0){
            return true;
        }return false;
    }

    public void push(int val){
        if(!isFull()){
            itemCount++;
            top = (top+1)%initialSize;
            arr[top] = val;
        }else{
            System.out.println("Full.. can't push");
        }
    }

    public void pop(){
        if(!isEmpty()){
            itemCount--;
            int val = arr[top];
            top = (top-1)%initialSize;
            System.out.println(val);
        }else{
            System.out.println("Empty.. can't pop");
        }
    }

    public static void main(String[] args){
        Stack st = new Stack(2);
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.pop();
        st.pop();
    }

}

package com.dwijen.Revise.Practice.DataStructure;

public class Stack {
    private int top = -1;
    private int size = 0;
    private int totalSize;
    private int[] intArray;

    public Stack(int totalSize) {
        this.totalSize = totalSize;
        intArray = new int[totalSize];
    }

    public boolean push(int val){
        if(!isFull()){
            size++;
            top++;
            intArray[top] = val;
            return true;
        }else{
            return false;
        }
    }

    public boolean pop(){
        if(!isEmpty()){
            int returnVal = intArray[top];
            size--;
            top--;
            return true;
        }else{
            System.out.println("Empty");
            return false;
        }
    }

    private boolean isEmpty() {
        return size <=0;
    }

    private boolean isFull() {
        return size == totalSize;
    }

    public void printAll(){
        for(int i = 0; i< size ; i++){
            System.out.println("{ "+intArray[i]+" }");
        }
    }
}

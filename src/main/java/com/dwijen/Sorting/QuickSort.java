package com.dwijen.Sorting;

import org.junit.Test;

import java.util.Arrays;

public class QuickSort {
    /*
    Steps
    1. start the checking from index(i =0) and current (c=0 to c<length -1)
    2. select the pivot at very last
    3. if index is less than pivot then swap index and current and increase the index
     */

    public void solution(int[] arr, int pivotPos){
        int pivot = arr[pivotPos];
        for(int i=0; i<= pivotPos ; i++){
            for(int current = i; current<= pivotPos ; current++){
                if(pivot > arr[current]){
                    swap(arr, i, current);
                    i++;
                }
                if(pivot == arr[current]){
                    swap(arr, i, current);
                    pivotPos = i;
                }
            }
        }


    }
    public void swap(int[] arr, int i , int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    @Test
    public void test(){
        int[] arr = {1,3,4,2,9,7,8,5};
        solution(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

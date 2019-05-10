package com.dwijen.Sorting;

import org.junit.Test;

import java.util.Arrays;

public class InsertionSort {
    /*

    8,9,6
    i = 1 to array length
        j = i-1 to 0
     So, time complexity is O(n2), not very good for big array with millions data array
     */

    public int insertionSort(int[] a){
        int len = a.length;
        int swap =0;
        for(int i = 1; i <len; i++){
            int key = a[i];
            int j = i-1;
            while(j>= 0 && a[j]< key){
                int tmp = a[j+1];
                a[j+1] = a[j];
                a[j] = tmp;
                swap++;
                j--;

            }
        }
       return swap;
    }

    @Test
    public void test(){
        int[] input = {3,4,1,2};
        System.out.println("Input Array: "+Arrays.toString(input));
        insertionSort(input);
        System.out.println("insertionSort(input):"+Arrays.toString(input));
    }
}

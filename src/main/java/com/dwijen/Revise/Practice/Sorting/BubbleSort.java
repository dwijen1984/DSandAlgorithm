package com.dwijen.Revise.Practice.Sorting;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSort {
    public void solution(int[] a){
        int length = a.length;
        for(int i = 0 ; i< length -1; i++){
            for(int j = 0; j< length -i -1; j++){
                if(a[j] > a[j+1]){
                    int tmp1 = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp1;
                }
            }
        }
        Arrays.stream(a).forEach(x-> System.out.println(x));
    }

    @Test
    public void test(){
        int[] a = {3,7,6,9};
        solution(a);
    }
}

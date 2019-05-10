package com.dwijen.Revise.Practice.Array;

import org.junit.Test;

import java.util.Arrays;

public class RotateArray {
    public void rotateArray(int[] a, int count){
        while(count >0){
            count--;
            int maxsixe = a.length -1 ;
            int tmp = a[0];
            for(int i =0; i<a.length-1;i++){
                a[i]=a[i+1];
            }
            a[maxsixe] = tmp;
        }
    }
    @Test
    public void test(){
        int[] a = {1,2,3,4,5,6};
        rotateArray(a, 2);
        Arrays.stream(a).forEach(x-> System.out.println(x));
    }
}

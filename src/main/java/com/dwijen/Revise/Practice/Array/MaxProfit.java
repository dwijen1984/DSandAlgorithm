package com.dwijen.Revise.Practice.Array;

import org.junit.Test;

import java.util.Arrays;

public class MaxProfit {


    public void Solution(int[] input) {
        int[] newArray = new int[input.length];
        newArray[0] =0;int maxprofit = 0; int location = 0;
        for(int i=1 ; i< input.length ; i++){
            for(int j = 0; j<i; j++){
                if(input[i] > input[j]){
                    int diff = input[i] - input[j];
                    if(diff > maxprofit){
                        maxprofit = diff;
                        location = i;
                    }
                    newArray[i] = Math.max(diff, newArray[i]);
                }
            }
        }
        System.out.println("max profit : "+maxprofit+" at time :"+(location+1));
        Arrays.stream(newArray).forEach(System.out::println);
    }

    @Test
    public  void test(){
        int[] a = {10,2,4,4,5,7,3};
        Solution(a);
    }
}

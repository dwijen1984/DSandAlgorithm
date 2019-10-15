package com.dwijen.leetCode.arraysProblem;

import org.junit.Test;

public class SubArraySum {
    /*
    [2,1,1,0,2,4] and find the number of subarray which makes number 4
     2,1,1 - 1
     2,1,1,0 -2
     1,1,0,2 -3
     4 only is also a subarray -4
     */
    public int getCountSubarray(int[] arr, int sum){
        int count =0;
        int currentSum =0;
        int j =0;

        for(int i=0; i< arr.length; i++){
            currentSum+= arr[i];

            if(currentSum == sum)
                count++;
            while(currentSum > sum){
                currentSum = currentSum - arr[j];
                j++;
                if(currentSum == sum) {
                    count++;
                }
            }
            System.out.println("i="+i+" j= "+j+" currentSum = "+currentSum+" count ="+count);
        }
        return count;
    }
    @Test
    public void testSubArrayCount(){
        int[] arr = {2,1,1,0,2,4};
        getCountSubarray(arr, 4);
    }
}

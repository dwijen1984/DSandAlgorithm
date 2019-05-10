package com.dwijen.hackerRank;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;

public class addMaxAndMin {

    public static void main(String args[]){
        int[] a = {1,4,3,2,9};
        miniMaxSum(a);
    }

    public static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        System.out.print(IntStream.range(0, 4).map(x-> arr[x]).sum()+" "+IntStream.range(1, 5).map(x-> arr[x]).sum());

    }

    public void sortMap(Map<String, Integer> mp){
        mp.entrySet();
    }
}

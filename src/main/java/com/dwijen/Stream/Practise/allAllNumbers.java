package com.dwijen.Stream.Practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class allAllNumbers {
    public static void main(String args[]){

        int[] arr = {1,2,3,4};
        //System.out.println(sum(arr.length, arr));
        List<Integer> a = new ArrayList<>();
        a.add(17); a.add(28); a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(99);b.add(16); b.add(8);
        //compareTriplets(a, b);

        int[][] intArray = {{11,2,4}, {4,5,6}, {10,8,-12}};
        diagonalDifference(intArray);
    }

    public static long sum(int size, long[] arr){
        Long result = 0l;
        for(long arVal :arr){
            result = result+arVal;
        }
        return result;
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int[] results = new int[2];
        for(int i = 0 ;i< a.size(); i++){
            if(a.get(i) > b.get(i)){
                results[0] = results[0]+1;
            }else if(a.get(i) < b.get(i)){
                results[1] = results[1]+1;
            }else if(a.get(i) == b.get(i)){

            }
        }
        Arrays.stream(results).forEach(x-> result.add(x));
        return result;

    }

    static int diagonalDifference(int[][] arr) {
        int forwardDiagonal = 0;int backwardDiagonal=0;
        int len = arr.length-1;
            for(int row = 0; row<= len;row++){
            //for(int col =0 ; col< arr[0].length; col++){
                forwardDiagonal = forwardDiagonal+arr[row][row];
                backwardDiagonal = backwardDiagonal+arr[row][len-row];
            //}
        }
        return Math.abs(forwardDiagonal - backwardDiagonal);
    }
}

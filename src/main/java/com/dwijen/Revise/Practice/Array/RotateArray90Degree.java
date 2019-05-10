package com.dwijen.Revise.Practice.Array;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray90Degree {
/*

Input
 1  2  3
 4  5  6
 7  8  9

Output:
 3  6  9
 2  5  8
 1  4  7
 */

    public void solution(int[][] twoArray, int size){
        int[][] newArray = new int[size][size];
        for(int i = 0 ; i< size; i++){
            int k = 0;
            for(int j = size-1 ; j>=0; j--){
                newArray[k][i] = twoArray[i][j];
                k++;
            }
        }
        Arrays.stream(newArray).forEach(x->
        {
            for(int v = 0 ; v< x.length; v++){
                System.out.print(x[v]+" ");
            }
            System.out.println("");
        });

    }
    @Test
    public void test(){
        int mat[][] =
        {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        //solution(mat, 4);
        int[] arrToPass= {5,8,13,21};
        solution2(arrToPass, 5);
    }

    public void solution2(int[] a, int length){
        ArrayList<Integer> arrayOfSeries = createFibinacchiSeries(length);
        List<Integer> l = new ArrayList<>();
        Arrays.stream(a).forEach(x-> l.add(x));
        Collections.sort(l);
        for(int s =l.size()-1; s>=0;s--){
            if(arrayOfSeries.contains(l.get(s))){
                System.out.println(l.get(s));
                break;
            }

        }
    }
    public ArrayList<Integer> createFibinacchiSeries(int length) {
        ArrayList<Integer> finalList = new ArrayList<>();
        int n0 = 0; int n1 = 1;
        if(length<2){
            finalList.add(n0);
            finalList.add(n1);
        }
        else{
            finalList.add(n0);
            finalList.add(n1);
            while(length > 0){
                int tmp = n1;

                n1 = n0+n1;
                n0 = tmp;
                finalList.add(n1);
                System.out.println(tmp+", ");
                length--;
            }
        }
        return finalList;
    }
}

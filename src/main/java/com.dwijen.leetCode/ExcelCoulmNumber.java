package com.dwijen.leetCode;

import com.sun.javafx.tools.packager.MakeAllParams;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;


public class ExcelCoulmNumber {
    public void Solution(String strArray){
        int result = 0;
        for(char ch : strArray.toCharArray()){
             result  = result*26 + ((ch - 'A')+1);
        }
        System.out.println( "column number: "+result);

    }
    @Test
    public void test(){
        String[] input = {"a", "a", "b", "bc", "cb","da", "bc"};
        Solution("BA");
        int[] a= {1,2,3,4,5,6};
        Solution(a);
    }

    public void Solution(int[] arr){
    Map m = new HashMap();
        int result = Arrays.stream(arr).sum();
        System.out.println(result);
    }

}

package com.dwijen.leetCode.practise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BiggestNumber {

    public class CustomComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            String value1 = o1+o2;
            String value2 = o2+o1;
            System.out.println(" Value 1 :"+ value1);
            System.out.println(" Value 2 :"+ value2);
            System.out.println(" Value 2 :"+ value1.compareTo(value2));
            System.out.println(" ---------------");
            return value2.compareTo(value1);
        }
    }

    public String largestNumber(int[] nums) {
        String[] lst = new String[nums.length];
        for(int k = 0 ; k< nums.length; k++){
            System.out.println(k+": th String value :"+String.valueOf(nums[k]));
            lst[k]=(String.valueOf(nums[k]));
        }
        CustomComparator custom = new CustomComparator();
        Arrays.sort(lst, custom);

        String finalOutput = new String();
        for(String s:lst){
            finalOutput = finalOutput + s;
        }
        return finalOutput;
    }

    @Test
    public void test(){
        int[] a = {3,30,34,5,9};
        String output = largestNumber(a);
        System.out.println("Final Output :"+ output);
    }
}

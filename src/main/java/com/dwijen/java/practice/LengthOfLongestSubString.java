package com.dwijen.java.practice;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {


    public static int solution(String str){
        int maxLength = 0;
        int i = 0; int j = 0;
        Set<Character> set = new HashSet<>();
        while(j < str.length()){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j));
                j++;
                maxLength = Math.max(maxLength, (j-i));
            }else{
                set.remove(str.charAt(i));
                i++;
            }
        }
        set.stream().forEach(System.out::print);
        return maxLength;
    }

    public static void main(String args[]){
        String str = "geeksforgeek";
        System.out.println(solution(str));
    }
}

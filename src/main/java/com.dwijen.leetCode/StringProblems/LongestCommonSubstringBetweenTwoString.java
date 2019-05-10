package com.dwijen.leetCode.StringProblems;

import org.junit.Test;

public class LongestCommonSubstringBetweenTwoString {

    // Longest common substring - "abcd" and "azcd" here the substring is "cd"
    public void LCS(String st1, String st2){
        int[][] arr = new int[st1.length()+1][st2.length()+1];
        int maxLength = 0;
        StringBuffer str = new StringBuffer();
        for(int i = 1; i<st1.length()+1; i++){
            for(int j = 1; j< st2.length()+1; j++){

                if(st1.charAt(i-1) == st2.charAt(j-1)){
                    str.append(st1.charAt(i-1));
                    arr[i][j] = arr[i-1][j-1]+1;
                    if(arr[i][j] > maxLength){
                        maxLength = arr[i][j];
                    }
                }
            }
        }
        System.out.println("Max :"+maxLength+" String is :"+str);
    }

    // Longest common subsequense "acdsa" and "cbca" is "aca" as this is common in these two strings
    public void LCSubsequence(String st1, String st2){
        int[][] arr = new int[st1.length()+1][st2.length()+1];
        int maxLength = 0;
        StringBuffer str = new StringBuffer();
        for(int i = 1; i<st1.length()+1; i++){
            for(int j = 1; j< st2.length()+1; j++){
                if(st1.charAt(i-1) == st2.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1]+1;

                }else{
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
                if(arr[i][j] > maxLength){
                    maxLength = arr[i][j];
                }
            }
        }
        System.out.println("Max :"+maxLength+" String is :"+str);
    }


    @Test
    public void test(){
        LCS("abcd", "abcz");
        LCSubsequence("AGGTAB" , "GXTXAYB");

        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";

    }
}

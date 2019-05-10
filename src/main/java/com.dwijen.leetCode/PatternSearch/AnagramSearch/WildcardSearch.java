package com.dwijen.leetCode.PatternSearch.AnagramSearch;

import java.util.Arrays;

public class WildcardSearch {


    // Function that matches input str with
    // given wildcard pattern
    static boolean strmatch(String str, String pattern,
                            int n, int m)
    {
        boolean arr[][]  = new boolean[n+1][m+1];
        arr[0][0]=true;

        for(int i =1; i< m+1; i++){
            if(pattern.charAt(i-1) =='*'){
                arr[0][i] = arr[0][i-1];
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j =1;j< m+1; j++){

                if(pattern.charAt(j-1) =='*'){
                    arr[i][j] = arr[i-1][j] || arr[i][j-1];
                }else if(pattern.charAt(j-1) =='?'
                        || pattern.charAt(j-1) == str.charAt(i-1)){
                    arr[i][j] = arr[i-1][j-1] ;
                }else{
                    arr[i][j] = false;
                }
            }

        }
        print(arr, n, m);
        return arr[n][m];
    }

    public static void main(String args[])
    {
        /*String str = "baaabab";
        String pattern = "*****ba*****ab";*/

        String str = "abc";
        String pattern = "*ac";
        // String pattern = "ba*****ab";
        // String pattern = "ba*ab";
        // String pattern = "a*ab";
        // String pattern = "a*****ab";
        // String pattern = "*a*****ab";
        // String pattern = "ba*ab****";
        // String pattern = "****";
        // String pattern = "*";
        // String pattern = "aa?ab";
        // String pattern = "b*b";
        // String pattern = "a*a";
        // String pattern = "baaabab";
        // String pattern = "?baaabab";
        // String pattern = "*baaaba*";

        if (strmatch(str, pattern, str.length(),
                pattern.length()))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public static void print(boolean[][] input, int n, int m){
        for(int i = 0;i<=n; i++){
           for(int j = 0; j<= m;j++){
               System.out.print(input[i][j] == true? "T ":"F "+" ");
           }
            System.out.println(" ");
        }
        System.out.println("----------------------- ");
    }
}

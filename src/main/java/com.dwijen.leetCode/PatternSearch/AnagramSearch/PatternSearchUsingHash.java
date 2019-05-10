package com.dwijen.leetCode.PatternSearch.AnagramSearch;

import org.junit.Test;

public class PatternSearchUsingHash {
    public void match(String pattern, String wholeString){
        int patternLength = pattern.length();
        int count = 0;
        for(int i =0; i <= wholeString.length() - patternLength ; i++){
            String strToMatch = wholeString.substring(i, i+patternLength);
            if(strToMatch.hashCode() == pattern.hashCode()){
                count++;
                System.out.println("Match found at :"+i);
            }
        }
        System.out.println("total Count : "+count);
    }
    @Test
    public void test(){
        match("the", "the main reason for the beihnin the thermostathe");
    }
}

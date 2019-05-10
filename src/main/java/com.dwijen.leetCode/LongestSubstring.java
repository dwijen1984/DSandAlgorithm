package com.dwijen.leetCode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(set);
        return max;
    }

    @Test
    public void test(){
        int i = lengthOfLongestSubstring("abcabca");
        System.out.println("Size of string: "+i);
    }
}

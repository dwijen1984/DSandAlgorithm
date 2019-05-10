package com.dwijen.leetCode.StringProblems;

import org.junit.Test;
import sun.tools.tree.CharExpression;

import java.util.*;

public class LongestStringWithNoDuplicate {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        set.stream().forEach(System.out::print);
        System.out.println();
        return ans;
    }

    @Test
    public void Test(){
        int i = lengthOfLongestSubstring("pwwkew");
        System.out.println(i);

    }
}

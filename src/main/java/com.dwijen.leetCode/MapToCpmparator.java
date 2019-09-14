package com.dwijen.leetCode;

import org.junit.Test;

import java.util.*;

public class MapToCpmparator {

    public List<Character> sortMap(String input){
        Map<Character, Integer> mapping = new HashMap<>();
        for(char c :input.toCharArray()){
            int defaultval = mapping.getOrDefault(c, 0);
            mapping.put(c, defaultval+1);
        }
        SortByValue s = new SortByValue(mapping);
        TreeMap<Character, Integer> t = new TreeMap(s); // adding your own comparator
        t.putAll(mapping);
        for(Character c : t.keySet()){
            System.out.println(c+":"+t.get(c));
        }
        return null;
    }

    @Test
    public void test(){
        sortMap("AAABCC");
    }


    private class SortByValue implements Comparator<Character>{
        private Map<Character,Integer> map;
        public SortByValue(Map<Character,Integer> map) {
            this.map = map;
        }

        @Override
        public int compare(Character o1, Character o2) {
            return map.get(o1) - map.get(o2);
        }
    }

}

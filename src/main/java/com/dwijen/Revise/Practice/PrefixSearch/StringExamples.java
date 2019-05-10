package com.dwijen.Revise.Practice.PrefixSearch;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;
import org.omg.CORBA.portable.ValueFactory;
import org.omg.CORBA_2_3.portable.InputStream;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class StringExamples {

    public void arrangeStringBasedOnOccurance(String str){
        Map<Character, Integer> mapCountOccurance = new HashMap<>();
        int count = 0;
        for(Character c :str.toCharArray()){
            count = mapCountOccurance.getOrDefault(c, 0);
            mapCountOccurance.put(c, ++count);
        }

        Map<Character, Integer> result = mapCountOccurance.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.naturalOrder())) // make reverse order to make the order reversly
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        List<Character> c = new ArrayList<>();
        result.keySet().stream().forEach(a -> c.add(a));
        c.stream().forEach(System.out::println);
        //System.out.println(result);

        Map<Character, Integer> mapCountOccurance1 = new HashMap<Character, Integer>();
        ValueF v= new ValueF(mapCountOccurance1);
        TreeMap<Character, Integer> tmap = new TreeMap<Character, Integer>(v);
        //tmap.putAll(mapCountOccurance1);
        tmap.entrySet().stream().forEach(System.out::println);
        tmap.keySet().stream().forEach(System.out::println);

        String s ="07:00:09PM";
        String[] tokenValues = s.split(":", s.length());

    }

    @Test
    public void test(){
        arrangeStringBasedOnOccurance("AAABBXXXX");
    }

    class ValueF implements Comparator<Character> {
        Map<Character, Integer> base;

        public ValueF(Map<Character, Integer> base) {
            this.base = base;
        }

        // Note: this comparator imposes orderings that are inconsistent with
        // equals.
        public int compare(Character a, Character b) {
            if (base.get(a) >= base.get(b)) {
                return 1;
            } else {
                return -1;
            } // returning 0 would merge keys
        }
    }
}


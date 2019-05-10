package com.dwijen.Revise.Practice.PrefixSearch;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public List<String> Solution(String literatureText, List<String> wordsToExclude) {
        literatureText.replace(".","");
        String[] str = literatureText.toLowerCase().split(" ");
        List<String> l1 = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            if (s.contains("'") ) {
                String[] s1 = s.split("'");
                Arrays.asList(s1).stream().forEach(s2 -> l1.add(s2.toLowerCase()));
            } else if(s.contains(".") ){
                String[] s1 = s.split("\\.");
                Arrays.asList(s1).stream().forEach(s2 -> l1.add(s2.toLowerCase()));

            }else{
                l1.add(s.toLowerCase());
            }
        }
        int max = 0;
        for (String ste : l1) {
            if (!wordsToExclude.contains(ste)) {
                if (map.containsKey(ste)) {
                    int occurance = map.get(ste);
                    map.put(ste, occurance + 1);
                    if (occurance + 1 > max) {
                        max = occurance + 1;
                    }
                } else {
                    map.put(ste, 1);
                    if (1 > max) {
                        max = 1;
                    }
                }
            }

        }
        System.out.println("max:"+max);

        List<String> lst2 = new ArrayList<>();
        List<String> lst3 = new ArrayList<>();
        Map<String, Integer> sortedByPrice = map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).collect(Collectors.toMap(e-> e.getKey(), e-> e.getValue()));
        for(String strmap : map.keySet()){
            if(map.get(strmap) == max){
                lst3.add(strmap);
            }
        }
        lst3.stream().forEach(System.out::print);
        System.out.println("-----------");
        sortedByPrice.entrySet().stream().forEach(System.out::println);
        return lst2;





    }




    @org.junit.Test
    public  void main() {
        List<String> l = new ArrayList<>();
        l.add("and");
        l.add("the");
        l.add("he");
        l.add("to");
        l.add("is");
        l.add("Jack");
        l.add("Jill");
        //Jack and Jill went to the market to buy bread and cheese.

        Map<String, Integer> InMap = new HashMap<>();
        InMap.put("B", 2);
        InMap.put("A", 4);
        InMap.put("C", 3);
        InMap.put("D", 5);

                InMap.entrySet()
                        .stream()
                        .sorted(Map.Entry.<String, Integer>comparingByValue())
                        .forEach(System.out::println);


        //finalMap.entrySet().stream().forEach(System.out::println);

        //List<String> s = Solution("Rose. rose is a flower red  are flower",l );
    }
}



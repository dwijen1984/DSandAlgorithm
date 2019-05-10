package com.dwijen.Revise.Practice.PrefixSearch;


import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Testing {

    public void Solution(String literatureText) {

        String s1="a1 box ape bit";
        String s2="a2 eat nim did";
        String s3="a2 xi me nu";
        String s4="a4 has uni gry";
        String s5="a5 52 54 31";
        String s6="a6 13 121 98";



        List<String> lst = new ArrayList<>();
        lst.add(s1);
        lst.add(s2);
        lst.add(s3);
        lst.add(s4);
        lst.add(s5);
        lst.add(s6);
        int k =0,l =0;
        for(String str : lst){

            int index = str.indexOf(" ");
            String value = str.substring(0, index);
            String key = str.substring(index+1, str.length());

            String val1= key.replace(" ", "");
            boolean isString = false;

            for(char c :val1.toCharArray()){

                if(Character.isAlphabetic(c)){
                    isString = true;

                }else{
                    isString = false;

                }
            }
            if(isString){
                k++;
            }else{
                l++;
            }


        }
        String[] strings = new String[k];
        String[] strings2 = new String[l];

        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        
        int i =0; int j = 0;
        for(String str : lst){
            System.out.println(s1.matches("[a-zA-Z0-9]+"));
            int index = str.indexOf(" ");
            String value = str.substring(0, index);
            String key = str.substring(index+1, str.length());

            String val1= key.replace(" ", "");
            boolean isString = false;

            for(char c :val1.toCharArray()){

                if(Character.isAlphabetic(c)){
                    isString = true;

                }else{
                    isString = false;

                }
            }
            if(isString){
                strings[i] = key;i++;
                map.put(key.hashCode(), value);
            }else{
                strings2[j] = key; j++;
                map2.put(key.hashCode(), value);
            }


        }


/*
        Map<String, String> sortedByPrice = map.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue()).collect(Collectors.toMap(e-> e.getKey(), e-> e.getValue()));
        Map<String, String> sortedByPrice2 = map2.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue()).collect(Collectors.toMap(e-> e.getKey(), e-> e.getValue()));

        System.out.println(sortedByPrice);
        System.out.println(sortedByPrice2);*/
        //String[] strings = { "box ape bit", "xi me nu", "eat nim did", "has uni gry"};
        //String[] strings = { "52 54 31","13 121 98" };
        Arrays.sort(strings);
        Arrays.sort(strings2);
        List<String> lsting = new ArrayList();
        for(int m=0  ; m< k ; m++){
            String str2 = map.get(strings[m].hashCode());
            String s = str2 +" "+strings[m];
            lsting.add(s);
        }

        for(int m =0 ; m< l ; m++){
            String str2 = map2.get(strings[m].hashCode());
            String s = str2 +" "+strings[m];
            lsting.add(s);
        }

        lst.stream().forEach(System.out::println);
        String str = map.get(strings[1].hashCode());

        String str2 = map2.get(strings2[1].hashCode());
        Arrays.stream(strings).forEach(System.out::println);
        System.out.println(strings);
    }

    @Test
    public void test(){
Solution(null);

    }

}

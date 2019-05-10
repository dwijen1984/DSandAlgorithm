package com.dwijen.leetCode.Difficulty.Medimum;

import org.junit.Test;

import java.util.*;

public class ChemicalFormula {

    public Map<String, Integer> solution(String str, int power, Map<String, Integer> map ) {
        Map<String, Integer> countMolequle = map;
        char[] arrayChar = str.toCharArray();
        int size = str.toCharArray().length;
        for (int i = 0; i < size; i++) {
            if (Character.isUpperCase(arrayChar[i])) {
                int count=1 ;
                int newCount  =0;
                if(i+1 < size && (Character.isDigit(arrayChar[i+1]) )){
                    newCount = Integer.parseInt(Character.toString(arrayChar[i+1]));
                    count = countMolequle.getOrDefault(Character.toString(arrayChar[i]), 0);
                    countMolequle.put(Character.toString(arrayChar[i]), (count+newCount)*power);
                }else {
                    count = countMolequle.getOrDefault(Character.toString(arrayChar[i]), 0);
                    countMolequle.put(Character.toString(arrayChar[i]), (count + 1) * power);
                }
            }
        }
        return countMolequle;
    }

    public void devide(String str){
        String[] withoutOpeningBraces = str.split("\\(", str.length());
        List<String> finalList = new ArrayList<>();
        for(String woBraces : withoutOpeningBraces){
            if(woBraces.contains(")")){
                Arrays.stream(woBraces.split("\\)", woBraces.length())).filter(s-> !s.isEmpty()).forEach(s1-> finalList.add(s1));
            }else{
                finalList.add(woBraces);
            }
        }
        Map<String, Integer> countMolequle = new HashMap<>();
        for(int i = 0 ; i< finalList.size(); i++){
            String s= (i+1) < finalList.size()? finalList.get(i+1): "";
            if(!(s.isEmpty()) && s.chars().allMatch(Character::isDigit)){
                solution(finalList.get(i), Integer.parseInt(s),countMolequle);
            }else{
                solution(finalList.get(i), Integer.parseInt("1"),countMolequle);
            }
        }
        for(String key : countMolequle.keySet()){
            System.out.println(key+"->"+countMolequle.get(key));
        }


    }

    @Test
    public void test(){
         devide("K4(ON(SO3)2)2");

    }

}

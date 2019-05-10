package com.dwijen.hackerRank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateMaxNumber {
    public void generateMaxNumber(int i){
        List<Integer> list = new ArrayList<>();
        while(i> 0){
            int j = i%10;
            list.add(j);
            i = i/10;
        }
        list = list.stream().sorted().collect(Collectors.toList());
        int tmp = 0;
        for(int k = list.size(); k>0; k--){
            tmp = tmp*10+list.get(k-1);
        }
        System.out.println("Final max value is :"+tmp);
    }

    @Test
    public void test(){
        generateMaxNumber(128763);
    }
}

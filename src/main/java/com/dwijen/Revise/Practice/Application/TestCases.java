package com.dwijen.Revise.Practice.Application;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCases {

    public static List<List<Long>> splitItemClassIds(List<Long> itemClassIds, int limit){
        List<List<Long>> splittedItemClassIds = new ArrayList<>();
        int size = itemClassIds.size();
        if (size<=limit){
            splittedItemClassIds.add(itemClassIds);
        }else{/*
    		for(int count=0; count<size ;count+=limit ){
    			splittedItemClassIds.add(itemClassIds.subList(count, count+limit-1<size-1? count+limit-1 : size-1));
    		}*/
            for(int count=0; count<size; count+=limit){
                List<Long> tempList = new ArrayList<>();
                for(int i=count; i<(count+limit<size?count+limit:size); i++){
                    tempList.add(itemClassIds.get(i));
                }
                splittedItemClassIds.add(tempList);
            }
        }
        return splittedItemClassIds;
    }

    @Test
    public void test(){

        List<Long> listOfitemClass = new ArrayList<>();
        StringBuilder st = new StringBuilder();

        for(int i = 0; i< 6; i++){

            listOfitemClass.add(Long.parseLong(String.valueOf(i*100)))  ;
        }

        st.toString();
        Long l = System.currentTimeMillis();
        //List<List<Long>> ls = splitItemClassIds(listOfitemClass, 400);
        List<List<Long>> splittedItemClassIds = splitItemClassIds(listOfitemClass, 4);
        List<String> tmp_inclusion_result = Lists.newLinkedList();
        Iterator<List<Long>> itr = splittedItemClassIds.iterator();
           while(itr.hasNext()){
             itr.next().stream().forEach(v -> tmp_inclusion_result.add("((CONETNT ITEM CLASS ID :"+v.toString()+" ))"));
           }

        Long curr  = (System.currentTimeMillis() - l);
           String str = tmp_inclusion_result.toString() + tmp_inclusion_result.toString();
        System.out.println(" "+tmp_inclusion_result.toString());

    }
}

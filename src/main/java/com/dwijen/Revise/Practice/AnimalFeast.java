package com.dwijen.Revise.Practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class AnimalFeast {
    public void Solution(String animalName1, String foodName1){
        String animalName = animalName1.toLowerCase().replace(" ",  "");
        String foodName =foodName1.toLowerCase().replace(" ",  "");
        if(animalName.charAt(0) == foodName.charAt(0)
                &&
                animalName.charAt(animalName.length()-1) == foodName.charAt(foodName.length() -1)){
            System.out.println("Cool");
        }else{
            System.out.println("not same");
        }
    }
    //@Test
   /* public void test(){

        int j = 0;
              int a[]={2,4};
                do for (int i : a)
                       System.out.print(i+" ");
                while (j++ < 1);
    }
*/
    public void Sol(){

    }

    public List<String> queueSequence;
    public void setUp() {
        try {
            establishQueueSequence();
        }
        finally {
            cleanupQueueSequence();
            System.out.println("Queue sequence successfully cleaned up");
        }
    }
    private void cleanupQueueSequence() {
        if (queueSequence.size() > 0) {
            System.out.println("Queue size > 0");
        }
    }
    private void establishQueueSequence() {
        if (true) {
            throw new IllegalArgumentException();
        }
        queueSequence = new ArrayList<>();
    }

    public static void main(String args[]){
        AnimalFeast processor = new AnimalFeast();
        processor.setUp();
        System.out.println("Processing complete");
    }
}

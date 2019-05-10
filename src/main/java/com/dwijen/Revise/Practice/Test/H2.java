package com.dwijen.Revise.Practice.Test;


import com.dwijen.multiThread.programming.practice.Consumer;

import java.util.*;
import java.util.function.Function;
import java.util.concurrent.*;

public class H2 extends RecursiveTask<Long>{

    int low, high;
      int[] array;
      H2(int[] arr, int lo, int hi) {
                  array = arr;
                  low   = lo;
                  high  = hi;
              }
     public Long process() {
                if(high - low <= 4) {
                         long sum = 0;
                         for(int i=low; i < high; ++i)
                                 sum += array[i];
                        return sum;
                    } else {
                         int mid = low + (high - low) / 2;
                        H2 left  = new H2(array, low, mid);
                       H2 right = new H2(array, mid, high);
                        left.fork();
                       long rightAns = right.process();
                        long leftAns  = left.join();
                         return leftAns + rightAns;
                     }
             }
      static long sumArray(int[] array) {
                  return new ForkJoinPool().invoke(new H2(array,0,array.length));
             }

    @Override
    protected Long compute() {
        return null;
    }
}

package com.dwijen.cyclic.barrie.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableInvokeAllExample {
    private static List<Callable<String>> callables = new ArrayList();

    public static void main(String args[]){
        ExecutorService executors = Executors.newFixedThreadPool(2);
        Callable<String> call1 =      new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "This is task1";
            }
        };
        Callable<String> call2 =      new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "This is task2";
            }
        };
        Callable<String> call3 =      new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "This is task3";
            }
        };

        callables.add(call1);
        callables.add(call2);
        callables.add(call3);

        try {
            List<Future<String>> results = executors.invokeAll(callables);
            results.stream().forEach(x -> {
                try {
                    System.out.println(x.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            });

            executors.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

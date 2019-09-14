package com.dwijen.Revise.Practice.DataStructure;

import org.junit.Test;

public class TrieDSApp {

    private TrieDS root =  new TrieDS();

    public void insert(String str){
        TrieDS crawl = root;
        for(int level = 0 ; level< str.length() ; level++){
            int index = str.charAt(level) -'a';
           TrieDS trDS = new TrieDS();
           crawl.children[index] = trDS;
           crawl = crawl.children[index];
        }
        crawl.isLeaf = true;
    }

    public boolean isPresent(String word){
        TrieDS crawl = root;
        boolean isPresent = true;
        for(int i =0 ; i< word.length(); i++){
            int index = word.charAt(i) -'a';
            if(crawl.children[index] == null){
                return false;
            }
            crawl = crawl.children[index];
        }
        return isPresent;
    }

    @Test
    public void testTestDSApp(){
        insert("antelax");
        System.out.println(isPresent("antel"));
    }
}

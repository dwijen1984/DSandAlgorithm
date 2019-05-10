package com.dwijen.Revise.Practice.PrefixSearch;

import java.util.*;
import java.util.stream.Collectors;


public class TrieWithMap {

    public class TrieNode{
        public HashMap<Character, TrieNode> children;
        public boolean isEndWord;
        public char val ;
        TrieNode(Character c){
            children = new HashMap<>();
            isEndWord = false;
            this.val = c;
        }
        public HashMap<Character, TrieNode> getChildren(){
           return children;
        }
        public char getVal(){
            return val;
        }
        public boolean isEnd(){
            return isEndWord;
        }
        public void setIsEnd(boolean val)                {   isEndWord = val;     }
    };
    static TrieNode root;
    TrieWithMap(){
        root = new TrieNode((char)0);
    }

    public void insert(String str){
        TrieNode pCrawl = root;
        for(int i = 0; i< str.length(); i++){
            HashMap<Character, TrieNode> childrenVal = pCrawl.getChildren();
            char c = str.charAt(i);
            if(childrenVal.containsKey(c)){
                pCrawl = childrenVal.get(c);
            }else{
                TrieNode tmp_pCrawl = new TrieNode(c);
                childrenVal.put(c, tmp_pCrawl);
                pCrawl = tmp_pCrawl;
            }
        }
        pCrawl.setIsEnd(true);
    }
    public String search(String str){
        TrieNode pCrawl = root;
        int prvIndex = 0;
        String result ="";
        for(int i = 0; i< str.length(); i++){
            HashMap<Character, TrieNode> childrenVal = pCrawl.getChildren();
            char c = str.charAt(i);
            if(childrenVal.containsKey(c)){
                pCrawl = childrenVal.get(c);
                result = result+c;
                if(pCrawl.isEndWord){
                    prvIndex = i+1;
                }
            }else{
                break;
            }
        }
        if(pCrawl.isEndWord){
           return result;
        }
        if(!pCrawl.isEndWord){
            return str.substring(0, prvIndex);
        }
        return result;
    }
    public List<TrieNode> returnFilteredList(List<TrieNode> lst, Character c){
        return lst.stream().filter(t -> t.getVal() == c).collect(Collectors.toList());

    }


    public static void main(String[] args){
        TrieWithMap dict = new TrieWithMap();

        dict.insert("caterer");
        String input = "cat.";
        System.out.print(input + ":   ");
        System.out.println(dict.search(input));

    }
}

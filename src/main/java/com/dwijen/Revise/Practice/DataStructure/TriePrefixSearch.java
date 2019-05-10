package com.dwijen.Revise.Practice.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class TriePrefixSearch {
    public class TrieNode{
        public void setLeaf(boolean leaf) {
            isLeaf = leaf;
        }

        public boolean isLeaf;

        public void setChildern(Map<Character, TrieNode> childern) {
            this.childern = childern;
        }

        public Map<Character, TrieNode> childern;
        public Character value;
        public Map<Character, TrieNode> getChildren(){
            return childern;
        }

        public Character getValue() {
            return value;
        }
        public TrieNode(Character value){
            this.value = value;
            this.childern = new HashMap<>();
            this.isLeaf = false;
        }
    }
    TrieNode root = new TrieNode('0');

    public void insert(String str){
        TrieNode nodeRoot = root;
        for(Character c: str.toCharArray()){
            Map<Character, TrieNode> map = nodeRoot.getChildren();
            if(!map.containsKey(c)){
                TrieNode t = new TrieNode(c);
                map.put(c, t);
                nodeRoot = t;
            }else{
                nodeRoot = map.get(c);
            }
        }
        nodeRoot.setLeaf(true);
    }
    public boolean isPresent(String str){
        TrieNode nodeRoot = root;
        for(Character c : str.toCharArray()){
            Map<Character, TrieNode> map = nodeRoot.getChildren();
            if(!map.containsKey(c)){
                return false;
            }else{
                nodeRoot = map.get(c);
            }
        }
        return true;
    }
}

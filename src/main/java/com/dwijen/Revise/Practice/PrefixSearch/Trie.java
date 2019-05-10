package com.dwijen.Revise.Practice.PrefixSearch;



public class Trie {
    static int MAX_CHAR = 26;
    public boolean isEnd = false;
    public Trie[] children ;
    Trie(){
        isEnd = false;
        children = new Trie[MAX_CHAR];
        for(int i = 0 ; i < MAX_CHAR; i++){
            children[i] = null;
        }
    }
}

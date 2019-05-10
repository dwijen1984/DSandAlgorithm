package com.dwijen.Revise.Practice;

import org.junit.Test;

public class Trie {
    static final int ALPHABET_SIZE = 26;

    // trie node
    static class TrieNode
    {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode(){
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };

    static TrieNode root ;
    static void insert(String key)
    {
        int level;
        int length = key.length();
        int index;

        TrieNode pCrawl = root;

        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();

            pCrawl = pCrawl.children[index];
        }

        // mark last node as leaf
        pCrawl.isEndOfWord = true;
    }

    static boolean isSearch(String key)
    {
        int level;
        int length = key.length();
        int index;

        TrieNode pCrawl = root;

        for (level = 0; level < length; level++)
        {
            index = key.charAt(level) - 'a';
            if(pCrawl.isEndOfWord){

            }
            if (pCrawl.children[index] == null)
                return false;

            pCrawl = pCrawl.children[index];
        }

        // mark last node as leaf
        return true;
    }
    public static void main(String[] args){

        root = new TrieNode();
        String[] str = {"abc", "cba", "abcd"};
        for(String s : str){
            insert(s);
        }
        System.out.println("Present : "+isSearch("ab"));
    }


}

package com.dwijen.Revise.Practice.DataStructure;

public class TrieDS {

    private int MAX_LENGTH = 26;
    public TrieDS[] children;
    public boolean isLeaf;

    public TrieDS() {
        this.isLeaf = false;
        children = new TrieDS[MAX_LENGTH];
        for(int i=0 ; i< MAX_LENGTH ; i++){
            children[i] = null;
        }
    }


}

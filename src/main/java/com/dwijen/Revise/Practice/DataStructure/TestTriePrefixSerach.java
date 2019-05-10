package com.dwijen.Revise.Practice.DataStructure;

public class TestTriePrefixSerach {
    public static void main(String[] args){
        TriePrefixSearch t = new TriePrefixSearch();
        t.insert("Dwijen");
        t.insert("Devank");
        t.insert("Dwit");
        t.insert("Deepa");

        boolean b = t.isPresent("dwepa");
        System.out.println("Boolean :"+b);
    }
}

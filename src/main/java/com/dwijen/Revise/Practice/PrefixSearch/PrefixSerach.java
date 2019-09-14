package com.dwijen.Revise.Practice.PrefixSearch;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixSerach {

    static Trie root;
    static int ALPHABET_SIZE = 26;


    PrefixSerach(){
        root = new Trie();
    }


    static int indexs;

    // If not present, inserts key into trie
    // If the key is prefix of trie node, just marks
    // leaf node
    static void insert(String key)
    {
        int length = key.length();
        int index;

        Trie pCrawl = root;

        for (int level = 0; level < length; level++)
        {
            index = key.charAt(level) -'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new Trie();

            pCrawl = pCrawl.children[index];
        }

        // mark last node as leaf
        pCrawl.isEnd = true;
    }

    public boolean isSingleChild(Trie[] childrens){
        int count = 0;
        for(Trie t :childrens){
            if(t != null){
                count++;
            }
        }
        return (count >1)?false: true;
    }

    public int getIndexs(Trie[] childrens){
        int count = 0;
        for(Trie t :childrens){

            if(t != null){
                return count;
            }
            count++;
        }
        return count;
    }

    public String foundLongestCommonPrefix(){
        Trie crawl = root;
        String str = "";
        int index ;
        /*
        t
        |
        e
        |
        s
        | \ \ \
        t u g p


        so, the idea is to find till when there is only one child
        i.e: common for all Strings
         */
        while(isSingleChild(crawl.children)){
            int indexes = getIndexs(crawl.children);
            str+= (char)(indexes +'a') ; // This part is tricky, because from index we are generating the character
            crawl = crawl.children[indexes];
        }
        return str;
    }

    public boolean exists(String searchStr){
        Trie crawl = root;
        boolean isPresent = true;
        for(int i = 0 ; i< searchStr.length() ; i++){
            int index =  searchStr.charAt(i) -'a';
            if(crawl.children[index] != null){
                crawl = crawl.children[index];
            }else{
                return false;
            }
        }
        return true;
    }
    /*
    Idea is to find common prefix
    lets say add 1. tes 2. testing 3. tested
    and find longest in input String "testingSuccess" the o/p : testing
    and find longest in input String "testedSuccess" the o/p : tested
     */
    public String longestPrefix(String str){
        int index = 0;
        int prvVal = 0;
        String output = "";
        Trie pCrawl = root;
        for(int i = 0; i< str.length(); i++){
            index = str.charAt(i) -'a';
            if(pCrawl.children[index] != null){
                 output+= (char)(index+'a');
               if(pCrawl.children[index].isEnd){
                   prvVal = i+1; // if child node is end then add
               }
               pCrawl = pCrawl.children[index];
            }else{
                break;
            }
        }
     return str.substring(0, prvVal);
    }

    public void wildCardFind(String str){
        Trie pCrawl = root;int index = 0;
        for(int i=0; i <str.length() ; i++){
            index = str.charAt(i) -'a';
            if(pCrawl.children[index] != null){
               pCrawl = pCrawl.children[index];
            }
            List<Trie> lst = Arrays.stream(pCrawl.children).filter(c-> c!=null).collect(Collectors.toList());
            int index2 = str.charAt(i+1) -'a';
            for(Trie t :lst){
                if(t.children[index2] != null){

                }
            }
        }
    }

    public static void main(String args[]){
        PrefixSerach p = new PrefixSerach();
        p.insert("test");
        p.insert("testing");
        p.insert("tesu");
        p.insert("tesg");
        p.insert("tesn");
        p.insert("tesp");

        System.out.println(p.exists("tet"));
        System.out.println(p.foundLongestCommonPrefix());
        System.out.println(p.longestPrefix("tesuing"));

    }
}

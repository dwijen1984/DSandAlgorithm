package com.dwijen.Revise.Practice;

import com.dwijen.java.practice.DesignPrimitiveDatastructure.Queue;
import com.dwijen.java.practice.treeset.TreeNode;
import org.jetbrains.annotations.TestOnly;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestRevise {
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.displayAllItems();
        System.out.println("--------");
        list.deleteFirstNode();
        list.inserLast(9999);
        list.displayAllItems();

    }

    @Test
    public void testCircularLinkedlist(){
        CircularLinkedList c =  new CircularLinkedList();
        c.addFirst(1);
        c.displayAllItems();
        System.out.println("----");
        c.inserLast(999);
        c.displayAllItems();
    }

    @Test
    public void testFibonnaciSeries(){
        int[] twoElements = new int[2]; twoElements[0] =0 ; twoElements[1] = 1;
        int numberOfElements = 10;
        int[] arr = new int[numberOfElements]; arr[0] =0;arr[1]=1;
        int i =2;
        while(i< numberOfElements){
            arr[i] = arr[i-1]+arr[i-2];
            i++;
        }
        Arrays.stream(arr).boxed().forEach(System.out::println);
    }
    @Test
    public void testPrime(){
        int CheckNumber = 37;
        int squareRtNumber = (int)Math.round(Math.sqrt(CheckNumber));
        System.out.println("Square RT is "+squareRtNumber);
        for(int i = 2; i<squareRtNumber; i++){
            if(CheckNumber%i ==0){
                System.out.println("Not a Prime.."+i);
                break;
            }
        }
    }
    @Test
    public void checkPalindrom(){
        String str = "bobw";
        int size = str.length() -1;
        boolean  isPalindrom = true;
        for(int i=0; i< size/2 ; i++){
            System.out.println("fst:"+str.charAt(i)+" last:"+str.charAt(size -i) +" "+(str.charAt(i) ^ str.charAt(size -i)));
            if(str.charAt(i) != str.charAt(size -i)){
                isPalindrom = false;
                //break;
            }
        }
        if(isPalindrom)
            System.out.println("palingdrom");
        else
            System.out.println("NOT palingdrom");
    }
    @Test
    public void checkNumberPalindrom(){
        int checkNumber = 123321;
        int duplicate = checkNumber;
        int reverse = 0;
        while(checkNumber != 0){
            int lastNumber = checkNumber%10;
            reverse = reverse * 10 + lastNumber;
            checkNumber = checkNumber/10;
        }
        System.out.println("This is the reversed number: "+reverse + " original :"+duplicate);
        if(reverse == duplicate)
            System.out.println("its a Palindrom");
        else
            System.out.println("not a palindrom");
    }

    @Test
    public void testParanthesis(){
        java.util.Stack<Character> stack = new java.util.Stack<>();
        String par = "{}{}[";
        List<Character> openingParanthesis = Arrays.asList('{', '(', '[');
        for(int i=0; i < par.length(); i++){
            if(openingParanthesis.contains(par.charAt(i))){
                stack.push(par.charAt(i));
            }else if(par.charAt(i) =='}'){
                if(!stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                }
            }else if(par.charAt(i) ==']'){
                if(!stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }
            }
        }
        System.out.println("Paranthesis balanced : "+stack.empty());
    }

    @Test
    public void testBFS(){
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(11);
        treeNode.right = new TreeNode(9);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(7);

        //LinkedList<TreeNode> lst = new LinkedList<>();
        LinkedList<TreeNode> lst = new LinkedList<>();
        lst.add(treeNode);
        while(!lst.isEmpty()){
            TreeNode t =  lst.pop();
            System.out.println(t!= null?t.val:"");

            if(t.left != null)
            lst.add(t.left);

            if(t.right != null)
            lst.add(t.right);
        }
    }

    @Test
    public void allPossibleCombinationOfString() {
        permutation("", "GOD");
    }


    private static void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i),
                        word.substring(0, i) + word.substring(i + 1, word.length()));
            }
        }
    }

    @Test
    public void testprintAllCombination(){
        printAllCombination("", "abcd");
        String work = "abcd";
        System.out.println(work.substring(2, work.length()));
    }

    private static void printAllCombination(String perm, String word) {
        if(word.isEmpty()){
            System.out.println(word+perm);
        }else{
            for(int i =0; i< word.length(); i++){
                printAllCombination(perm+word.charAt(i),
                        word.substring(0, i)+word.substring(i+1, word.length()));
            }
        }
    }
}




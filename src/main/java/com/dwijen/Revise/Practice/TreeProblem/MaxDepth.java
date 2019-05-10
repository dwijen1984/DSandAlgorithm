package com.dwijen.Revise.Practice.TreeProblem;

import org.junit.Test;

public class MaxDepth {
    public int maxDepth(TreeNode T){
        int depth = 0;
        if(T == null) {
            return 0;
        }else{
            int left = maxDepth(T.left);
            int right = maxDepth(T.right);
            if(left > right){
                depth = left+1;
            }else{
                depth = right+1;
            }
        }

        return depth;
    }
    public void printLeaf(TreeNode T){
        if(T.left == null && T.right == null){
            System.out.println(T.val);
        }
        if( null != T.left){
            printLeaf(T.left);
        }if(null != T.right){
            printLeaf(T.right);
        }


    }
    @Test
    public void test(){
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(11);
        treeNode.right = new TreeNode(9);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(7);
        System.out.println("Depth :"+maxDepth(treeNode));
        printLeaf(treeNode);
    }
}

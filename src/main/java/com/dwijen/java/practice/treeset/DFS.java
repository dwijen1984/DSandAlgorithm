package com.dwijen.java.practice.treeset;

import com.dwijen.java.practice.DesignPrimitiveDatastructure.Queue;
import org.junit.Test;

public class DFS {
    public void Solution(TreeNode root){
        if(root != null){
            System.out.println(root.val);
        }
        if(root.left != null){
            Solution(root.left);
        }
        if(root.right != null){
            Solution(root.right);
        }


    }

    @Test
    public void testMerge() {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(11);
        treeNode.right = new TreeNode(9);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(7);

        Solution(treeNode);


    }
}

package com.dwijen.java.practice.treeset;


import com.dwijen.java.practice.DesignPrimitiveDatastructure.Queue;
import org.junit.Test;

public class TreeNodePractise {

    public void BFS(TreeNode Tree){
        Queue<TreeNode> QTree = new Queue<>();
        while(!QTree.isEmpty()){
            TreeNode t = QTree.remove();
            System.out.println(t.val);
            if(t.left != null){
                QTree.add(t.left);
            }if(t.right != null){
                QTree.add(t.right);
            }
        }
        System.out.println("--------------");
    }

    public void DFS(TreeNode tree){
        if(tree!= null){
            System.out.println(tree.val);
        }if(tree.left!= null){
            DFS(tree.left);
        }if(tree.right!= null){
            DFS(tree.right);
        }

    }
    int MAX_DEPTH = Integer.MIN_VALUE;
    public int FindDepth(int depth, TreeNode root){
        if(root.left == null & root.right == null){
            return depth+1;
        }
        if(root.left!= null & root.right == null){
            FindDepth(depth+1, root.left);
        }if(root.right!= null & root.left == null){
            FindDepth(depth+1, root.right);
        }else{
            FindDepth(depth+1, root.left);
            FindDepth(depth+1, root.right);
        }
        return depth+1;
    }

    @Test
    public void testMerge() {
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(11);
        treeNode.right = new TreeNode(9);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(3);
        treeNode.right.right = new TreeNode(7);


        //BFS(treeNode);
        DFS(treeNode);
        System.out.println("------------");
        System.out.println(FindDepth(1, treeNode));

    }

}

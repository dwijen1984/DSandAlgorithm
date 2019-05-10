package com.dwijen.Revise.Practice.TreeProblem;

import com.dwijen.java.practice.DesignPrimitiveDatastructure.Queue;
import org.junit.Test;

public class BFSnDFS {
    public void solutionBFS(TreeNode T){
        Queue<TreeNode> QT = new Queue<>();
        QT.add(T);
        while(!QT.isEmpty()){
            TreeNode tree = null;
            tree = QT.remove();
            System.out.println(tree.val+" ");
            if(null != tree.left)
                QT.add(tree.left);
            if(null != tree.right)
                QT.add(tree.right);
        }
    }

    public void solutionDFS(TreeNode T){
        System.out.println(T.val+" ");
        if(null != T.left)
            solutionDFS(T.left);
        if(null != T.right)
            solutionDFS(T.right);

    }

    @Test
    public void Test(){
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(11);
        treeNode.right = new TreeNode(9);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(7);
        solutionBFS(treeNode);
        System.out.println("____________");
        solutionDFS(treeNode);
    }

}

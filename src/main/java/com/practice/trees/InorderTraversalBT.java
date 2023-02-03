package com.practice.trees;

import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x){
        val = x;
        left = null;
        right = null;
    }
}

public class InorderTraversalBT {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> output = new ArrayList<>();
        if (A == null){
            return output;
        }
        inorderTraversal(A.left);
        return
        inorderTraversal(A.right);
    }
}

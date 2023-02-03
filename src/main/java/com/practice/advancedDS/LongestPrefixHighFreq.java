package com.practice.advancedDS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LongestPrefixHighFreq {
    public static void main(String[] args) {
        String strInput = "aabcdaabcd";

        int n=strInput.length();
        System.out.println("Prefix with high frequency : " + findPrefix(strInput,n));
    }
    public static String findPrefix(String strInput, int n){
        char[] strArr = strInput.toCharArray();
        int k=1,j;
        boolean flag = false;
        String prefixStr="";
        ArrayList<Integer> repeatIndex = new ArrayList<>();
        for (int i=1;i<n;i++){
            if (strArr[i] == strArr[0]){
                flag = true;
                repeatIndex.add(i);
            }
        }
        if (!flag){
            return strInput;
        }
        while (k<repeatIndex.get(0)) {
            int count = 0;
            for (j = 0; j < repeatIndex.size(); j++) {
                if ((repeatIndex.get(j) + k) < n &&
                        strArr[k] == strArr[repeatIndex.get(j) + k]) {
                    count++;
                }
            }
            if (count == repeatIndex.size()) {
                k++;
            } else {
                break;
            }
        }
        return strInput.substring(0,k);
    }
    public class Pairs{
        TreeNode node;
        int level;
        Pairs(){}
        Pairs(TreeNode node, int level){
            this.node=node;
            this.level=level;
        }
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> resList = new ArrayList<>();
        Queue<Pairs> q = new LinkedList<>();
        q.add(new Pairs(root, 0));
        resList.add(root.val);
        int max_level = 0;
        while (!q.isEmpty()) {
            Pairs pair = q.poll();
            TreeNode curr_node = pair.node;
            int curr_level = pair.level;

            if (curr_level > max_level) {
                max_level = curr_level;
                resList.add(curr_node.val);
            }
            if (curr_node.right != null) {
                q.add(new Pairs(curr_node.right, curr_level + 1));
            }
            if (curr_node.left != null) {
                q.add(new Pairs(curr_node.left, curr_level + 1));
            }
        }
        return resList;
    }
}

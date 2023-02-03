package com.practice.LinkedList;


import java.util.ArrayList;
import java.util.Stack;

class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

public class DesignLinkedList {

    public static ListNode head = null;
    public ListNode solve(ArrayList<ArrayList<Integer>> A) {
        for (int i=0;i<A.size();i++){
            if (A.get(i).get(0)==0){
                insert(A.get(i).get(i+1));
            }
            if (A.get(i).get(0)==1){
                append(A.get(i).get(i+1));
            }
        }
        return head;
    }
    static void insert( int x){
        ListNode newNode = new ListNode(x);
        newNode.next = head;
        head = newNode;
    }
    static void append(int x){
        ListNode newNode = new ListNode(x);
        if (head == null){
            return;
        }
        ListNode temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }
}

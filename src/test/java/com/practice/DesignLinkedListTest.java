package com.practice;

import com.practice.LinkedList.DesignLinkedList;
import com.practice.algos.AntiDiagonal2DArrList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class DesignLinkedListTest {
    @Test
    public void testdesignOfLL() {
        DesignLinkedList designLinkedList = new DesignLinkedList();
        ArrayList<ArrayList<Integer>> input1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> resultArrList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 1, -1));
        input1.add(list);
        list = new ArrayList<Integer>(Arrays.asList(1, 2, -1));
        input1.add(list);
    /*list=new ArrayList<Integer>(Arrays.asList(2, 3, 1));
        input1.add(list);*/

        designLinkedList.solve(input1);
        //System.out.println("ListNode : " + ListNode);
    }
}

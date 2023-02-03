package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PrefixSumArrayListTest {
    @Test
    public void prefixSumArrayListTest() {
        PrefixSumArrayList prefixSumArrayList = new PrefixSumArrayList();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,10));
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(2,3,20));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,5,25));
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        input.add(0, list);
        input.add(1,list1);
        input.add(2,list2);
        ArrayList<Integer> resList = prefixSumArrayList.solve(5,input);
        System.out.println("resList : " + resList);
    }

}

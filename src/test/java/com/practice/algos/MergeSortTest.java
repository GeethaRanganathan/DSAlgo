package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortTest {
    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(7,4,2,8,9,10,5,3));
        ArrayList<Integer> resList = mergeSort.sort(input,0,input.size()-1);
        System.out.println("resList : " + resList);
    }
}

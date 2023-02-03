package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class XOR2DArraylistTest {
    @Test
    public void testXOR2D(){
        XOR2DArraylist xor2DArraylist = new XOR2DArraylist();
        ArrayList<ArrayList<Integer>> resultArrList = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1,0,0,0,1));

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,4));
        resultArrList.add(list);

        list = new ArrayList<Integer>(Arrays.asList(1,5));
        resultArrList.add(list);

        list = new ArrayList<Integer>(Arrays.asList(3,5));
        resultArrList.add(list);

        ArrayList<ArrayList<Integer>> resList = xor2DArraylist.solve(input1,resultArrList);
        System.out.println("resList : " + resList);
    }
}

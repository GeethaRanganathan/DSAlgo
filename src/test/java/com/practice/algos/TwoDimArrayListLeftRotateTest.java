package com.practice.algos;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimArrayListLeftRotateTest {
    @Test
    public void twoDimArrayListRotate(){
        TwoDimArrayListLeftRotate twoDimArrayListLeftRotate = new TwoDimArrayListLeftRotate();
        ArrayList<Integer> input1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> input2 = new ArrayList<Integer>(Arrays.asList(2,3));

        ArrayList<ArrayList<Integer>> resList = twoDimArrayListLeftRotate.solve(input1,input2);
        System.out.println("resList : " + resList);
    }
}

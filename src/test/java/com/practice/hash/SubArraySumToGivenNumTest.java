package com.practice.hash;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArraySumToGivenNumTest {
    @Test
    public void testsubArraySumtoGvnNum(){
        SubArraySumToGivenNum subArraySumToGivenNum = new SubArraySumToGivenNum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(189, 267, 354, 478, 589));
        ArrayList<Integer> result = subArraySumToGivenNum.solve(input,123);
        System.out.println("result : " + result);
    }
}

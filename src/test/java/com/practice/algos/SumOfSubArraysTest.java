package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfSubArraysTest {
    @Test
    public void sumOfSubArraysTest() {
        SumOfSubArrays sumOfSubArrays = new SumOfSubArrays();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,9,5));
        Long sum = sumOfSubArrays.subarraySum(input);
        System.out.println("Sum : " + sum);
    }

}

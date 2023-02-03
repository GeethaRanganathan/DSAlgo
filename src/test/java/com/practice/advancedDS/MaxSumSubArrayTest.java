package com.practice.advancedDS;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class MaxSumSubArrayTest {
    @Test
    public void maxTest(){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4));
        MaxSumSubArray maxSumSubArray = new MaxSumSubArray();
        ArrayList<Integer> output = maxSumSubArray.maxSum(input);
        System.out.println(output.get(0) + " " + output.get(1));
    }
}

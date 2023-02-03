package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumContiguousSubArrayTest {
    @Test
    public void duplicateElementCountTest() {
        MaxSumContiguousSubArray maxSumContiguousSubArray = new MaxSumContiguousSubArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-163,-20));
        int sum = maxSumContiguousSubArray.maxSubArray(input);
        System.out.println("Count : " + sum);
    }

}

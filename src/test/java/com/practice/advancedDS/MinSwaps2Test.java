package com.practice.advancedDS;

import com.practice.algos.DuplicateElementCount;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MinSwaps2Test {
    @Test
    public void minSwapTest() {
        MinSwaps2 minSwaps2 = new MinSwaps2();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,0));
        int count = minSwaps2.solve(input);
        System.out.println("Count : " + count);
    }
}

package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LeastAverageSubArrayTest {
    @Test
    public void testLeastAvg(){
        LeastAvgSubArray leastAverageSubArray = new LeastAvgSubArray();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 15, 7, 6, 3, 4, 18, 14, 13, 7, 3, 7, 2, 18));
        int elementIndex = leastAverageSubArray.solve(input,6);
        System.out.println("elementIndex : " + elementIndex);
    }

}

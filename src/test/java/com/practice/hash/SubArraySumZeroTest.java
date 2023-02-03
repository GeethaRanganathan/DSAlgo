package com.practice.hash;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArraySumZeroTest {
    @Test
    public void testsubArray(){
        SubArraySumZero subArraySumZero = new SubArraySumZero();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, -2, 4, -4));
        ArrayList<Integer> result = subArraySumZero.solve(input);
        System.out.println("result : " + result);
    }
}

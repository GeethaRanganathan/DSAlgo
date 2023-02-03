package com.practice.hash;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestConsecutiveTest {
    @Test
    public void testLongConsec(){
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(100, 4, 200, 1, 3, 2));
        int output = longestConsecutive.longestConsecutive(input);
        System.out.println("output : " + output);
    }
}

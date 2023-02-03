package com.practice.hash;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DiffPossibleTest {
    @Test
    public void testDiffPos(){
        DiffPossible diffPossible = new DiffPossible();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 5, 4, 1, 2));
        int output = diffPossible.diffPossible(input,0);
        System.out.println("output : " + output);
    }
}

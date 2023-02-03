package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoGreatestElementsTest {
    @Test
    public void testTwoGreatestElement() {
        TwoGreatestElements twoGreatestElements = new TwoGreatestElements();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-5,-3,-6,-1,-8,-7,-2));
        ArrayList<Integer> resList = twoGreatestElements.solve(input);
        System.out.println("resList : " + resList);
    }
}

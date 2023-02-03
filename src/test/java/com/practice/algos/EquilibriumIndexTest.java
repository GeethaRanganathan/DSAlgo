package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndexTest {
    @Test
    public void testEqulbrmindex(){
        EquilibriumIndex equilibriumIndex = new EquilibriumIndex();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3));
        int index = equilibriumIndex.solve(input);
        System.out.println("index: " + index);
    }
}

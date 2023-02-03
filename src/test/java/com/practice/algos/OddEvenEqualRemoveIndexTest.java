package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class OddEvenEqualRemoveIndexTest {
    @Test
    public void duplicateElementCountTest() {
        OddEvenEqualRemoveIndex oddEvenEqualRemoveIndex = new OddEvenEqualRemoveIndex();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,1,6,4));
        int Count = oddEvenEqualRemoveIndex.solve(input);
        System.out.println("Count : " + Count);
    }

}

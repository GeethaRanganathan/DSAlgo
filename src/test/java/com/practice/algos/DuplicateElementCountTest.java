package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElementCountTest {
    @Test
    public void duplicateElementCountTest() {
        DuplicateElementCount duplicateElementCount = new DuplicateElementCount();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(156629687, 156629687, 950873097, -816928664, 633452756, 156629687, -816928664, 950873097, 950873097 ));
        int count = duplicateElementCount.solve(input);
        System.out.println("Count : " + count);
    }

}

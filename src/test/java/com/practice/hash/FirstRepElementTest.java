package com.practice.hash;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstRepElementTest {
    @Test
    public void testFirstElem(){
        FirstRepElement firstRepElement = new FirstRepElement();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10, 5, 3, 4, 3, 5, 6));
        int output = firstRepElement.solve(input);
        System.out.println("output : " + output);
    }
}

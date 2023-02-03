package com.practice.hash;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class KOccurencesTest {
    @Test
    public void testKOcc(){
        KOccurences kOccurences = new KOccurences();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,2,3,3));
        int sum = kOccurences.getSum(5,2,input);
        System.out.println("sum : " + sum);
    }
}

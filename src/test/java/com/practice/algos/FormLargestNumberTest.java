package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class FormLargestNumberTest {
    @Test
    public void formLargestTest() {
        FormLargestNumber formLargestNumber = new FormLargestNumber();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        String largestNumber = formLargestNumber.largestNumber(input);
        System.out.println("Largest Number formed : " + largestNumber);
    }

}

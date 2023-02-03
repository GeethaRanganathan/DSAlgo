package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Nby3RepeatNumbersTest {
    @Test
    public void nby3Test() {
        Nby3RepeatNumbers nby3RepeatNumbers = new Nby3RepeatNumbers();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1000727, 1000727, 1000641, 1000517, 1000212, 1000532, 1000727, 1001000, 1000254, 1000106, 1000405, 1000100, 1000736, 1000727, 1000727, 1000787, 1000105, 1000713, 1000727, 1000333, 1000069, 1000727, 1000877, 1000222, 1000727, 1000505, 1000641, 1000533, 1000727, 1000727, 1000727, 1000508, 1000475, 1000727, 1000573, 1000727, 1000618, 1000727, 1000309, 1000486, 1000792, 1000727, 1000727, 1000426, 1000547, 1000727, 1000972, 1000575, 1000303, 1000727, 1000533, 1000669, 1000489, 1000727, 1000329, 1000727, 1000050, 1000209, 1000109));
        int majElem = nby3RepeatNumbers.repeatedNumber(input);
        System.out.println("Majority element : " + majElem);
    }

}

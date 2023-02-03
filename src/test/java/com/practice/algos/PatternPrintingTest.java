package com.practice.algos;

import org.junit.Test;

import java.util.ArrayList;

public class PatternPrintingTest {
    @Test
    public void testPatternPrint(){
        PatternPrinting patternPrinting = new PatternPrinting();
        ArrayList<ArrayList<Integer>> outputList2D = new ArrayList<ArrayList<Integer>>();
        outputList2D = patternPrinting.solve(4);
        System.out.println("Result 2D arrayList : " + outputList2D);
    }

}

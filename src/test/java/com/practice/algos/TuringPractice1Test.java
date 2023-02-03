package com.practice.algos;

import org.junit.Test;

public class TuringPractice1Test {
    @Test
    public void turingTest(){
        TuringPractice1 turingPractice1 = new TuringPractice1();
        //String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        String[] ops = {"1"};
        System.out.println(turingPractice1.calPoints(ops));
    }
}

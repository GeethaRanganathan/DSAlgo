package com.practice.algos;

import org.junit.Test;

public class RightShiftNegNumTest {
    @Test
    public void testNumShift(){
        RightsiftNegNum rightsiftNegNum = new RightsiftNegNum();
        int res = rightsiftNegNum.shiftNegativeNum(-126);
        System.out.println("Right shift last value" +res);
    }
}

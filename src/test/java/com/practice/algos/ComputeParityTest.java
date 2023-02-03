package com.practice.algos;

import org.junit.Test;

public class ComputeParityTest {
    @Test
    public void parityTest(){
        ComputeParity computeParity = new ComputeParity();
        short result = computeParity.parity(3);
        System.out.println("Final Result : " + result);
    }
}

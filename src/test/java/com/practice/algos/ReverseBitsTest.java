package com.practice.algos;

import org.junit.Test;

public class ReverseBitsTest {
    @Test
    public void reverseBitTest(){
        ReverseBits reverseBits = new ReverseBits();
        int rev = reverseBits.revBits(00000000000000000000000000000011);
        System.out.println("reversed : " + rev);
    }
}

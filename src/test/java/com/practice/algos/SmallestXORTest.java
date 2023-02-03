package com.practice.algos;

import com.practice.objects.SmallerAndGreater;
import org.junit.Test;

public class SmallestXORTest {
    @Test
    public void testSmallestXOR(){
        SmallestXOR smallestXOR = new SmallestXOR();
        int output = smallestXOR.solve(1,0);
        System.out.println("output : " + output);
    }
}

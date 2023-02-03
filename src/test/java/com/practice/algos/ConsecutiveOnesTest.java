package com.practice.algos;

import org.junit.Test;

public class ConsecutiveOnesTest {
    @Test
    public void testConsecutiveOnes(){
        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();
        int maxLen = consecutiveOnes.solve("11010110000000000");
        System.out.println("Longest length of Consecutive ones : " + maxLen);
    }
}
